package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import po.User;
import service.LoginService;
import util.ChangeCharset;
import util.DataConstant;
import util.Utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by ideapad on 5/6/2017.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/loginCheck", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String loginCheck(HttpServletRequest request, Model model, HttpSession session) throws Exception {
        String userid = request.getParameter("userid");
        String pwd = request.getParameter("pwd");
        String permission = request.getParameter("permission");
        User user = loginService.selectByUserId(userid);

        //从管理员页面登陆
        if (DataConstant.ADMIN_ROLE.equals(permission)) {
            //判断用户名查出的对象是否为空,为空则用户不存在
            if (!Utils.isNullOrEmpty(user)) {
                //判断密码是否正确
                if (user.getPwd().equals(pwd)) {
                    //判断是否从管理员通道登陆
                    if (DataConstant.ADMIN_ROLE.equals(user.getPermission())) {
                        session.setAttribute("user", user);
                        return DataConstant.LOGIN_SUCCESS;
                    } else {
                        return DataConstant.NOT_ADMIN;
                    }
                } else {
                    return DataConstant.WRONG_PASSWORD;
                }
            } else {
                return DataConstant.NO_EXIST_USER;
            }
        } else {
            if (!Utils.isNullOrEmpty(user)) {
                if (user.getPwd().equals(pwd)) {
                    if (DataConstant.USER_ROLE.equals(user.getPermission())) {
                        session.setAttribute("user", user);
                        model.addAttribute("loginMessage", DataConstant.LOGIN_SUCCESS);
                        return "administrator";
                    } else {
                        model.addAttribute("loginMessage", DataConstant.NOT_USER);
                        return "redirect:/administrator";
                    }
                } else {
                    model.addAttribute("loginMessage", DataConstant.WRONG_PASSWORD);
                    return "redirect:/user";
                }
            } else {
                model.addAttribute("loginMessage", DataConstant.NO_EXIST_USER);
                return "redirect:/user";
            }
        }
    }
}

package controller;

import controller.validation.ValidGroup1;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import po.User;

import java.util.List;

/**
 * Created by ideapad on 5/8/2017.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    public static final Logger logger = Logger
            .getLogger(UserController.class);

    //在需要校验的poji前面添加@Validated,在需要校验的pojo后面添加BindingResult bindingResult来接收校验出错的信息
    @RequestMapping(value = "/addUser")
    public String addUser(@Validated(value = {ValidGroup1.class}) User user, BindingResult bindingResult) {
        //获取校验的错误信息
        if (bindingResult.hasErrors()) {
            //输出错误信息
            List<ObjectError> errors = bindingResult.getAllErrors();
            for (ObjectError error : errors) {
                logger.info(error.getDefaultMessage());
            }
        }
        return "";
    }
}

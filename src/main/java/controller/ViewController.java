package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ideapad on 5/5/2017.
 */
@Controller
public class ViewController {

    @RequestMapping(value = "/")
    public String index() {
        return "index/index";
    }

    @RequestMapping(value = "/loginUser")
    public String user() {
        return "staticweb/login_user/login_user";
    }

    @RequestMapping(value = "/loginAdministrator")
    public String administrator() {
        return "staticweb/login_admin/login_admin";
    }

    @RequestMapping(value = "/success")
    public String success() {
        return "staticweb/notice/success";
    }

    @RequestMapping(value = "/error")
    public String error() {
        return "staticweb/notice/error";
    }

}

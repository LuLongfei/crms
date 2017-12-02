package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLongfei
 */
@Controller
public class AccountController {

    @RequestMapping(name = "/me", method = RequestMethod.GET)
    public String selectMe() {
        return "";
    }

    @RequestMapping(name = "/me", method = RequestMethod.PUT)
    public String updateMe() {
        return "";
    }

    @RequestMapping(name = "/signin", method = RequestMethod.GET)
    public String signIn() {
        return "";
    }
}

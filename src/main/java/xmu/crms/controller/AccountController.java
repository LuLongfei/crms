package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuLongfei
 */
@RestController
public class AccountController {

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public String selectMe() {
        return "";
    }

    @RequestMapping(value = "/me", method = RequestMethod.PUT)
    public String updateMe() {
        return "";
    }

//    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
//    public String signIn() {
//        return "";
//    }
}

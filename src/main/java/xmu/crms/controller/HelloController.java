package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/das")
public class HelloController {

    @RequestMapping(value = "/{os}/hello",method = RequestMethod.GET)
    public String hello(@PathVariable("os") int os, Model model) {
        model.addAttribute("message", "hello");
        return "hello";
    }

    @RequestMapping(value = "/{os}/frame", method = RequestMethod.GET)
    public String frame(@PathVariable("os") int os, Model model)
    {
        model.addAttribute("message", "hello");
        return "frame";
    }
}
package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LuLongfei
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "hello");
        return "hello";
    }

    @RequestMapping("/home")
    public String frame(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
            // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/homePage";
    }

    @RequestMapping("/home/grade")
    public String grade(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/grade";
    }

    @RequestMapping("/home/classInfo")
    public String classInfo(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/classInfo";
    }

    @RequestMapping("/home/createClass")
    public String createClass(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createClass";
    }

    @RequestMapping("/home/createTopic")
    public String createTopic(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createTopic";
    }

    @RequestMapping("/home/createSeminar")
    public String createSeminar(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createSeminar";
    }

    @RequestMapping("/home/seminarInfo")
    public String seminarInfo(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/seminarInfo";
    }

    @RequestMapping("/home/topicInfo")
    public String topicInfo(Model model)
    {
        model.addAttribute("data", new String[] {"周三1-2节", "周三000-2节","周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/topicInfo";
    }



    @ResponseBody
    @RequestMapping("/homeAjax")
    public Object ajax(Model model) {
        return new Object() {
            public String[] classNames = new String[]{"周三1-2节", "周三000-2节", "周三1-20节"};
            public String[] seminarNames = new String[]{"周三1-2节", "周三000-2节", "周三1-20节"};
        };
    }
}
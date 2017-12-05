package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xmu.crms.vo.GradeVO;
import xmu.crms.vo.TopicVO;

import java.util.ArrayList;
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
    public String frame(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/homePage";
    }

    @RequestMapping("/home/grade")
    public String grade(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/grade";
    }

    @RequestMapping("/home/classInfo")
    public String classInfo(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/classInfo";
    }

    @RequestMapping("/home/createClass")
    public String createClass(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createClass";
    }

    @RequestMapping("/home/createTopic")
    public String createTopic(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createTopic";
    }

    @RequestMapping("/home/createSeminar")
    public String createSeminar(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/createSeminar";
    }

    @RequestMapping("/home/seminarInfo")
    public String seminarInfo(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/seminarInfo";
    }

    @RequestMapping("/home/topicInfo")
    public String topicInfo(Model model) {
        model.addAttribute("data", new String[]{"周三1-2节", "周三000-2节", "周三1-20节"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/teacher/course/topicInfo";
    }

    @RequestMapping("/student/course/home")
    public String stuhome(Model model) {
        model.addAttribute("data", new String[]{"讨论课1", "讨论课2", "讨论课3", "讨论课4"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/student/course/homePage";
    }

    @RequestMapping("/student/course/seminarInfo")
    public String stuSeminarInfo(Model model) {
        model.addAttribute("data", new String[]{"讨论课1", "讨论课2", "讨论课3", "讨论课4"});
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/student/course/seminarInfo";
    }

    @RequestMapping("/student/course/grade")
    public String stuGrade(Model model) {
        List<GradeVO> lists = new ArrayList<>();
        GradeVO one = new GradeVO(1, "未命名", "no", 5, 5, 5);
        GradeVO two = new GradeVO(2, "haha", "lala", 4, 4, 4);
        GradeVO three = new GradeVO(1, "haha", "lala", 3, 4, 3.8);
        lists.add(one);
        lists.add(two);
        lists.add(three);
        model.addAttribute("data", lists);
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/student/course/grade";
    }

    @RequestMapping("/student/course/group")
    public String stuGroup(Model model) {
        List<TopicVO> lists = new ArrayList<>();
        TopicVO topic = new TopicVO((long) 1, "A", "Domain Model", 5, 3);
        lists.add(topic);
        model.addAttribute("data", lists);
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/student/course/groupInfo";
    }

    @RequestMapping("/student")
    public String stu(Model model) {
        List<TopicVO> lists = new ArrayList<>();
        TopicVO topic = new TopicVO((long) 1, "A", "Domain Model", 5, 3);
        lists.add(topic);
        model.addAttribute("data", lists);
        // public String[] seminarNames = new String[] {"周三1-2节", "周三000-2节","周三1-20节"}
        return "/student/basicInfo";
    }
}



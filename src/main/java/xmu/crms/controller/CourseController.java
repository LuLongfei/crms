package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLongfei
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @RequestMapping(method = RequestMethod.GET)
    public String selectCourses() {

        this.selectCoursesForStudent();
        this.selectCoursesForTeacher();
        return "";
    }

    private String selectCoursesForTeacher() {

        return "";
    }

    private String selectCoursesForStudent() {

        return "";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createCourse() {

        return "";
    }

    @RequestMapping(name = "/{courseId}", method = RequestMethod.GET)
    public String selectCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}", method = RequestMethod.PUT)
    public String updateCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}", method = RequestMethod.DELETE)
    public String deleteCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}/class", method = RequestMethod.GET)
    public String selectClassesByCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}/class", method = RequestMethod.POST)
    public String createClassForCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}/seminar", method = RequestMethod.GET)
    public String selectSeminarsByCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

    @RequestMapping(name = "/{courseId}/class", method = RequestMethod.POST)
    public String createSeminarForCourse(@PathVariable("courseId") int courseId) {

        return "";
    }

}

package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.ClassVO;
import xmu.crms.vo.CourseVO;
import xmu.crms.vo.SeminarVO;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @RequestMapping(method = RequestMethod.GET)
    public Object selectCourses() {
        return new CourseVO[]{
                new CourseVO(1L, "OOAD", 3, 60, "2017-09-01", "2018-01-01"),
                new CourseVO(2L, "J2EE", 1, 60, "2017-09-01", "2018-01-01")
        };
    }

    private String selectCoursesForTeacher() {

        return "";
    }

    private String selectCoursesForStudent() {

        return "";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Object createCourse() {
        return new Object() {
            public Long id = 5L;
        };
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
    public Object selectCourse(@PathVariable("courseId") int courseId) {
        return new CourseVO(new Long(courseId), "OOAD", 3, 60, "2017-09-01", "2018-01-01");
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void updateCourse(@PathVariable("courseId") int courseId) {
        return;
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String deleteCourse(@PathVariable("courseId") int courseId) {
        return null;
    }

    @RequestMapping(value = "/{courseId}/class", method = RequestMethod.GET)
    public Object selectClassesByCourse(@PathVariable("courseId") int courseId) {

        return new ClassVO[]{
                new ClassVO(45L, "周三1-2节"),
                new ClassVO(48L, "周三3-4节")
        };
    }

    @RequestMapping(value = "/{courseId}/class", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createClassForCourse(@PathVariable("courseId") int courseId) {

        return new Object() {
            public Long id = 5L;
        };
    }

    @RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Object selectSeminarsByCourse(@PathVariable("courseId") int courseId) {

        return new SeminarVO[]{
                new SeminarVO(29L, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09"),
                new SeminarVO(32L, "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24")
        };
    }

    @RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createSeminarForCourse(@PathVariable("courseId") int courseId) {

        return new Object() {
            public Long id = 2L;
        };
    }

}

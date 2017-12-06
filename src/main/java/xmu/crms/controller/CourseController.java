package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.ClassVO;
import xmu.crms.vo.CourseVO;
import xmu.crms.vo.SeminarVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
@RestController
@RequestMapping(value = "/course")
public class    CourseController {

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
    @PutMapping()
    @ResponseStatus(value = HttpStatus.CREATED)
    public Object createCourse() {
        return new Object() {
            public Long id = 5L;
        };
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
    public Object selectCourse(@PathVariable("courseId") int courseId) {
        return new Object() {
            public Long id = 23L;
            public String name = "OOAD";
            public String description = "面向对象的分析与设计";
            public String teacherName = "邱明";
            public String teacherEmail = "mingqui@xmu.edu.cn";
        };
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
        SeminarVO seminarVO1 = new SeminarVO(29L, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09");
        SeminarVO seminarVO2 = new SeminarVO(32L, "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24");
        seminarVO1.setGrade(4);
        seminarVO2.setGrade(3);
        return new SeminarVO[]{seminarVO1, seminarVO2};
    }

    @RequestMapping(value = "/{courseId}/seminar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createSeminarForCourse(@PathVariable("courseId") int courseId) {

        return new Object() {
            public Long id = 2L;
        };
    }

    @RequestMapping(value = "/{courseId}/seminar/current", method = RequestMethod.GET)
    public Object selectCurrentSeminar(@PathVariable("courseId") int courseId) {

        SeminarVO seminarVO = new SeminarVO(29L, "界面原型设计", "OOAD", "fixed", "2017-09-25", "2017-10-09");
        List<ClassVO> classes = new ArrayList<>();
        classes.add(new ClassVO(53L, "周三12"));
        classes.add(new ClassVO(57L, "周三34"));
        seminarVO.setClasses(classes);
        return seminarVO;
    }

    @RequestMapping(value = "/{courseId}/grade", method = RequestMethod.GET)
    public Object selectSeminarsGrade(@PathVariable("courseId") int courseId) {
        class Tmp {
            public String seminarName;
            public String groupName;
            public String leaderName;
            public Integer presentationGrade;
            public Integer reportGrade;
            public Integer grade;

            public Tmp(String seminarName, String groupName, String leaderName, Integer presentationGrade, Integer reportGrade, Integer grade) {
                this.seminarName = seminarName;
                this.groupName = groupName;
                this.leaderName = leaderName;
                this.presentationGrade = presentationGrade;
                this.reportGrade = reportGrade;
                this.grade = grade;
            }
        }
        return new Tmp[]{
                new Tmp("需求分析", "3A2", "张三", 3, 4, 4),
                new Tmp("界面原型设计", "3A3", "张三", 4, 4, 4),
        };
    }
}

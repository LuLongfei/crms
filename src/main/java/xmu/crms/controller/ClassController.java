package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.ClassDO;
import xmu.crms.entity.Proportions;
import xmu.crms.entity.UserDO;
import xmu.crms.vo.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuLongfei
 * @date
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @RequestMapping(method = RequestMethod.GET)
    public Object selectClasses() {
        class Tmp{
            public Long id;
            public String name;
            public Integer numStudent;
            public String time;
            public String site;
            public String courseName;
            public  String courseTeacher;

            public Tmp(Long id, String name, Integer numStudent, String time, String site, String courseName, String courseTeacher) {
                this.id = id;
                this.name = name;
                this.numStudent = numStudent;
                this.time = time;
                this.site = site;
                this.courseName = courseName;
                this.courseTeacher = courseTeacher;
            }
        }
        return new Tmp[]{
                new Tmp(23L, "周三1-2节", 60, "周三1-2、周五1-2","公寓405", "OOAD","邱明"),
                new Tmp(42L, "一班", 60, "周三3-4","公寓405", ".NET","杨律青"),
        };
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.GET)
    public Object selectClass(@PathVariable("classId") int classId) {
        Proportions proportions = new Proportions(20, 60, 20, 50, 50);
        ClassDetailVO classDetailVO = new ClassDetailVO(23L, "周三1-2节", "周三一二节", "海韵201",
                -1,"/roster/a.html",30, proportions);
        return classDetailVO;
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object updateClass(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object deleteClass(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.GET)
    public Object getStudents(@PathVariable("classId") int classId) {
        return new StudentSimpleVO[]{
                new StudentSimpleVO(233L,"张三","24245151329"),
                new StudentSimpleVO(233L,"张四","24325451421"),
                new StudentSimpleVO(233L,"张唔","24345615121"),
                new StudentSimpleVO(233L,"张六","24325151521")
        };
    }

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object enroll(@PathVariable("classId") int classId) {
        return new Object() {
            public String url = "/class/34/student/2757";
        };
    }

    @RequestMapping(value = "/{classId}/student/{studentId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object dropClass(@PathVariable("classId") int classId) {

        return null;
    }


    @RequestMapping(value = "/{classId}/classgroup", method = RequestMethod.GET)
    public Object selectClassGroup(@PathVariable("classId") int classId) {

        GroupVO groupVO = new GroupVO();
        groupVO.setId(28L);
        groupVO.setLeader(new UserDO(8888L,"23320152202333","张三"));
        List<UserDO> members = new ArrayList<>();
        members.add(new UserDO(2756L,"23320152202443", "李四"));
        members.add(new UserDO(2777L,"23320152202443","王五"));
        groupVO.setMembers(members);
        return groupVO;
    }

    @RequestMapping(value = "/{classId}/classgroup/resign", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String groupLeaderResign(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/assign", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String groupMemberAssign(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/add", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String addGroupMember(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}/classgroup/remove", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removeGroupMember(@PathVariable("classId") int classId) {

        return null;
    }
}

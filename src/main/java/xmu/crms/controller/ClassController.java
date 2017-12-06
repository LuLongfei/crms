package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.ClassDO;
import xmu.crms.entity.Proportions;
import xmu.crms.vo.ClassShowCourseVO;
import xmu.crms.vo.ClassShowVO;

/**
 * @author LuLongfei
 * @date
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @RequestMapping(method = RequestMethod.GET)
    public Object selectClasses() {

        return new ClassShowVO[]{
                new ClassShowVO(23L, "周三1-2节", "邱明", "公寓405", new ClassShowCourseVO(2L, "OOAD", 6)),
                new ClassShowVO(42L, "一班", "邱明", "海韵202", new ClassShowCourseVO(5L, ".NET 平台开发", 2))
        };
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.GET)
    public Object selectClass(@PathVariable("classId") int classId) {
        Proportions proportions = new Proportions(20, 60, 20, 50, 50);
        ClassDO classDO = new ClassDO(23L, "周三1-2节", "周三一二节", "海韵201", proportions);
        return classDO;
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

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object enroll(@PathVariable("classId") int classId) {
        return new Object() {
            public Long id = 123L;
        };
    }

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object dropClass(@PathVariable("classId") int classId) {

        return null;
    }

    @RequestMapping(value = "/{classId}/attendance", method = RequestMethod.GET)
    public String selectAttendance(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/classgroup", method = RequestMethod.GET)
    public Object selectClassGroup(@PathVariable("classId") int classId) {

//        GroupVO groupVO = new GroupVO();
//        groupVO.setId(28L);
//        groupVO.setLeader(new UserDO(8888L,"23320152202333","张三"));
//        List<UserDO> members = new ArrayList<>();
//        members.add(new UserDO(2756L,"23320152202443", "李四"));
//        members.add(new UserDO(2777L,"23320152202443","王五"));
//        groupVO.setMembers(members);
//        return groupVO;
        return null;
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

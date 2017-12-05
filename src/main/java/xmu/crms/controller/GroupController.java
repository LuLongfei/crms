package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.UserDO;
import xmu.crms.vo.GroupVO;
import xmu.crms.vo.TopicVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/group")
public class GroupController {

    @RequestMapping(value = "/{groupId}", method = RequestMethod.GET)
    public Object selectGroup(@PathVariable("groupId") int groupId) {
        UserDO leader = new UserDO(888L, "张三");
        UserDO member1 = new UserDO(999L, "李四");
        UserDO member2 = new UserDO(9990L, "王五");
        List<UserDO> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        TopicVO topic = new TopicVO((long) 1, "A", "Domain Model", 5, 3);
        GroupVO group = new GroupVO((long) 3, leader, members, topic, "report");

        return group;
    }

    @RequestMapping(value = "/{groupId}/resign", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object leaderResign(@PathVariable("groupId") int groupId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/assign", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object memberAssign(@PathVariable("groupId") int groupId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/add", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object addMember(@PathVariable("groupId") int groupId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/remove", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object removeMember(@PathVariable("groupId") int groupId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/topic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object selectTopicForGroup(@PathVariable("groupId") int groupId) {
        return new Object() {
            public Long id = 247L;
        };
    }

    @RequestMapping(value = "/{groupId}/topic/{topicId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object dropTopicForGroup(@PathVariable("groupId") int groupId,
                                    @PathVariable("topicId") int topicId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/grade", method = RequestMethod.GET)
    public Object selectGroupGrade(@PathVariable("groupId") int groupId) {
        class PreGrade {
            public Long id;
            public Integer grade;

            public PreGrade(Long id, Integer grade) {
                this.id = id;
                this.grade = grade;
            }
        }
        return new Object(){
            public PreGrade[] presentationGrade = new PreGrade[] {
                    new PreGrade(257L,4), new PreGrade(258L,5)
            };
            public Integer reportGrade = 3;
            public Integer grade = 4;
         };
    }

    @RequestMapping(value = "/{groupId}/grade/report", method = RequestMethod.PUT)
    public Object updateGroupReportGrade(@PathVariable("groupId") int groupId) {
        return null;
    }

    @RequestMapping(value = "/{groupId}/grade/presentation/{studentId}", method = RequestMethod.PUT)
    public Object updateGroupPresentationGrade(@PathVariable("groupId") int groupId) {
        return null;
    }

}

package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.UserDO;
import xmu.crms.vo.GroupVO;
import xmu.crms.vo.SeminarVO;
import xmu.crms.vo.TopicVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/seminar")
public class SeminarController {

    @RequestMapping(value = "/{seminarId}", method = RequestMethod.GET)
    public Object selectSeminar(@PathVariable("seminarId") int seminarId) {
        return new SeminarVO(29L, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09");
    }

    @RequestMapping(value = "/{seminarId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object updateSeminar(@PathVariable("seminarId") int seminarId) {
        return null;
    }

    @RequestMapping(value = "/{seminarId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object deleteSeminar(@PathVariable("seminarId") int seminarId) {
        return null;
    }

    @RequestMapping(value = "/{seminarId}/my", method = RequestMethod.GET)
    public Object myInfoForSeminar(@PathVariable("seminarId") int seminarId) {
        return new Object() {
            public Long id = 32L;
            public String name = "概要设计";
            public String groupingMethod = "random";
            public String courseName = "OOAD";
            public String startTime = "2017-10-11";
            public String endTime = "2017-10-24";
            public Integer classCalling = 23;
            public boolean isLeader = true;
            public boolean areTopicSelected = true;
        };
    }

    @RequestMapping(value = "/{seminarId}/detail", method = RequestMethod.GET)
    public Object seminarDetail(@PathVariable("seminarId") int seminarId) {
        return new Object() {
            public Long id = 32L;
            public String name = "概要设计";
            public String startTime = "2017-10-11";
            public String endTime = "2017-10-24";
            public String site = "海韵201";
            public String teacherName = "邱明";
            public String teacherEmail = "mingqiu@xmu.edu.cn";
        };
    }

    @RequestMapping(value = "/{seminarId}/topic", method = RequestMethod.GET)
    public Object selectTopics(@PathVariable("seminarId") int seminarId) {
        TopicVO vo = new TopicVO(257L, "领域模型与模块划分", "Domain model与模块划分", 5, 2);
        vo.setSerial("A");
        return new TopicVO[]{
                vo
        };
    }

    @RequestMapping(value = "/{seminarId}/topic", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Object createTopic(@PathVariable("seminarId") int seminarId) {
        return null;
    }

    @RequestMapping(value = "/{seminarId}/group", method = RequestMethod.GET)
    public Object selectGroups(@PathVariable("seminarId") int seminarId) {
        class Tmp {
            public Long id;
            public String name;
            public TopicVO[] topics;

            public Tmp(Long id, String name, TopicVO[] topics) {
                this.id = id;
                this.name = name;
                this.topics = topics;
            }
        }
        return new Tmp[]{
                new Tmp(28L, "1A1", new TopicVO[]{new TopicVO(257L, "领域模型与模块")}),
                new Tmp(29L, "1A2", new TopicVO[]{new TopicVO(257L, "领域模型与模块")})
        };
    }

    @RequestMapping(value = "/{seminarId}/group/my", method = RequestMethod.GET)
    public Object selectMyGroup(@PathVariable("seminarId") int seminarId) {
        UserDO leader = new UserDO(888L, "张三");
        UserDO member1 = new UserDO(999L, "李四");
        UserDO member2 = new UserDO(9990L, "王五");
        List<UserDO> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        TopicVO topic = new TopicVO(1L, "A", "Domain Model", 5, 3);
        GroupVO group = new GroupVO(3L, "1A1", leader, members, topic, "report");

        return group;
    }


}

package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLongfei
 */
@Controller
@RequestMapping("/group")
public class GroupController {

    @RequestMapping(name = "/{groupId}", method = RequestMethod.GET)
    public String selectGroup(@PathVariable("groupId") int groupId) {
        return "";
    }

    @RequestMapping(name = "/{groupId}", method = RequestMethod.PUT)
    public String updateGroup(@PathVariable("groupId") int groupId) {
        return "";
    }

    @RequestMapping(name = "/{groupId}/topic", method = RequestMethod.POST)
    public String selectTopicForGroup(@PathVariable("groupId") int groupId) {
        return "";
    }

    @RequestMapping(name = "/{groupId}/topic/{topicId}", method = RequestMethod.DELETE)
    public String dropTopicForGroup(@PathVariable("groupId") int groupId,
                              @PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(name = "/{groupId}/grade", method = RequestMethod.GET)
    public String selectGroupGrade(@PathVariable("groupId") int groupId) {
        return "";
    }

    @RequestMapping(name = "/{groupId}/grade", method = RequestMethod.PUT)
    public String updateGroupGrade(@PathVariable("groupId") int groupId) {
        return "";
    }

}

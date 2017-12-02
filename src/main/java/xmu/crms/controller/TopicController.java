package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    @RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
    public String selectTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(value = "/{topicId}", method = RequestMethod.PUT)
    public String updateTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(value = "/{topicId}", method = RequestMethod.DELETE)
    public String deleteTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(value = "/{topicId}/group", method = RequestMethod.GET)
    public String selectGroupsForTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

}

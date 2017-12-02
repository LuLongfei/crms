package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLongfei
 */
@Controller
@RequestMapping("/topic")
public class TopicController {

    @RequestMapping(name = "/{topicId}", method = RequestMethod.GET)
    public String selectTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(name = "/{topicId}", method = RequestMethod.PUT)
    public String updateTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(name = "/{topicId}", method = RequestMethod.DELETE)
    public String deleteTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

    @RequestMapping(name = "/{topicId}/group", method = RequestMethod.GET)
    public String selectGroupsForTopic(@PathVariable("topicId") int topicId) {
        return "";
    }

}

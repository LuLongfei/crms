package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xmu.crms.vo.TopicVO;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

    @RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
    public Object selectTopic(@PathVariable("topicId") int topicId) {
        return new TopicVO(257L, "领域模型与模块划分", "Domain model与模块划分", 5, 2,"A",5);
    }

    @RequestMapping(value = "/{topicId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object updateTopic(@PathVariable("topicId") int topicId) {
        return null;
    }

    @RequestMapping(value = "/{topicId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object deleteTopic(@PathVariable("topicId") int topicId) {
        return null;
    }

    @RequestMapping(value = "/{topicId}/group", method = RequestMethod.GET)
    public Object selectGroupsForTopic(@PathVariable("topicId") int topicId) {
        class Tmp{
            public Long id;
            public String name;

            public Tmp(Long id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        return new Tmp[]{
                new Tmp(23L,"1A1"), new Tmp(26L,"1A2")
        };
    }

}

package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author LuLongfei
 */
@Controller
@RequestMapping("/seminar")
public class SeminarController {

    @RequestMapping(name = "/{seminarId}", method = RequestMethod.GET)
    public String selectSeminar(@PathVariable("seminarId") int seminarId) {
        return "";
    }

    @RequestMapping(name = "/{seminarId}", method = RequestMethod.PUT)
    public String updateSeminar(@PathVariable("seminarId") int seminarId) {
        return "";
    }
    @RequestMapping(name = "/{seminarId}", method = RequestMethod.DELETE)
    public String deleteSeminar(@PathVariable("seminarId") int seminarId) {
        return "";
    }

    @RequestMapping(name = "/{seminarId}/topic", method = RequestMethod.GET)
    public String selectTopics(@PathVariable("seminarId") int seminarId) {
        return "";
    }
    @RequestMapping(name = "/{seminarId}/topic", method = RequestMethod.POST)
    public String createTopic(@PathVariable("seminarId") int seminarId) {
        return "";
    }
    @RequestMapping(name = "/{seminarId}/group", method = RequestMethod.GET)
    public String selectGroups(@PathVariable("seminarId") int seminarId) {
        return "";
    }
}

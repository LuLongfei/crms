package xmu.crms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuLongfei
 * @date
 */
@RestController
@RequestMapping("/class")
public class ClassController {

    @RequestMapping(method = RequestMethod.GET)
    public String a(){
        return "";
    }
    @RequestMapping(value = "/{classId}", method = RequestMethod.GET)
    public String selectClass(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.PUT)
    public String updateClass(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}", method = RequestMethod.DELETE)
    public String deleteClass(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.POST)
    public String enroll(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/student", method = RequestMethod.DELETE)
    public String dropClass(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/attendance", method = RequestMethod.GET)
    public String selectAttendance(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/classgroup", method = RequestMethod.GET)
    public String selectClassGroup(@PathVariable("classId") int classId) {

        return "";
    }

    @RequestMapping(value = "/{classId}/classgroup", method = RequestMethod.PUT)
    public String updateClassGroup(@PathVariable("classId") int classId) {

        return "";
    }
}

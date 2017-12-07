package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import xmu.crms.entity.SchoolDO;
import xmu.crms.entity.UserDO;

/**
 * @author LuLongfei
 */
@RestController
public class AccountController {


    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public Object selectMe() {
        SchoolDO school = new SchoolDO(1L, "厦门市人民公园", "胡建省", "厦门市");
        UserDO user = new UserDO(1L, "teacher", "22222", "没有名字",
                "12345678978", "123@aa.cc", "/asd/asdsd", UserDO.Gender.MALE, school);
        user.setTitle("本科");
        return user;
    }

    @RequestMapping(value = "/me", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object updateMe() {
        return null;
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public Object signIn(String type) {
        return new Object() {
            public String type = "student";
            public String name = "123456";
            public String jwt = "csdliufhs0=fads-fsafdasd-f=";
            public Long id =2156L;
        };
    }
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public Object signInGET(String type) {
        return new Object() {
            public String type = "student";
            public String name = "123456";
            public String jwt = "csdliufhs0=fads-fsafdasd-f=";
            public Long id =2156L;
        };
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(String type) {
        return new Object() {
            public String type = "student";
            public String name = "123456";
            public String jwt = "csdliufhs0=fads-fsafdasd-f=";
            public Long id =2156L;
        };
    }
}

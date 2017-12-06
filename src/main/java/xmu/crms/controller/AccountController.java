package xmu.crms.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

//    @Autowired
    public Database database = new Database();

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public Object selectMe() {
        return database.user;
    }

    @RequestMapping(value = "/me", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object updateMe() {
        return null;
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public Object signIn(String type) {
        database.school = new SchoolDO(1L, "厦门市人民公园", "胡建省", "厦门市");
        database.user = new UserDO(1L, "teacher", "22222", "没有名字",
                "12345678978", "123@aa.cc", null, UserDO.Gender.MALE, database.school);
        return null;
    }

}

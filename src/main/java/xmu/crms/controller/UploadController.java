package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostMapping("/avatar")
    @ResponseStatus(HttpStatus.CREATED)
    public Object uploadAvatar() {
        return new Object() {
            public String url = "/avatar/3486.png";
        };
    }
}

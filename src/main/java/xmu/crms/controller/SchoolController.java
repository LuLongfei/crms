package xmu.crms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import xmu.crms.entity.SchoolDO;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/school")
public class SchoolController {

    @GetMapping("/province")
    public Object selectAllProvinces() {

        return new String[]{"北京", "上海", "福建", "河北"};
    }

    @GetMapping("/city")
    public Object selectCities() {
        return new String[]{"厦门", "福州", "泉州", "漳州", "莆田"};
    }

    public String selectAllCitiesByProvince() {

        return "";
    }

    @GetMapping
    public Object selectSchools() {
        return new SchoolDO[]{
                new SchoolDO(32L, "厦门大学", "福建", "厦门"),
                new SchoolDO(37L, "厦门软件学院", "福建", "厦门")
        };
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Object createSchool() {
        return null;
    }
}

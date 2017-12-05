package xmu.crms.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import xmu.crms.vo.AttendanceVO;
import xmu.crms.vo.StudentSimpleVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LuLongfei
 */
@RestController
@RequestMapping("/seminar/{seminarId}/class/{classId}/attendance")
public class AttendanceController {

    @GetMapping
    public Object getAttendanceStatus() {
        return new AttendanceVO("calling", "grouping",40,60);
    }

    @GetMapping("/present")
    public Object getPresentList() {
        List<StudentSimpleVO> students = new ArrayList<>();
        students.add(new StudentSimpleVO(2357L, "张三"));
        students.add(new StudentSimpleVO(8232L, "李四"));

        return students;
    }

    @GetMapping("/late")
    public Object getLateList() {
        List<StudentSimpleVO> students = new ArrayList<>();
        students.add(new StudentSimpleVO(3412L, "王五"));
        students.add(new StudentSimpleVO(5234L, "赵六"));
        return students;
    }

    @GetMapping("/absent")
    public Object getAbsentList() {
        List<StudentSimpleVO> students = new ArrayList<>();
        students.add(new StudentSimpleVO(3412L, "刘五"));
        return students;
    }

    @PutMapping("/{studentId}")
    public Object sign() {
        return new Object() {
            public String status = "late";
        };
    }
}

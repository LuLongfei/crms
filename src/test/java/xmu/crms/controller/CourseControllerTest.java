package xmu.crms.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
public class CourseControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void selectCourses() throws Exception {
        mvc
                .perform(get("/course"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andExpect(jsonPath("$[0].numClass").isNumber())
                .andExpect(jsonPath("$[0].numStudent").isNumber())
                .andExpect(jsonPath("$[0].startTime").isString())
                .andExpect(jsonPath("$[0].endTime").isString())
                .andDo(print());
    }

    @Test
    public void createCourse() throws Exception {
        mvc
                .perform(post("/course")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"name\": \"OOAD\", \"description\": \"面向对象分析与设计\", \"startTime\": \"2017-09-20\", \"endTime\": \"2018-1-31\", \"proportions\": {\"report\": 50, \"presentation\": 50, \"3\": 20, \"4\": 60, \"5\": 20 }}".getBytes()))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNumber())
                .andDo(print());
    }

    @Test
    public void selectCourse() throws Exception {
        Long courseId = 5L;
        mvc
                .perform(get("/course/{courseId}", courseId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").isNumber())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.numClass").isNumber())
                .andExpect(jsonPath("$.numStudent").isNumber())
                .andExpect(jsonPath("$.startTime").isString())
                .andExpect(jsonPath("$.endTime").isString())
                .andDo(print());
    }

    @Test
    public void updateCourse() throws Exception {
        mvc
                .perform(put("/course/{courseId}", 1)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"name\": \"OOAD\", \"description\": \"面向对象分析与设计\", \"startTime\": \"2017-09-20\", \"endTime\": \"2018-1-1\", \"proportions\": {\"report\": 70, \"presentation\": 30, \"3\": 20, \"4\": 60, \"5\": 20 }}".getBytes())
                )
                .andExpect(status().isNoContent())
                .andDo(print());
    }

    @Test
    public void deleteCourse() throws Exception {
        mvc
                .perform(delete("/course/{courseId}", 1))
                .andExpect(status().isNoContent())
                .andDo(print());
    }

    @Test
    public void selectClassesByCourse() throws Exception {
        mvc
                .perform(get("/course/{courseId}/class", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andDo(print());
    }

    @Test
    public void createClassForCourse() throws Exception {
        mvc
                .perform(post("/course/{courseId}/class", 1)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("\"name\": \"周三1-2节\", \"site\": \"海韵212\",\"time\": [{ \"week\": 1, \"day\": 1, \"time\": [1,2]}, {\"week\": 0, \"day\": 3, \"time\": [3,4]}], \"proportions\": {\"report\": 50, \"presentation\": 50, \"3\": 10, \"4\": 60, \"5\": 30 }}".getBytes()))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNumber())
                .andDo(print());
    }

    @Test
    public void selectSeminarsByCourse() throws Exception {
        mvc
                .perform(get("/course/{courseId}/seminar", 1))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$[0]").exists())
                .andExpect(jsonPath("$[0].id").isNumber())
                .andExpect(jsonPath("$[0].name").isString())
                .andExpect(jsonPath("$[0].description").isString())
                .andExpect(jsonPath("$[0].groupingMethod").isString())
                .andExpect(jsonPath("$[0].startTime").isString())
                .andExpect(jsonPath("$[0].endTime").isString())
                .andDo(print());
    }

    @Test
    public void createSeminarForCourse() throws Exception {
        mvc
                .perform(post("/course/{courseId}/seminar", 1)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"name\": \"概要设计\", \"description\": \"模型层与数据库设计\", \"groupingMethod\": \"fixed\", \"startTime\": \"2017-10-10\", \"endTime\": \"2017-10-24\", \"proportions\": {\"report\": 50, \"presentation\": 50, \"3\": 20, \"4\": 60, \"5\": 20 }}".getBytes()))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").isNumber())
                .andDo(print());
    }

}
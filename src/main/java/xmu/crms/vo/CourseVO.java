package xmu.crms.vo;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParser;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
public class CourseVO {
    private Long id;
    private String name;
    private Integer numClass;
    private Integer numStudent;
    private String startTime;
    private String endTime;


    public CourseVO(Long id, String name, Integer numClass, Integer numStudent, String startTime, String endTime) {
        this.id = id;
        this.name = name;
        this.numClass = numClass;
        this.numStudent = numStudent;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "CourseVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numClass=" + numClass +
                ", numStudent=" + numStudent +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumClass() {
        return numClass;
    }

    public void setNumClass(Integer numClass) {
        this.numClass = numClass;
    }

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

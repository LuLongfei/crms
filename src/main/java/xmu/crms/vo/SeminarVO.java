package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeminarVO {

    private Long id;
    private String name;
    private String description;
    private String groupingMethod;
    private String startTime;
    private String endTime;
    private Integer grade;
    private List<ClassVO> classes;


    public SeminarVO(Long id, String name, String description, String groupingMethod, String startTime, String endTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupingMethod = groupingMethod;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "SeminarVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupingMethod='" + groupingMethod + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", grade=" + grade +
                ", classes=" + classes +
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
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

    public List<ClassVO> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassVO> classes) {
        this.classes = classes;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}

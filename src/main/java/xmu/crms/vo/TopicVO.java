package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopicVO {

    private Long id;
    private String name;
    private String description;
    private Integer groupLimit;
    private Integer groupLeft;

    public TopicVO(Long id, String name, String description, Integer groupLimit, Integer groupLeft) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupLimit = groupLimit;
        this.groupLeft = groupLeft;
    }

    public TopicVO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "TopicVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupLimit=" + groupLimit +
                ", groupLeft=" + groupLeft +
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

    public Integer getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(Integer groupLimit) {
        this.groupLimit = groupLimit;
    }

    public Integer getGroupLeft() {
        return groupLeft;
    }

    public void setGroupLeft(Integer groupLeft) {
        this.groupLeft = groupLeft;
    }
}

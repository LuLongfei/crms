package xmu.crms.entity;

/**
 * @author LuLongfei
 * @date 2017-12-4
 */
public class TopicDO {
    private Long id;
    private String name;
    private String description;
    private Integer groupLimit;
    private String groupingMethod;

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

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
    }

    public TopicDO(Long id, String name, String description, Integer groupLimit, String groupingMethod) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupLimit = groupLimit;
        this.groupingMethod = groupingMethod;
    }

    @Override
    public String toString() {
        return "TopicDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupLimit=" + groupLimit +
                ", groupingMethod='" + groupingMethod + '\'' +
                '}';
    }
}

package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import xmu.crms.entity.UserDO;

import java.util.List;

/**
 * @author LuLongfei
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupVO {
    private Long id;
    private String name;
    private UserDO leader;
    private List<UserDO> members;
    private TopicVO topic;
    private String report;

    public GroupVO() {
    }

    @Override
    public String toString() {
        return "GroupVO{" +
                "id=" + id +
                ", leader=" + leader +
                ", members=" + members +
                ", topic=" + topic +
                ", report='" + report + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDO getLeader() {
        return leader;
    }

    public void setLeader(UserDO leader) {
        this.leader = leader;
    }

    public List<UserDO> getMembers() {
        return members;
    }

    public void setMembers(List<UserDO> members) {
        this.members = members;
    }

    public TopicVO getTopic() {
        return topic;
    }

    public void setTopic(TopicVO topic) {
        this.topic = topic;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupVO(Long id, UserDO leader, List<UserDO> members, TopicVO topic, String report) {
        this.id = id;
        this.leader = leader;
        this.members = members;
        this.topic = topic;
        this.report = report;
    }

    public GroupVO(Long id, String name, UserDO leader, List<UserDO> members, TopicVO topic, String report) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.members = members;
        this.topic = topic;
        this.report = report;
    }
}

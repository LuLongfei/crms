package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import xmu.crms.entity.Proportions;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassDetailVO {
    private Long id;
    private String name;
    private String time;
    private String site;
    private Integer calling;
    private String roster;
    private Integer numStudent;
    private Proportions proportions;

    public ClassDetailVO() {
    }

    public ClassDetailVO(Long id, String name, String time, String site, Integer calling, String roster, Integer numStudent, Proportions proportions) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.site = site;
        this.calling = calling;
        this.roster = roster;
        this.numStudent = numStudent;
        this.proportions = proportions;
    }

    @Override
    public String toString() {
        return "ClassDetailVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", site='" + site + '\'' +
                ", calling=" + calling +
                ", roster='" + roster + '\'' +
                ", numStudent=" + numStudent +
                ", proportions=" + proportions +
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getCalling() {
        return calling;
    }

    public void setCalling(Integer calling) {
        this.calling = calling;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }

    public Proportions getProportions() {
        return proportions;
    }

    public void setProportions(Proportions proportions) {
        this.proportions = proportions;
    }
}

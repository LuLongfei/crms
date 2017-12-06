package xmu.crms.vo;

public class AttendanceVO {
    private String status;
    private String group;
    private Integer numPresent;
    private Integer numStudent;

    public AttendanceVO(String status, String group, Integer numPresent, Integer numStudent) {
        this.status = status;
        this.group = group;
        this.numPresent = numPresent;
        this.numStudent = numStudent;
    }

    @Override
    public String toString() {
        return "AttendanceVO{" +
                "status='" + status + '\'' +
                ", group='" + group + '\'' +
                ", numPresent=" + numPresent +
                ", numStudent=" + numStudent +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getNumPresent() {
        return numPresent;
    }

    public void setNumPresent(Integer numPresent) {
        this.numPresent = numPresent;
    }

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }
}

package xmu.crms.vo;

/**
 * @author LuLongfei
 * @date 2017-12-3
 */
public class ClassShowVO {

    private Long id;
    private String name;
    private String teacher;
    private String site;
    private ClassShowCourseVO course;

    public ClassShowVO(Long id, String name, String teacher, String site, ClassShowCourseVO course) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.site = site;
        this.course = course;
    }

    @Override
    public String toString() {
        return "ClassShowVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher'" + teacher + '\''+
                ", site='" + site + '\'' +
                ", course=" + course +
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

    public void setTeacher(String teacher) { this.teacher = teacher; }

    public String getTeacher() { return teacher; }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public ClassShowCourseVO getCourse() {
        return course;
    }

    public void setCourse(ClassShowCourseVO course) {
        this.course = course;
    }
}

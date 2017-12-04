package xmu.crms.vo;

/**
 * @author uLongfei
 * @date 2017-12-3
 */
public class ClassShowCourseVO {

    private Long id;
    private String name;
    private Integer lessonsPerWeek;

    public ClassShowCourseVO(Long id, String name, Integer lessonsPerWeek) {
        this.id = id;
        this.name = name;
        this.lessonsPerWeek = lessonsPerWeek;
    }

    @Override
    public String toString() {
        return "ClassShowCourseVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lessonsPerWeek=" + lessonsPerWeek +
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

    public Integer getLessonsPerWeek() {
        return lessonsPerWeek;
    }

    public void setLessonsPerWeek(Integer lessonsPerWeek) {
        this.lessonsPerWeek = lessonsPerWeek;
    }
}

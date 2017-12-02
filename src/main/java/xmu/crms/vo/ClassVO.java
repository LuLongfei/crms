package xmu.crms.vo;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
public class ClassVO {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return "ClassVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
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

    public ClassVO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

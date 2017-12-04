package xmu.crms.entity;


/**
 * @author LuLongfei
 * @date 2017-12-4
 */
public class ClassDO {
    private Long id;
    private String name;
    private String time;
    private String site;
    private Proportions proportions;

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

    public Proportions getProportions() {
        return proportions;
    }

    public void setProportions(Proportions proportions) {
        this.proportions = proportions;
    }

    public ClassDO(Long id, String name, String time, String site, Proportions proportions) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.site = site;
        this.proportions = proportions;
    }

    @Override
    public String toString() {
        return "ClassDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", site='" + site + '\'' +
                ", proportions=" + proportions +
                '}';
    }
}

package xmu.crms.entity;

/**
 * @author LuLongfei
 * @date 2017-12-4
 */
public class SchoolDO {
    private Long id;
    private String name;
    private String province;
    private String city;

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SchoolDO(Long id, String name, String province, String city) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.city = city;
    }

    @Override
    public String toString() {
        return "SchoolDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

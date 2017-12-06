package xmu.crms.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentSimpleVO {
    private Long id;
    private String name;
    private String number;

    public StudentSimpleVO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentSimpleVO(Long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "StudentSimpleVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

package xmu.crms.entity;

/**
 * @author LuLongfei
 * @date 2017-12-4
 */
public class UserDO {
    public enum Gender{
        UNKNOWN(0, "unknown"),
        MALE(1, "male"),
        FEMALE(2, "female");

        private int value;
        private String description;

        Gender(int value, String description) {
            this.value = value;
            this.description = description;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    private Long id;
    private String type;
    private String number;
    private String name;
    private String phone;
    private String email;
    private String avatar;
    private Gender gender;
    private SchoolDO school;

    public UserDO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserDO(Long id, String number, String name) {
        this.id = id;
        this.number = number;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SchoolDO getSchool() {
        return school;
    }

    public void setSchool(SchoolDO school) {
        this.school = school;
    }

    public UserDO(Long id, String type, String number, String name, String phone, String email, String avatar, Gender gender, SchoolDO school) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.avatar = avatar;
        this.gender = gender;
        this.school = school;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", school=" + school +
                '}';
    }
}

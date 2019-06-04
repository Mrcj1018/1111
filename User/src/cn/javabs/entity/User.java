package cn.javabs.entity;
public class User {
    private Integer id;
    private  String username;
    private  String password;
    private  String sex;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {

        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

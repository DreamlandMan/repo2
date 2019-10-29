package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Elems {
    private Integer id;
    private Integer age;
    private String name;
    private Date birthday;
    private String sex;
    private String password;
    private String username;

    @Override
    public String toString() {
        return "Elems{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return new SimpleDateFormat("yyyy-MM-dd").format(birthday);
    }

    public void setBirthday(String birthday){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday=simpleDateFormat.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

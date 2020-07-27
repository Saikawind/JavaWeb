package Chapter04.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 用户实体类
 * @Author: Wang Shiyu
 * @Date: 2020/7/27/13:19
 */
public class User {
    private String name;
    private int age;
    private Date birthday;

    public User(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public User() {

    }

    // 逻辑视图
    public String getBitStr() {
        // 格式化日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 返回字符串即可
        return sdf.format(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

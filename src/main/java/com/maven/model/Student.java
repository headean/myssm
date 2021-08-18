package com.maven.model;

/**
 * Created with IntelliJ IDEA.
 * Description: 重写 equals 和 hashCode 模板
 * User: headean
 * Email: 386495531@qq.com
 * Date: 2021-08-13 14:04
 */
public class Student {

    private String name;// 姓名
    private String sex;// 性别
    private String age;// 年龄
    private float weight;// 体重
    private String addr;// 地址

    // 重写hashcode方法
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 17 * result + sex.hashCode();
        result = 17 * result + age.hashCode();
        return result;
    }

    // 重写equals方法
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)) {
            // instanceof 已经处理了obj = null的情况
            return false;
        }
        Student stuObj = (Student) obj;
        // 地址相等
        if (this == stuObj) {
            return true;
        }
        // 如果两个对象姓名、年龄、性别相等，我们认为两个对象相等
        if (stuObj.name.equals(this.name) && stuObj.sex.equals(this.sex) && stuObj.age.equals(this.age)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

}

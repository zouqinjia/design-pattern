package com.vince.demo.prototype.shallowclone;

import java.util.Date;
import java.util.List;

public class Student implements Cloneable{

    private String name;

    private Integer age;

    private Boolean lookPretty;

    private Date birthday;

    private List<String> friends;

    private School school;

    @Override
    public Student clone() throws CloneNotSupportedException {


        return (Student) super.clone();
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLookPretty() {
        return lookPretty;
    }

    public void setLookPretty(Boolean lookPretty) {
        this.lookPretty = lookPretty;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", lookPretty=" + lookPretty +
                ", birthday=" + birthday +
                ", friends=" + friends +
                ", school=" + school +
                '}';
    }
}

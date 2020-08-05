package com.vince.demo.composite.transparent;

import java.util.List;

/**
 * component角色 ，抽象整体 & 部分的共同行为
 * 将整体与部分的dh行为都方法抽象类中，
 */
public abstract class CorpV2 {

    private String name;
    private String position;
    private int salary;

    public CorpV2(String name, String position, int salary) {

        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public abstract void addSubordinate(CorpV2 corp);

    public abstract void removeSubordinate(CorpV2 corp);

    public abstract List<CorpV2> getSubordinates(CorpV2 corp);



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

package com.vince.demo.composite.safe;

/**
 * component角色 ，抽象整体 & 部分的共同行为
 */
public abstract class Corp {

    private String name;
    private String position;
    private int salary;

    public Corp(String name, String position, int salary) {

        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public  String getInfo(){

        return toString();
    }

    @Override
    public String toString() {
        return "Crop{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

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

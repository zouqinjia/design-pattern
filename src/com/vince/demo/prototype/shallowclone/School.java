package com.vince.demo.prototype.shallowclone;

public class School implements Cloneable {

    private String name;
    private String address;

    @Override
    public School clone() throws CloneNotSupportedException {

        return (School) super.clone();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

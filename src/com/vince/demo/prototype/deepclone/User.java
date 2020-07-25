package com.vince.demo.prototype.deepclone;

import java.io.*;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

    private String name;
    private Date birthday;
    private List<String> friends;
    private Order order;

    public User deepClone() throws IOException, ClassNotFoundException {

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);//"当前对象"

        //从流里将对象读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        User user = (User) oi.readObject();

        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", friends=" + friends +
                ", order=" + order +
                '}';
    }
}

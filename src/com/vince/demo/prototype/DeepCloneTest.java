package com.vince.demo.prototype;

import com.vince.demo.prototype.deepclone.Order;
import com.vince.demo.prototype.deepclone.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeepCloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User();
        Order order  = new Order();
        order.setOrderId(100001);
        user.setBirthday(new Date());
        List<String> friends = new ArrayList<>();
        friends.add("xiaoming");
        friends.add("xiaohong");
        user.setFriends(friends);
        user.setName("sam");
        user.setOrder(order);

        System.out.println("prototype : " + user.toString());
        User deepClone = user.deepClone();
        System.out.println("deep clone : " +deepClone.toString());

        // 修改克隆对象，验证是否会对原型对象产生影响
        deepClone.setName("vince");// 创建新的赋值对象
        deepClone.getBirthday().setTime(new Date().getTime());// 直接修改克隆对象的引用类型变量
        deepClone.getFriends().add("goudan");
        deepClone.getFriends().add("huahua");
        deepClone.getOrder().setOrderId(200002);
        System.out.println("修改克隆对象后=============");
        System.out.println("prototype:"+user.toString());
        System.out.println("updated clone :"+deepClone.toString());
    }

}

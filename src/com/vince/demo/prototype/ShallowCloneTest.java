package com.vince.demo.prototype;

import com.vince.demo.prototype.shallowclone.School;
import com.vince.demo.prototype.shallowclone.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 浅克隆，源对象与克隆对象值完全一致
 * 1、基本数据类型  修改克隆对象的基本数据类型属性值不对影响源对象属性值。
 * 2、引用数据类型  克隆对象与被克隆对象中的引用数据类型对象变量指向的是同一个地址。修改克隆对象中的引用数据类型对象变量属性值同时会改变源对象的变量值
 * 注：
 * 克隆对象需要修改引用数据类型变量属性值得情况下创建一个新的对象不会对源对象的属性造成影响，但是克隆模式的初衷就是节省构建复杂对象成本才使用克隆，应避免此类操作
 *
 */
public class ShallowCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 浅克隆
        Student student = new Student();
        student.setName("sam");
        student.setBirthday(new Date());
        student.setAge(10);

        List<String>  friends = new ArrayList<>();
        friends.add("xiaoming");
        friends.add("Xiaohong");
        student.setFriends(friends);
        student.setLookPretty(true);

        School school = new School();
        school.setAddress("蓉桥路1号");
        school.setName("上汽通用");
        student.setSchool(school);

        System.out.println("1:" + student.toString());
        // 克隆对象应用类型对象同样需要实现cloneable，不然直接修改克隆对象的引用数据类型变量会影响原型对象
        Student clone = student.clone();
        School clone1 = student.getSchool().clone();
        clone.setAge(1);
        clone.setName("vince");
        clone.setBirthday(new Date(0));
        clone.setLookPretty(false);

        /**
         *  List<String> , School
         *  克隆对象修改引用数据类型同时会影响源对象，因为浅克隆引用数据类型变量都是指向的同一个对象.
         *  并且想这种JDK提供给的容器类不能直接修改代码实现Cloneable接口
         */
        clone.getFriends().add("xiaoliu");
        clone1.setAddress("蓉桥路3号");
        clone1.setName("上汽通用3");
        clone.setSchool(clone1);
        System.out.println("2:" + clone.toString());
        System.out.println("3:" + student.toString());
    }
}

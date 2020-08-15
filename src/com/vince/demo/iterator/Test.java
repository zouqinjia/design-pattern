package com.vince.demo.iterator;

/**
 * 迭代器模式：
 * 提供一种方法访问一个容器容器对象中各个元素，而不需要暴露该对象的内部细节
 */
public class Test {

    public static void main(String[] args) {

        List list = new ConcreteAggregate();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){

            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

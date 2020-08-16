package com.vince.demo.memento;

/**
 * 备忘录模式:
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态.
 * 这样以后就可将该对象恢复到原先保存的状态.
 * 场景：
 * 1、需要保存和恢复数据的相关状态场景
 * 2、提供一个可回滚的操作
 * 3、数据库的事务管理就是使用的备忘录模式.
 */
public class Test {

    public static void main(String[] args) {

        // 发起人创建备忘录对象
        Role role = new Role();
        role.setBlood(100);
        role.setMagic(100);

        role.display();
        NarrowInterface memento = role.createMemento();
        // 负责人管理备忘录对象，负责人持有备忘录的窄接口，不能访问备忘录内部数据
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        // 恢复状态
        role.setMagic(10);
        role.setBlood(20);
        role.display();
        role.restoreStatus((Memento) caretaker.getMemento());
        role.display();
    }
}

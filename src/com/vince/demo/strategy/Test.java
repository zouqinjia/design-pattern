package com.vince.demo.strategy;


import com.vince.demo.strategy.context.Room;
import com.vince.demo.strategy.strategy.StudentCard;

/**
 * 状态模式：
 * 当一个对象内在状态改变是允许其改变行为
 * 释义：
 * 在软件开发过程中，应用程序中的有些对象可能会根据不同的情况做出不同的行为，我们把这种对象称为有状态的对象，而把影响对象行为的一个或多个动态变化的属性称为状态。
 * 当有状态的对象与外部事件产生互动时，其内部状态会发生改变，从而使得其行为也随之发生改变。如人的情绪有高兴的时候和伤心的时候，不同的情绪有不同的行为，当然外界也会影响其情绪变化。
 */
public class Test {

    public static void main(String[] args) {

        Room[] rooms = new Room[2];
        rooms[0] = new Room();
        rooms[1] = new Room();

        Room room = rooms[0];
/**
 * Note:
 *
 * 使用策略模式将if else多重判断消灭掉了，将每中策略的逻辑转移到对应的策略类中，符合单一职能原则，但是使得client需要知道全部策略，维护选择策略逻辑。
 * 如果策略比较多这样会导致client维护很多策略模式，一般情况会出现多重if else判断.
 * 可以使用简单工厂模式封装维护策略模式的逻辑，在策略工厂中维护一个参数与策略的映射关系(Map<String,Strategy>).
 * 这样就完美解决了client端维护策略的逻辑，client只需要向工厂获取策略即可.策略的处理都封装在工厂中.
 */
        room.setPrice(1000.0);
        room.setCard(new StudentCard());
        System.out.println(room.getPrice());

        room.bookRoom();
        room.showRoomState();

        room.checkInRoom();
        room.showRoomState();

        room.checkOutRoom();
        room.showRoomState();
    }
}

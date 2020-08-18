package com.vince.demo.state;

import com.vince.demo.state.context.Room;

/**
 * 状态模式：
 * 当一个对象内在状态改变是允许其改变行为
 * 释义：
 * 在软件开发过程中，应用程序中的有些对象可能会根据不同的情况做出不同的行为，我们把这种对象称为有状态的对象，而把影响对象行为的一个或多个动态变化的属性称为状态。
 * 当有状态的对象与外部事件产生互动时，其内部状态会发生改变，从而使得其行为也随之发生改变。如人的情绪有高兴的时候和伤心的时候，不同的情绪有不同的行为，当然外界也会影响其情绪变化。
 */
public class Test {

    public static void main(String[] args) {

        Room []  rooms = new Room[2];
        rooms[0] = new Room();
        rooms[1] = new Room();

        Room room = rooms[0];
        room.bookRoom();
        room.showRoomState();

        room.checkInRoom();
        room.showRoomState();

        room.checkOutRoom();
        room.showRoomState();
    }
}

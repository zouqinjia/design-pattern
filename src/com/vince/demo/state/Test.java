package com.vince.demo.state;

import com.vince.demo.state.context.Room;

/**
 * 状态模式：
 * 当一个对象内在状态改变是允许其改变行为
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

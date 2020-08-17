package com.vince.demo.state.state;

import com.vince.demo.state.context.Room;

/**
 * concrete state 具体状态角色
 * 负责本状态行为管理以及趋向状态处理，通俗地讲，就是本状态下要做的事情，以及本状态如何过渡到其他状态
 */
public class BookedState extends State {


    public BookedState(Room room) {
        super(room);
    }

    @Override
    public void bookRoom() {

        System.out.println("房间已经预定，不能重复预定");
    }

    @Override
    public void unBookRoom() {

        System.out.println("房间预定已取消");
        // 重置房间状态
        room.setState(room.leisureState);
    }

    @Override
    public void checkInRoom() {

        System.out.println("入住房间....");
        // 修改房间状态为 已入住
        room.setState(room.checkedInState);
    }

    @Override
    public void checkOutRoom() {

        System.out.println("房间为入住，不能操作退房");
    }
}

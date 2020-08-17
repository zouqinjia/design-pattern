package com.vince.demo.state.state;

import com.vince.demo.state.context.Room;
/**
 * concrete state 具体状态角色
 * 负责本状态行为管理以及趋向状态处理，通俗地讲，就是本状态下要做的事情，以及本状态如何过渡到其他状态
 */
public class CheckedInState extends State {


    public CheckedInState(Room room) {
        super(room);
    }

    @Override
    public void bookRoom() {

        System.out.println("房间已入住，不能预订....");
    }

    @Override
    public void unBookRoom() {

        System.out.println("房间已入住，不能退订");
    }

    @Override
    public void checkInRoom() {

        System.out.println("入住房间成功.");
        room.setState(room.checkedInState);
    }

    @Override
    public void checkOutRoom() {

        System.out.println("退房成功...");
        room.setState(room.leisureState);
    }
}

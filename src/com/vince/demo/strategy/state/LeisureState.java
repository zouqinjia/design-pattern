package com.vince.demo.strategy.state;

import com.vince.demo.strategy.context.Room;

/**
 * concrete state 具体状态角色
 * 负责本状态行为管理以及趋向状态处理，通俗地讲，就是本状态下要做的事情，以及本状态如何过渡到其他状态
 */
public class LeisureState extends State {

    public LeisureState(Room room) {
        super(room);
    }

    @Override
    public void bookRoom() {

        System.out.println("成功预定房间");

        room.setState(room.bookedState);
    }

    @Override
    public void unBookRoom() {

        System.out.println("房间为空闲状态，不能操作退订");
    }

    @Override
    public void checkInRoom() {

        System.out.println("入住房间....");
        room.setState(room.checkedInState);
    }

    @Override
    public void checkOutRoom() {

        System.out.println("房间为空闲状态，不能操作退房..");
    }
}

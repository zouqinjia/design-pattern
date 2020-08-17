package com.vince.demo.state.context;

import com.vince.demo.state.state.BookedState;
import com.vince.demo.state.state.CheckedInState;
import com.vince.demo.state.state.LeisureState;
import com.vince.demo.state.state.State;

/**
 * Context 角色
 * context角色是一个环境角色，它的作用是串联各个状态的过渡，在State抽象类中我们定义并把这个环境角色聚合进来，并传递到子类。
 * 也就是具体的状态类中自己根据环境决定如何进行状态的过渡
 *
 * 约束：
 * 1、把状态对象声明为静态变量
 * 2、环境角色具有状态抽象角色定义的所有行为，具体执行使用委托方式
 */
public class Room {

    State state;

    public State leisureState;
    public State bookedState;
    public State checkedInState;

    public Room() {

        // 声明全部状态与环境进行关联绑定
        this.leisureState = new LeisureState(this);
        this.bookedState = new BookedState(this);
        this.checkedInState = new CheckedInState(this);
        // 初始化房间状态
        this.state = new LeisureState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setLeisureState(State leisureState) {
        this.leisureState = leisureState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }

    public void setCheckedInState(State checkedInState) {
        this.checkedInState = checkedInState;
    }

    //预定房间
    public void bookRoom() {

        state.bookRoom();
    }

    // 退订房间
    public void unbookRoom() {

        state.unBookRoom();
    }

    // 入住
    public void checkInRoom() {

        state.checkInRoom();
    }

    // 退房
    public void checkOutRoom() {

        state.checkOutRoom();
    }

    public void showRoomState() {

        System.out.println("当前房间的状态是：" + state.getClass().getName());
    }


}

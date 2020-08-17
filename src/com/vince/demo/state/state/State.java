package com.vince.demo.state.state;

import com.vince.demo.state.context.Room;

/**
 * State 抽象类
 * 负责独享状态的定义。并且封装环境角色以实现状态切换
 */
public abstract class State {
    Room room;

    public State(Room room) {
        this.room = room;
    }

    // 预定房间
    public abstract void bookRoom();

    // 取消预定
    public abstract void unBookRoom();

    // 入住
    public abstract void checkInRoom();

    // 退房
    public abstract void checkOutRoom();
}

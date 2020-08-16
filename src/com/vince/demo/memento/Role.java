package com.vince.demo.memento;

/**
 * originator
 *
 * 记录当前时刻的内部状态，负责定义那些属于备份范围的状态，负责创建和恢复备忘录数据
 */
public class Role {

    private int blood;
    private int magic;

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * 展示自己的状态
     */
    public void display() {

        System.out.println("当前状态，血量：" + this.blood + " ,蓝量: " + this.magic);
    }

    /**
     * 恢复状态
     */
    public void restoreStatus(Memento memento) {

        this.blood = memento.getBlood();
        this.magic = memento.getMagic();
    }

    /**
     * 创建备忘录(memento)
     */
    public NarrowInterface createMemento() {

        return new Memento(blood, magic);
    }
}

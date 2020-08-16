package com.vince.demo.memento;

/**
 * memento
 *
 * 负责存储originator发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
 *
 *  在备忘录Memento中有两个接口，其中caretaker只能使用备忘录中的窄接口，它只能将备忘录传递给其他对象。
 *  originator可以看到宽接口，允许它访问到先前状态的所有数据
 */
public class Memento implements NarrowInterface {

    private int blood;
    private int magic;

    public Memento(int blood, int magic) {
        this.blood = blood;
        this.magic = magic;
    }

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
}

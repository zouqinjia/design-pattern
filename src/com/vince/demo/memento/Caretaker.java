package com.vince.demo.memento;

/**
 *  caretaker
 *  对备忘录进行管理、保存和提供备忘录
 */
public class Caretaker {

    private NarrowInterface memento;

    public NarrowInterface getMemento() {
        return memento;
    }

    public void setMemento(NarrowInterface memento) {
        this.memento = memento;
    }
}

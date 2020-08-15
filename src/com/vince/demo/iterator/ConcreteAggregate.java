package com.vince.demo.iterator;

public class ConcreteAggregate implements List {

    private Object [] objects;
    private int index;
    private int size;

    public ConcreteAggregate() {
        this.objects = new Object[1000];
        index = 0;
        size = 0;
    }

    @Override
    public void add(Object object) {

        objects[index++] = object;
        size++;
    }

    @Override
    public Object get(int index) {

        return objects[index];
    }

    @Override
    public int getSize() {

        return size;
    }

    @Override
    public Iterator iterator() {

        return new ConcreteIterator(this);
    }
}

package com.vince.demo.iterator;

public class ConcreteIterator implements Iterator {

    private List list ;

    private  int index;

    public ConcreteIterator(List list) {

        this.list = list;
    }

    @Override
    public boolean hasNext() {

        if(index >= list.getSize()){

            return false;
        }
        return true;
    }

    @Override
    public Object next() {

        Object o = list.get(index);
        index++;
        return o;
    }
}

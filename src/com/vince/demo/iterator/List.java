package com.vince.demo.iterator;

public interface List {

    void add(Object object);
    Object get(int index);
    int getSize();
    Iterator iterator();
}

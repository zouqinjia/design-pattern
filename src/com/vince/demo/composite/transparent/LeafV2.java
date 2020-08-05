package com.vince.demo.composite.transparent;

import java.util.List;

public class LeafV2 extends CorpV2 {

    public LeafV2(String name, String position, int salary) {

        super(name, position, salary);
    }

    @Override
    public void addSubordinate(CorpV2 corp) {

        throw new UnsupportedOperationException("不支持");
    }

    @Override
    public void removeSubordinate(CorpV2 corp) {

        throw new UnsupportedOperationException("不支持");
    }

    @Override
    public List<CorpV2> getSubordinates(CorpV2 corp) {

        throw new UnsupportedOperationException("不支持");
    }
}

package com.vince.demo.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class BranchV2 extends CorpV2 {

    private List<CorpV2> subordinateList =new ArrayList<>();

    public BranchV2(String name, String position, int salary) {
        super(name, position, salary);
    }

    @Override
    public void addSubordinate(CorpV2 corp) {

        subordinateList.add(corp);
    }

    @Override
    public void removeSubordinate(CorpV2 corp) {

        subordinateList.remove(corp);
    }

    @Override
    public List<CorpV2> getSubordinates(CorpV2 corp) {

        return this.subordinateList;
    }

}

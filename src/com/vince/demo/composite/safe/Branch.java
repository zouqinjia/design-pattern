package com.vince.demo.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * branch 角色
 *
 */
public class Branch extends Corp {

    private List<Corp> subordinateList =new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp){

        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinate(){

        return this.subordinateList;
    }
}

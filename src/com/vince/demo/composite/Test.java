package com.vince.demo.composite;

import com.vince.demo.composite.safe.Branch;
import com.vince.demo.composite.safe.Corp;
import com.vince.demo.composite.safe.Leaf;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        // 总经理
        Branch root = new Branch("马云","CEO",100000);
        // 部门经理
        Branch deptManager1 = new Branch("马1","财务部经理",10000);
        Branch deptManager2 = new Branch("马2","销售部经理",50000);
        Branch deptManager3 = new Branch("马3","研发经理",20000);
        // 组长
        Branch teamLeader1 = new Branch("马4","一组组长",5000);
        Branch teamLeader2 = new Branch("马5","二组组长",5000);
        Branch teamLeader3 = new Branch("马6","三组组长",5000);
        // 员工
        Leaf employee1 = new Leaf("马7","员工",3000);
        Leaf employee2 = new Leaf("马8","员工",3000);
        Leaf employee3 = new Leaf("马9","员工",3000);
        Leaf employee4 = new Leaf("马10","员工",3000);
        Leaf employee5 = new Leaf("马11","员工",3000);
        Leaf employee6 = new Leaf("马12","员工",3000);

        // 组装
        // 部门经理
        root.addSubordinate(deptManager1);
        root.addSubordinate(deptManager2);
        root.addSubordinate(deptManager3);
        // 开发组长
        deptManager3.addSubordinate(teamLeader1);
        deptManager3.addSubordinate(teamLeader2);
        deptManager3.addSubordinate(teamLeader3);
        // 开发人员
        teamLeader1.addSubordinate(employee1);
        teamLeader1.addSubordinate(employee2);
        teamLeader2.addSubordinate(employee3);
        teamLeader2.addSubordinate(employee4);
        teamLeader3.addSubordinate(employee5);
        teamLeader3.addSubordinate(employee6);

        // 打印所有员工信息
        getTreeInfo(root);

    }

    public static void getTreeInfo(Branch root){

        System.out.println(root.toString());
        // 根节点
        List<Corp> subordinate = root.getSubordinate();

        for (Corp corp : subordinate) {

            if(corp instanceof Leaf){// 叶子节点

                System.out.println(corp.toString());
            }else{// 分支节点

                System.out.println(corp.toString());
                getTreeInfo((Branch) corp);
            }
        }
    }
}

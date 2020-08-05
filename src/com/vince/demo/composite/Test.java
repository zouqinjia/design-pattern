package com.vince.demo.composite;

import com.vince.demo.composite.safe.Branch;
import com.vince.demo.composite.safe.Corp;
import com.vince.demo.composite.safe.Leaf;

import java.util.List;

/**
 * 组合模式，
 * 将对象组合成属性结构以表示”部分-整体“的层次结构，使得用户对单个对象和组合对象的使用具有一致性
 * 透明式：
 * 把组合相关的行为放到component（抽象对象）中，使用叶子对象和分支对象具有相同的行为
 * 1、对客户端而言不需要知道leaf对象与branch对象的存在。只需要知道component即可.所以叫透明式
 * 2、leaf对象实现不具备的行为而在方法中抛出异常。
 *
 * 安全式：
 * component中只有composite与leaf的共同行为，其它组合行为在composite中单独实现
 * 1、客户端调用时需要知道leaf和composite对象的存在，所以失去了透明性
 * 2、因为composite与leaf行为单独进行了分离，所以leaf不需要实现不具备的行为（空实现，抛出异常），所以具备了安全性，所以叫安全式
 */
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

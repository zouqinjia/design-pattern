package com.vince.demo.responsibilitychain;

import com.vince.demo.responsibilitychain.concretehandler.Leader;
import com.vince.demo.responsibilitychain.concretehandler.Manager;

/**
 * 责任链模式:
 * 使得多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系.
 * 将这些对象连成一个链，并沿着这条链传递该请求，直到有对象处理它为止。
 *
 * 将请求和处理分开。请求者不用知道是谁处理的，处理者可以不用知道请求的全貌，两者解耦，提高系统的灵活性.
 *
 */
public class Test {

    public static void main(String[] args) {

        // 定义责任链
        Leader leader = new Leader("张三");
        Manager manager = new Manager("李四");

        leader.setNext(manager);

        // 请假一天，组长审批
        LeaveRequest leaveRequest = new LeaveRequest("小红", 1, "有事");
        leader.handler(leaveRequest);
        // 请假大于一天，经理审批
        LeaveRequest leaveRequest2 = new LeaveRequest("小红", 2, "有事");
        leader.handler(leaveRequest2);
        // 没有后续处理该级别的处理者
        LeaveRequest leaveRequest3 = new LeaveRequest("小红", 3, "有事");
        leader.handler(leaveRequest3);
    }
}

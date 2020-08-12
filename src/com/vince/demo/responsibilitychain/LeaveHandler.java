package com.vince.demo.responsibilitychain;

public abstract class LeaveHandler {

    private String approvalName;
    protected LeaveHandler nextHandler;

    public LeaveHandler(String approvalName) {
        this.approvalName = approvalName;
    }

    public void setNext(LeaveHandler next){

        this.nextHandler = next;
    }

    public abstract void handler(LeaveRequest leaveRequest);

}

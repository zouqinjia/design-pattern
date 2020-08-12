package com.vince.demo.responsibilitychain.concretehandler;

import com.vince.demo.responsibilitychain.LeaveHandler;
import com.vince.demo.responsibilitychain.LeaveRequest;

/**
 * 具体责任处理者
 * 定义该处理者处理逻辑以及定义该处理者能够处理的级别
 */
public class Leader extends LeaveHandler {


    public Leader(String approvalName) {
        super(approvalName);
    }

    @Override
    public void handler(LeaveRequest leaveRequest) {

        int days = leaveRequest.getDays();
        if(days <= 1){

            System.out.println("组长审批:" + leaveRequest);
        }else{
            if(super.nextHandler != null){
                super.nextHandler.handler(leaveRequest);
            }else{

                System.out.println("没有后续处理者了.....");
            }
        }

    }
}

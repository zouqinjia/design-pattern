package com.vince.demo.mediator.colleague;

import com.vince.demo.mediator.mediator.AbstractMediator;

public abstract class AbstractColleague {

    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {

        this.abstractMediator = abstractMediator;
    }
}

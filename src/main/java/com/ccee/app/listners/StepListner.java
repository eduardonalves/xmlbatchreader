package com.ccee.app.listners;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListner implements StepExecutionListener{

    public ExitStatus afterStep(StepExecution execution) {
        System.out.println("After listner");
        System.out.println(execution.getExitStatus());
        return execution.getExitStatus();
    }

    public void beforeStep(StepExecution arg0) {
        System.out.println("Before listner");
        System.out.println("Before listner is runing");

    }

}
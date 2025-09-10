package com.example.firstSpring;

import org.springframework.stereotype.Service;

@Service("add")
public class opAdd implements Operation{

    public opAdd() {
    }

    @Override
    public long operate(long op1, long op2) {
        return op1+op2;
    }
    @Override
    public String getOpsName() {
        return "plus";
    }
}

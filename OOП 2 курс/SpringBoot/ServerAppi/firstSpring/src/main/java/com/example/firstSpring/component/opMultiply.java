package com.example.firstSpring;

import org.springframework.stereotype.Service;

@Service("mult")
public class opMultiply implements Operation{

    public opMultiply() {
    }

    @Override
    public long operate(long op1, long op2) {
        return op1*op2;
    }
    @Override
    public String getOpsName() {
        return "times";
    }
}

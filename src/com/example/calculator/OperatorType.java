package com.example.calculator;

public enum OperatorType {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char operator;

    private OperatorType(char operator){
        this.operator = operator;
    }

    public char getOperator(){
        return operator;
    }

    public static OperatorType getOperatorName(char operator){
        for (OperatorType op : OperatorType.values()){
            if(op.operator == operator) {
                return op;
            }
        }
        throw new IllegalArgumentException();
    }
}

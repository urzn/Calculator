package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private ArrayList<Double> results = new ArrayList<>();
    int num1 = this.num1;
    int num2;
    char symbol;
    double result;

    public void calculate(int num1, int num2, char symbol){
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = (double) num1 / (double) num2;
            } else {
                System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다");
                return;
            }
        } else {
            System.out.println("사칙연산 기호가 잘못 입력되었습니다");
            return;
        }
        System.out.println(result);
        results.add(result);
    }

    public ArrayList<Double> getResults(){
        return results;
    }

    public void setResults(){

    }

    public void removeResult(){
        results.remove(0);
    }
}

///////////////////////////////
/////이 클래스는 사용하지 않음/////
///////////////////////////////

package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private final ArrayList<Double> results = new ArrayList<>();

    public void calculate(int num1, int num2, char operator){
        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = (double) num1 / num2;
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
        if(!results.isEmpty())
            results.remove(0);
        else
            System.out.println("저장된 계산결과가 없습니다");
    }
}

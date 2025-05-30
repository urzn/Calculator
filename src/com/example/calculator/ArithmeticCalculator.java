package com.example.calculator;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.*;

public class ArithmeticCalculator {
    private final ArrayList<Double> results = new ArrayList<>();
    private OperatorType op;

    public <T extends Number, U extends Number> void calculate(T num1, U num2, char operator){
        double result;
        try{
            op = OperatorType.getOperatorName(operator);
        } catch (IllegalArgumentException e){
            System.out.println("+ - * / 가 아닌 잘못된 연산자입니다. ");
            return;
        }

        switch(op){
            case PLUS :
                result = num1.doubleValue() + num2.doubleValue();
                break;
            case MINUS :
                result = num1.doubleValue() - num2.doubleValue();
                break;
            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;
            case DIVIDE:
                if (num2.doubleValue() != 0) {
                    result = num1.doubleValue() / num2.doubleValue();
                } else {
                    System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다");
                    return;
                }
                break;
            default:
                return;

        }
        System.out.println(result);
        setResults(result);
    }

    public ArrayList<Double> getResults(){
        return results;
    }

    private void setResults(double result){
        results.add(result);
    }

    public void removeResult(){
        if(!results.isEmpty()){
            results.remove(0);
            System.out.println("가장 오래된 계산결과를 삭제했습니다.");
        }
        else
            System.out.println("저장된 계산결과가 없습니다.");
    }

    public List<Double> findLargerNumber(String input){
        LargerNumberFinder<List<Double>, String> l = (u) -> {
            double inputVal = Double.parseDouble(u);
            List<Double> largerResults = new ArrayList<>();

            largerResults = results.stream()
                    .filter(num -> num > inputVal)
                    .collect(Collectors.toList());

            /*for (Double result : results){
                if(result > inputVal){
                    largerResults.add(result);
                }
            }*/
            return largerResults;
        };
        return l.findLargerNumber(input);
    }


}

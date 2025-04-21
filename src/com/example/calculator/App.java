package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = 1;
        int num1, num2;
        String strsymbol;
        Calculator calculator = new Calculator();
        ArrayList<Double> results = calculator.getResults();
        while(mode != 0){
            System.out.println("계산기 모드 선택. 1:계산 2:계산결과조회 3:오래된 연산 결과 삭제 0:종료");
            mode = scanner.nextInt();
            switch (mode) {
                case 1 :
                    while (true){
                        System.out.print("첫번째 숫자 입력 : ");
                        num1 = scanner.nextInt();
                        System.out.print("두번째 숫자 입력 : ");
                        num2 = scanner.nextInt();
                        System.out.print("사칙연산 기호 입력 : ");
                        strsymbol = scanner.next();

                        calculator.calculate(num1, num2, strsymbol.charAt(0));
                        System.out.println("더 계산하시겠습니까? (exit 입력 시 나가기)");
                        if (scanner.next().equals("exit")){
                            break;
                        }
                    }
                    break;
                case 2 :
                    System.out.println(results);
                    break;
                case 3 :
                    if(results.isEmpty())
                        System.out.println("계산결과가 없습니다");
                    else
                        calculator.removeResult();

                    break;
                case 0 :
                    break;
            }
        }
    }
}

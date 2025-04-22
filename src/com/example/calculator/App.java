package com.example.calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mode = 1;
        String input1, input2, stroperator;
        Number num1, num2;
        ArithmeticCalculator calculator = new ArithmeticCalculator();

        while(mode != 0){
            System.out.println("계산기 모드 선택. 1:계산 2:계산결과조회 3:오래된 연산 결과 삭제 0:종료");
            try{
                mode = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e){
                System.out.println("숫자가 아닌 값을 입력했습니다.");
                scanner.nextLine();
                continue;
            }

            switch (mode) {
                case 1 :
                    do{
                        System.out.print("첫번째 숫자 입력 : ");
                        input1 = scanner.nextLine();
                        try{
                            num1 = Integer.parseInt(input1);

                        } catch (NumberFormatException e1){
                            try{
                                num1 = Double.parseDouble(input1);
                            } catch (NumberFormatException e2){
                                System.out.println("정수 또는 실수를 입력해주세요.");
                                break;
                            }
                        }
                        System.out.print("두번째 숫자 입력 : ");
                        input2 = scanner.nextLine();
                        try{
                            num2 = Integer.parseInt(input2);

                        } catch (NumberFormatException e1){
                            try{
                                num2 = Double.parseDouble(input2);
                            } catch (NumberFormatException e2){
                                System.out.println("정수 또는 실수를 입력해주세요.");
                                break;
                            }
                        }
                        System.out.print("사칙연산 기호 입력 : ");
                        stroperator = scanner.nextLine();

                        calculator.calculate(num1, num2, stroperator.charAt(0));
                        System.out.println("더 계산하시겠습니까? (exit 입력 시 나가기)");
                    } while(!scanner.nextLine().equals("exit"));
                    break;
                case 2 :
                    System.out.println(calculator.getResults());
                    break;
                case 3 :
                    calculator.removeResult();
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("0 1 2 3 이 아닙니다.");
                    break;
            }
        }
    }
}

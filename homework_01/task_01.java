package homework.homework_01;

import java.math.BigInteger;
import java.util.Scanner;

/*Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n

Задание 2.
Вывести все простые числа от 1 до 1000

Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет*/

public class task_01 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    static void task1() {
        System.out.println("Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;
        BigInteger mult = BigInteger.ONE;
        for (int i = 1; i <= num; i++){
            sum += i;
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Сумма чисел от 1 до "+ num +" = " + sum);
        System.out.println(+ num +"! = " + mult);
    }

    static void task2() {
        System.out.println();
        System.out.println("Вывести все простые числа от 1 до 1000");
        for (int i = 1; i <= 1000; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count += 1;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }        
    }

    static void task3() {        
        System.out.println("Реализовать простой калькулятор (операции + - / * )");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = sc.nextInt();        
        System.out.print("Введите второе число: ");
        double num_2 = sc.nextInt();
        System.out.print("Введите операцию: ");
        String sign = sc.next();
        double res;
        if (sign.equals("+")){
            System.out.print(num_1 + num_2);
        }
        else if (sign.equals("-")){
            System.out.print(num_1 - num_2);
        }
        else if (sign.equals("*")){
            System.out.print(num_1 * num_2);
        }
        else if (sign.equals("/")){
            System.out.print(num_1 / num_2);
        }
        else{
            System.out.print("Такой операции нет");
        }

    }
}

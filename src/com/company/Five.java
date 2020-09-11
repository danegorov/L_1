package com.company;


import java.util.Scanner;

public class Five {
    public static long  five(){
        int a;
        System.out.println("Задание 5 Факториал \nВведите число");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        long fact = 1;
        for(int i = 1; i <= a; i++){
            fact *= i;
        }
        return fact;
    }
}

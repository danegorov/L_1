package com.company;

import java.util.Scanner;

public class One {
    public static void one() {
        System.out.println("Задание 1 \nВведите 4 числа");
        int[] arr = new int[4];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for(int buff : arr){
            sum += buff;
        }
        System.out.println("for: " + sum);


        int i = 0;
        sum = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println("while: " + sum);


        sum = 0;
        i = 0;
        do{
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("do while: " + sum);
        System.out.println("---------------------\n\n");
    }

}

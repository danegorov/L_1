package com.company;

public class Three {
    public static void three(){
        System.out.println("Задание 3\nПервые 10 чисел ряда:");
        for(int i = 1; i <= 10; i++){
            float sum = 0;
            for(float j = 1; j <= i; j++){
                sum += (1/j);
            }
            System.out.format("%.3f%n", sum);
        }
        System.out.println("\n---------------------\n\n");
    }
}

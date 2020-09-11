package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Four {
    public static void four(){
        System.out.println("Задание 4 Сортировка массива \n ");
        int size = (int) (Math.random() * 20.0 + 4);
        Random ran = new Random();
        System.out.println("Задание 4\nРандомный размер массива: " + size);
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ran.nextInt(1000);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Отсортированный массив");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println("\n---------------------\n\n");
    }
}

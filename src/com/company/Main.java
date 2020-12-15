package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите требуемое количество случайных чисел:");
        int x = Integer.parseInt(reader.readLine());
        Random random = new Random();
        System.out.println("С переходом на новую строку:");
        for (int i=0; i<x; i++){
            System.out.println(random.nextInt());
        }
        System.out.println();
        System.out.println("Без перехода на новую строку:");
        for (int i=0; i<x; i++){
            System.out.print(random.nextInt()+" ");
        }
    }
}

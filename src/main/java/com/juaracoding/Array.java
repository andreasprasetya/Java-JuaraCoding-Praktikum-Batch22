
package com.juaracoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

      int[] nilai={1,2,3,4,5};
        System.out.println(nilai[3]);

       int[] number = new int[5];
        number[0]=1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

       System.out.println(number[3]);

       Scanner scanner= new Scanner(System.in);

        System.out.println("Masukan jumlag data");
       int jumlah= scanner.nextInt();
        int[] price=new int[jumlah];
        int totalPrice=0;

       for (int i = 0; i < price.length; i++) {
           System.out.println("Masukan harga:");
            price[i]= scanner.nextInt();
            totalPrice+=price[i];
       }
       System.out.println("total harga="+totalPrice);

//// foreach//
String[] cars={"Volvo,BMW,Ford,Mazda"};
for (String car:cars){

           System.out.println(car.toUpperCase());
       }
        for (int i = 0; i < cars.length; i++) {
           System.out.println(cars[i].toUpperCase());
       }

       int[][] num={{1,2,3,4},{5,6,7}};
       System.out.println(num[0][3]);
       System.out.println(num[1][1]);
       System.out.println(number.length);
       Arrays.sort(number);
       Arrays.binarySearch(number,5);

        Integer[] numbers = new Integer[5]; // index 0 - 4
        number[0] = 80;
        numbers[1] = 70;
        numbers[2] = 90;
        numbers[3] = 99;
        numbers[4] = 95;
        numbers[3] = 97;
        Arrays.sort(numbers, Collections.reverseOrder());

//        for(int number: numbers){
//            System.out.println(number);
//        }
    }
}


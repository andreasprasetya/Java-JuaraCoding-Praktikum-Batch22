package com.juaracoding;

import java.awt.*;

public class Variabel {
    public static void main(String[] args) {

        short stock =127;
        byte minRequest =100;
        double amount1=11700.500;
        double amount2=2200.566;
        System.out.printf("%.2f%n",amount1);
        System.out.printf("%8.2f",amount2);
        char a ='A';


String path="C:\\User\\Download";
System.out.println(path);

boolean isStockAvailable = true;
        System.out.println();
//Impilct casting//
int num=100;
double dataNum =num;
        System.out.println(dataNum);

//explicit casting//
        long number=220000000000L;
        int dataNumber= (int)number;
        System.out.println(dataNumber);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());



    }

}

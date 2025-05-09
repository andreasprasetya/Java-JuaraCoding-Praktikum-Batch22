package com.juaracoding.OOP;

public class MainApp {
    public static void main(String[] args) {
        Fruit aplle= new Fruit();
        aplle.grams=100;
        aplle.calasPerGram=52;
        System.out.println(aplle.totalCalories());

        Fruit manggo= new Fruit();
        manggo.grams=200;
        manggo.calasPerGram=120;
        System.out.println(manggo.totalCalories());

        Kotak kotak1=new Kotak(10 );
        kotak1.draw();

        Kotak kotak2=new Kotak(10 );
        kotak2.draw();

//        Fruit apple = new Fruit(200, 100);
//        apple.printTotaCalories();
//        System.out.println();
        Car byd=new Car("Listtik");
        byd.setTahunPembuatan(2025);
        byd.displaySpec();
}
    }


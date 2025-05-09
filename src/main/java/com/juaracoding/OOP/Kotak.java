package com.juaracoding.OOP;

public class Kotak {

    int sisi;
    protected  Kotak(){
        sisi=5;
    }
    protected Kotak(int sisi){

        this.sisi= sisi;
    }
    protected  void  draw(){

        int tinggi=10;
        for (int u = 1; u <sisi ; u++) {
            for (int t = 0; t <sisi; t++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}

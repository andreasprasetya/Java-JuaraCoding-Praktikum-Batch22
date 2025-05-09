package com.juaracoding.OOP;

public class Car {

    private String bahanBakar;


    protected void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    private  int tahunPembuatan;

    protected Car(String bahanBakar){
        this.bahanBakar=bahanBakar;
    }

    protected void displaySpec(){
        System.out.println(bahanBakar);
        System.out.println(tahunPembuatan);

    }
}

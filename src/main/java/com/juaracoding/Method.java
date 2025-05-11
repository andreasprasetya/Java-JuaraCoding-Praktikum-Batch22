package com.juaracoding;

public class Method {

    public static void main(String[] args) {

        detailProduct("Nvidia RTX 5070",15000,101,minBuy());
        detailProduct("AMD Radeon",11000,5,minBuy());

        /*rawKotak(10);
        drawKotak(5);

        double luas = luasKotak(10);
        System.out.println(luas);
        System.out.println(luasKotak(5));*/



    }

    // custom method
    public static void detailProduct(String productName, double price, int stock, int minBuy){
        System.out.println("Nama Product: "+productName.toUpperCase());
        System.out.println("Harga: "+price);
        System.out.println("Jumlah Stok: "+stock);
        System.out.println("Min Pembelian: "+minBuy);
        // > 100 Stok tidak boleh lebih dari 100
        if(stock > 100) { // 101 > 100
            System.out.println("Stok tidak boleh lebih dari 100");
        }
        // return subTotal
        System.out.println("Subtotal = "+subTotal(1,price));
        System.out.println();
    }

    public static double subTotal(int amount, double price){
        if(amount < minBuy()){ // 1 < 1 false
            System.out.println("Minimal pembelian harus "+minBuy());
        }
        return amount * price;
    }

    public static int minBuy(){ // int minBuy = 1
        return 2;
    }

    public static void drawKotak(int sisi){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static double luasKotak(int sisi){
        return sisi*sisi;
    }

}

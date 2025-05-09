package com.juaracoding;


public class Method {
    public static void main(String[] args) {

        datailProduct("Nvidia",1,4);
        datailProduct("Amd Radeon",2,3);
        drawKotak(10);
        System.out.println();
        drawKotak(5);


        double luas=luasKotak(8);
       System.out.println(luasKotak(7));
        System.out.println(luasKotak(7));
        System.out.println("");
    }

    // custom method//
    public static double subTotal(int amount,double price){
      if (amount<1){
          System.out.println("Minimal Pembelian Harus Satu");
      }
        return amount*price;
    }

    public  static int minSale(){
        return 1;
    }
    public  static  double luasKotak(int sisi){
        return  sisi*sisi;
 }
    public static void datailProduct( String productName,int stock,double price){
        System.out.println("Nama Product:" +productName.toUpperCase());
        System.out.println("jumlah Stock"+stock);
        System.out.println("Harga"+price);
        if (stock>100){

            System.out.println("stock masih ada"+stock);
        }
        System.out.println("sub total"+subTotal(2 ,price));
    }

 public static  void  drawKotak(int sisi){
     for (int i = 0; i < sisi; i++) {
             for (int j = 0; j < sisi; j++) {
                 System.out.print("*");
             }
             System.out.println();
     }
     }
 }



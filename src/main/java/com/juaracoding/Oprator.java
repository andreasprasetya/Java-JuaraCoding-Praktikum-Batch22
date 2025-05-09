package com.juaracoding;

public class Oprator {
    public static void main(String[] args) {

       int modulus =11%3;
        System.out.println(modulus);

        // sufix  tidak langsung//
        int x=2;
        int num1=10*x++;//10*2
        System.out.println(num1);
        System.out.println(x);

        //prefix langsung //
        int y=2;
        int num2=10*++y;//10*3
        System.out.println(num2);

        int num3=10+5*4;
        System.out.println(num3);

        int a=10;
        a+=5;
        System.out.println(a);

        boolean relational =5>6;
        System.out.println(relational);

        // and perkalian//
        // or penjumlahan//
        // xor kalau sama false//
        // xnor kalau sama true//

        //bitwise
        int num4 =10&12;
        System.out.println(num4);

        //shift right hilangkan biner paling akhir//
        int num5=181>>1;
        System.out.println(num5);

        //shift left nambah biner 0 paling akhir//
        int num6 = 108<<1;
        System.out.println(num6);

    }
}

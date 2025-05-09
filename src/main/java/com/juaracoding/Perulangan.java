

package com.juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println(i);

        }
        System.out.println("Next Statement");

        for (int i = 0; i < 10 ; i++) {
            if (i % 2==1) {
                System.out.println(i);

            }

            for (int j = 1; j <10 ; j+=2) {
                System.out.println(j);
            }
/// ///
            int sisi=10;
            for (int h = 0; h <sisi ; h++) {
                for (int k = 0; k < sisi; k++) {

                    System.out.print("*");
                }
                System.out.println("*");

            }
            System.out.println();
            int tinggi=10;
            for (int u = 1; u <=tinggi ; u++) {
                for (int t = 0; t <= u; t++) {

                    System.out.print("*");
                }
                System.out.println();

            }

            System.out.println("input angka 0 exit dari console");
            Scanner scanner = new Scanner(System.in);
            while(true){

                System.out.println("input angka apapaun selain 0");
                int angka = scanner.nextInt();
                if (angka==0) break;
            }
            int y=0;
            // cek kondisi di akhir
            do {
                System.out.println("y="+y);
                y++;
            }while (y<1);

            int x=1;
            //cek kondisi langsung
            while (x<2) {
                System.out.println("x=" + x);
                x++;
            }
// cek pin  dan user pr//

            int sum=0;
            int item=0;
            while (item<5){

                item++;
                if (item==2) continue;
                sum+= item;
            }
            System.out.println(sum);

            int pin = 112233;
            boolean isBlocked = false;
            int count = 0;
            int maxLooping = 3;
            do{
                System.out.println("Input pin = ");
                int inPin = scanner.nextInt();
                if (inPin==pin) break;
                count++;
                if(count==maxLooping) isBlocked=true;
            } while (count < maxLooping); // 3x false

            if(!isBlocked){
                System.out.println("Lanjutkan Transaksi");
            } else {
                System.out.println("Pin diblokir sementara");
            }

            //
        }

    }
}



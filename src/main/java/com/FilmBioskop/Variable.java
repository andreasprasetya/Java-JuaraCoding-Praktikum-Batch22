package com.FilmBioskop;


import static com.juaracoding.Method.minBuy;
import static com.juaracoding.Method.subTotal;

public class Variable {
    public static void main(String[] args) {

        tampilkanFilm("gfhgfh",  5,4);

    }

    // Data Film
    public static void tampilkanFilm(String judul, int harga,int tiket) {

        String[] title = {"KKN di Desa Penari", "AgaK Laen", "Jumbo", "Warkop DKI Reborn: Jangkrik Boss! Part 1",
                "Dilan", "Miracle in Cell No 7", "Dilan1991"};

        int[] harga1 = {2500, 3000, 5000, 4500, 4000, 2000, 1000};

        System.out.println("Tampilkan Film");


            int g = 0;
            System.out.println("Judul Film: "+title[g]);
            for (g = 0; g < title.length; g++) {
            }


            int j=0;
            System.out.println("Harga: "+harga1[j]);
            for (j = 0; j < harga1.length; j++) {
            }
        if(harga > 6000) { // 101 > 100
            System.out.println("Harga Tidak ada");
        }
        // return total tiket,,
        System.out.println("Jumlah Tiket = "+jumlahTiket(1,harga));
        System.out.println();
    }

    public static double jumlahTiket(int tiket, int price){
        if(tiket < minBuy()){ // 1 < 1 false
            System.out.println("Minimal pembelian harus "+minBuy());
        }
        return tiket;
    }

    }





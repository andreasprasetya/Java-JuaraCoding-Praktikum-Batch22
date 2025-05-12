package com.juaracoding.FilmBioskop;


import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int pilihan;
        char ulang;

        do {
            System.out.println("=== Menu Utama ===");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
            System.out.println();
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println("Nama Film:");
                    System.out.println("Harga Tiket:");
                    System.out.println("Jumlah Tiket:");
                    break;
                case 2:
                    System.out.println("Masukan Nama Film:");
                    System.out.println("Nama film dalam huruf besar:");
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

            System.out.println();


            ulang = input.next().charAt(0);

            System.out.println();
        }
        while (ulang!= 't');

        System.out.println("Terimakasih...");

    }
}


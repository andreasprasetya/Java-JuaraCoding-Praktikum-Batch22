package com.FilmBioskop;


import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {



    }
    public static void tampilkanMenu(){




        int i=0;
        int menu = 0;
        char ulang;

        do {
            System.out.println("=== Menu Utama ===\n");
            System.out.println("1. Tampilkan Daftar Film\n");
            System.out.println("2. Input Data Film\n");
            System.out.println("3. Cari Film\n");
            System.out.println("4. Keluar\n");
            System.out.print("Pilihan: ");


            switch(menu){
                case 1:

                    DaftarFilm d = new DaftarFilm();


                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:

            }

            System.out.println();



            System.out.println();
        }
        while (menu !=4);

        System.out.println("Terimakasih...");

    }
}






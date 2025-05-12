package com.juaracoding.FilmBioskop;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {


    }

    private static void inputFilm(String nama, String film) {

        Scanner judul = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Masukkan nama film:");
        System.out.print("Nama film dalam huruf besar:");
        nama = judul.nextLine();
        System.out.print("Masukkan nama film ");
        film = judul.toString();

        System.out.print("Nama film dalam huruf besar:");
        film = judul.ToUpper();

        System.out.println("Masukkan nama film " + nama);
        System.out.println("Nama film dalam huruf besar: " +film);



    }
}

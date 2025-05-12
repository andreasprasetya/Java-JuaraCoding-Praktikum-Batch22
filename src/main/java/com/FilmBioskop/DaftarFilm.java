package com.FilmBioskop;

import java.util.ArrayList;
import java.util.Scanner;

public class DaftarFilm {
    public static void main(String[] args){

            tampilkanFilm("gfhgfh", "1fdgfdgdf", "1", 5);
    }
    public  static  void tampilkanFilm(String judul, String genre, String durasi, int rating) {

        int[] arrayInt = new int[10];
        ArrayList<Integer> data = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Judul Film:");
            judul = judul.toString();
            System.out.println("Genre:");
            judul = judul.toString();
            System.out.println("Durasi:");
            judul = judul.toString();
            System.out.println("Rated:");
            int rated = rating;
            arrayInt[i] = Integer.parseInt(input.toString());
        }


    }
    }




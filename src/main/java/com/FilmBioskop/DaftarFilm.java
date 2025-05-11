package com.FilmBioskop;

public class DaftarFilm {
    public static void main(String[] args) {

    }

    public static void judul() {

        String[] titles={"Volvo,BMW,Ford,Mazda"};
        for (String title:titles){

            System.out.println(title.toUpperCase());
        }
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i].toUpperCase());
        }

    }
}


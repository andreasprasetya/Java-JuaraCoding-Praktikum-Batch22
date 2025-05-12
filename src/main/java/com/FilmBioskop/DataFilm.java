package com.FilmBioskop;



public class DataFilm {
    public static void main(String[] args) {

        tampilkanFilm("gfhgfh", "1fdgfdgdf", "1", 5);

    }

    // Data Film
    public static void tampilkanFilm(String judul, String genre, String durasi, int rating) {

        String[] title = {"KKN di Desa Penari", "AgaK Laen", "Jumbo", "Warkop DKI Reborn: Jangkrik Boss! Part 1",
                "Dilan", "Miracle in Cell No 7", "Dilan1991"};
        String[] genre1 = {"Horor", "Comedy", "Drama", "Comedy", "Drama", "Film Keluarga", "Roman"};
        String[] durasi1 = {" 2 Jam 1 menit", "1 Jam 59 Menit", " 1 Jam 42 Menit", " 1 Jam 50 Menit", " 1 Jam 50 Menit", " 2 Jam 25 Menit", "2 Jam 1 Menit"};
        int[] rated = {8, 9, 10, 9, 8, 10, 6};

        System.out.println("Tampilkan Film");


            int g = 0;
            System.out.println("Judul Film: "+title[g]);
            for (g = 0; g < title.length; g++) {
            }

            int h = 0;
            System.out.println("Genre: "+genre1[h]);
            for (h = 0; h < genre1.length; h++) {

            }
            int i=0;
            System.out.println("Durasi: "+ durasi1[i]);
            for (i = 0; i < durasi1.length; i++) {
            }

            int j=0;
            System.out.println("Rated Film: "+rated[j]);
            for (j = 0; j < rated.length; j++) {
            }


        }

    }



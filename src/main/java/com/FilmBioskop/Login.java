package com.FilmBioskop;

public class Login extends MainFilm {
    public static void main(String[] args) {

        login("admin",1234);

    }

    public static void login(String userName, int password) {

        System.out.println("User Name: "+userName);
        System.out.println("Password: "+password);



    }
}

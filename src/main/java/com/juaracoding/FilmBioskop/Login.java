package com.juaracoding.FilmBioskop;

import java.util.Scanner;

public class Login extends MainFilm {
    public static void main(String[] args) {








    }

    public static void login(String userName, int password) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("User Name: ");
        String name= scanner.toString();


        System.out.print("Password: ");
        int pass = scanner.nextInt();

        String userName1 = "Admin";
        String password1 = "08123456";
        boolean isRegistered = false;
        boolean isOTPReceived = false;
        boolean isOTPExpired = false;
        String inEmailOrPhoneNumber = scanner.nextInt();

        if (userName1.equals(inEmailOrPhoneNumber) && password1.equals(inEmailOrPhoneNumber)) {
            isRegistered = true;
            if (isRegistered) {
                isOTPReceived = true;
                if (isOTPReceived) {
                    System.out.println("Silahkan input OTP");
                    isOTPExpired = false;
                    if (isOTPExpired) {
                        System.out.println("Redirect ke Dashboard");
                    } else {
                        System.out.println("OTP Expired");
                    }
                } else {
                    System.out.println("Kirim ulang OTP");
                }

            }

        } else {
            System.out.println("User Name atau Password Belum Ada");
        }
    }
}



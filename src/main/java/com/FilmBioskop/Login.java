package com.FilmBioskop;

import java.util.Scanner;

public class Login extends MainFilm {
    public static void main(String[] args) {

        login("Admin",1234);


    }

    public static void login(String userName, int password) {

        String userName1="Admin";
        String password1="08123456";
        Scanner scanner= new Scanner(System.in);
        boolean isRegistered= false;
        boolean isOTPReceived= false;
        boolean isOTPExpired=false;
        System.out.print("User Name:");
        System.out.println("Password:");
        String inEmailOrPhoneNumber= scanner.next();

        if(userName1.equals(inEmailOrPhoneNumber) && password1.equals(inEmailOrPhoneNumber)){
            isRegistered = true;
            if(isRegistered){
                isOTPReceived = true;
                if(isOTPReceived){
                    System.out.println("Silahkan input OTP");
                    isOTPExpired = false;
                    if(isOTPExpired){
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



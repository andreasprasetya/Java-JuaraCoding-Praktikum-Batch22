package com.juaracoding;

import java.util.Scanner;

public class Percabanagan {

    public static void main(String[] args) {
        // jika user belum register

        String name = null;
        String password = null;
        if (name != null && password != null){

            System.out.println("Log in Berhasil");
        } else {

                 System.out.println(" Login Gagal");
        }

        // jika user belum register
        boolean isActive=false;
        if (isActive) {

            System.out.println("silahkan input username dan password");

        }else{

            System.out.println("maaf user belum registrasi");

            String userName = "juaracoding";
            boolean condition = userName.equalsIgnoreCase("juaracoding");
            System.out.println(condition);

//            String email="adminjuaracoding.com";
//            String password1 = "indonesia";
//
//            String inEmail="adminjuaracoding.com";
//            String inPassword1="indonesia";

            int menu=1;
            switch (menu){

                case 1:
                    System.out.println("tampilkan data");
                    break;

                case 2:
                    System.out.println("tambag data");
                    break;

                case 3:
                    System.out.println("edit data");
                    break;

                default:
                    System.out.println("invalid input");


            }


            int grade=80;
            String keterangan = grade>=75?"Lulus":"Belum Lulus";
            System.out.println(keterangan);

            String phoneNumber="08123456";
            String email="adminjuaracoding.com";
            Scanner scanner= new Scanner(System.in);
            boolean isRegistered= false;
            boolean isOTPReceived= false;
            boolean isOTPExpired=false;
            System.out.println("input Email/ nomor HP=*");
            String inEmailOrPhoneNumber= scanner.next();

            if(email.equals(inEmailOrPhoneNumber) || phoneNumber.equals(inEmailOrPhoneNumber)){
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
                System.out.println("Email / Nomor HP belum terdaftar");
            }
                }
            }
        }



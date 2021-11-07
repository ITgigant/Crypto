package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b) {
        int t;
        while(b != 0){
            t = a;
            a = b;
            b = t%b;
        }
        return a;
    }

    private static boolean relativelyPrime(int a, int b) {
        return gcd(a,b) == 1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("p должно быть сравним с 3 по модулю 4");
        System.out.println("Введите p:");
        int p = in.nextInt();

        if (p % 4 == 3){
            System.out.println("q должно быть сравним с 3 по модулю 4");
            System.out.println("Введите q:");
            int q = in.nextInt();

            if (q % 4 == 3){
                int m = p * q;
                System.out.println("Начальное значение Xo должно быть взаимно простым c произведением q*p");
                System.out.println("Введите Xo:");
                int Xo = in.nextInt();
                String bin = "";
                String parbit = "";
                String Gamma1 = "";
                String Gamma2 = "";
                String Gamma3 = "";
                if (relativelyPrime(Xo,m) == true){
                    for (int i=0; i<10; i++){
                        bin = Integer.toBinaryString(Xo);
                        String[] binArray = bin.split("");
                        String invertedbin = new StringBuilder(bin).reverse().toString();
                        String[] bininvArray = invertedbin.split("");
                        long count = bin.chars().filter(ch -> ch == '1').count();
                        if (count % 2 == 0){
                            parbit = "0";
                        }
                        else {
                            parbit = "1";
                        }
                        Gamma1 = Gamma1 + parbit;
                        Gamma2 = Gamma2 + bininvArray[0];
                        Gamma3 = Gamma3 + bininvArray[1]+bininvArray[0];
                        System.out.println(Xo + " " + bin + " " + parbit + " " + bininvArray[0] + " " + bininvArray[1]+bininvArray[0]);
                        Xo = (int) Math.pow(Xo,2) % m;
                    }
                    System.out.println("1 вариант гаммы из четных битов: " + Gamma1);
                    System.out.println("2 вариант гаммы из младших битов: " + Gamma2);
                    System.out.println("3 вариант гаммы из младших битов: " + Gamma3);
                }
                else {
                    System.out.println("q должно быть сравним с 3 по модулю 4 (q mod 4 = 3)");
                }
            }
            else {
                System.out.println("q должно быть сравним с 3 по модулю 4 (q mod 4 = 3)");
            }
        }
        else {
            System.out.println("p должно быть сравним с 3 по модулю 4 (p mod 4 = 3)");
        }



//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите свою фамилию:");
//        String surname = in.nextLine();
//        String surnameUpperCase = surname.toUpperCase();
//
//        String[] surnameArray = surnameUpperCase.split("");
//
//        int[] surnameNumArr = new int[surname.length()];
//        String strsurname = "";
//        String binsurname = "";
//        for(int i = 0; i < surname.length(); i++){
//            surnameNumArr[i] = alphabet.get(surnameArray[i]);
//            strsurname += Integer.toString(surnameNumArr[i]) + " ";
//        }
//        int sur = (surnameNumArr[0]);
//        System.out.println(Integer.toBinaryString(surnameNumArr[0]) + " " + alphabetint.get(surnameNumArr[0]));
//        for(int i = 1; i < surname.length(); i++){
//            sur = (sur^surnameNumArr[i]) ;
//            System.out.println(Integer.toBinaryString(surnameNumArr[i]) + " " + alphabetint.get(surnameNumArr[i]));
//        }
//        binsurname = Integer.toBinaryString(sur);
//        System.out.println("= " + binsurname + " = " + sur);
//        System.out.println();
//
//        String gamma = "";
//        String binsurname1;
//        String binsurname2;
//        for(int i = 0; i < 10; i++){
//            binsurname2 = binsurname;
//            String invertedbinsurname = new StringBuilder(binsurname).reverse().toString();
//            String[] binsurnameArray = invertedbinsurname.split("");
//            int b7 =  Integer.parseInt(binsurnameArray[0].trim()) ^ Integer.parseInt(binsurnameArray[2].trim()) ^ Integer.parseInt(binsurnameArray[3].trim()) ^ Integer.parseInt(binsurnameArray[4].trim());
//            gamma += binsurnameArray[0];
//            int sur1 = sur >> 1;
//            if (b7==1){
//                sur = sur1+128;
//            }else {
//                sur = sur1;
//            }
//            binsurname = Integer.toBinaryString(sur);
//            binsurname1 = Integer.toBinaryString(sur1);
//            while (binsurname.length() < 8){
//                binsurname = "0"+binsurname;
//            }
//            while (binsurname1.length() < 7){
//                binsurname1 = "0"+binsurname1;
//            }
//            while (binsurname2.length() < 8){
//                binsurname2 = "0"+binsurname2;
//            }
//            System.out.println((i+1) + ")  " + binsurname2 + " " + "b7=" + b7 + " " + binsurname1 + " " + binsurname);
//        }
//        System.out.println("Гамма: " + gamma);
    }
}

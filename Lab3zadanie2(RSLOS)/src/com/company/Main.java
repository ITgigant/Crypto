package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> alphabet = new HashMap();
        alphabet.put("А", 192);
        alphabet.put("Б", 193);
        alphabet.put("В", 194);
        alphabet.put("Г", 195);
        alphabet.put("Д", 196);
        alphabet.put("Е", 197);
        alphabet.put("Ж", 198);
        alphabet.put("З", 199);
        alphabet.put("И", 200);
        alphabet.put("Й", 201);
        alphabet.put("К", 202);
        alphabet.put("Л", 203);
        alphabet.put("М", 204);
        alphabet.put("Н", 205);
        alphabet.put("О", 206);
        alphabet.put("П", 207);
        alphabet.put("Р", 208);
        alphabet.put("С", 209);
        alphabet.put("Т", 210);
        alphabet.put("У", 211);
        alphabet.put("Ф", 212);
        alphabet.put("Х", 213);
        alphabet.put("Ц", 214);
        alphabet.put("Ч", 215);
        alphabet.put("Ш", 216);
        alphabet.put("Щ", 217);
        alphabet.put("Ъ", 218);
        alphabet.put("Ы", 219);
        alphabet.put("Ь", 220);
        alphabet.put("Э", 221);
        alphabet.put("Ю", 222);
        alphabet.put("Я", 223);


//        alphabet.put("А", (byte) 11000000);
//        alphabet.put("Б", (byte) 11000001);
//        alphabet.put("В", (byte) 11000010);
//        alphabet.put("Г", (byte) 11000011);
//        alphabet.put("Д", (byte) 11000100);
//        alphabet.put("Е", (byte) 11000101);
//        alphabet.put("Ж", (byte) 11000110);
//        alphabet.put("З", (byte) 11000111);
//        alphabet.put("И", (byte) 11001000);
//        alphabet.put("Й", (byte) 11001001);
//        alphabet.put("К", (byte) 11001010);
//        alphabet.put("Л", (byte) 11001011);
//        alphabet.put("М", (byte) 11001100);
//        alphabet.put("Н", (byte) 11001101);
//        alphabet.put("О", (byte) 11001110);
//        alphabet.put("П", (byte) 11001111);
//        alphabet.put("Р", (byte) 11010000);
//        alphabet.put("С", (byte) 11010001);
//        alphabet.put("Т", (byte) 11010010);
//        alphabet.put("У", (byte) 11010011);
//        alphabet.put("Ф", (byte) 11010100);
//        alphabet.put("Х", (byte) 11010101);
//        alphabet.put("Ц", (byte) 11010110);
//        alphabet.put("Ч", (byte) 11010111);
//        alphabet.put("Ш", (byte) 11011000);
//        alphabet.put("Щ", (byte) 11011001);
//        alphabet.put("Ъ", (byte) 11011010);
//        alphabet.put("Ы", (byte) 11011011);
//        alphabet.put("Ь", (byte) 11011100);
//        alphabet.put("Э", (byte) 11011101);
//        alphabet.put("Ю", (byte) 11011110);
//        alphabet.put("Я", (byte) 11011111);

        HashMap<Integer, String> alphabetint = new HashMap();
        alphabetint.put(192, "А");
        alphabetint.put(193, "Б");
        alphabetint.put(194, "В");
        alphabetint.put(195, "Г");
        alphabetint.put(196, "Д");
        alphabetint.put(197, "Е");
        alphabetint.put(198, "Ж");
        alphabetint.put(199, "З");
        alphabetint.put(200, "И");
        alphabetint.put(201, "Й");
        alphabetint.put(202, "К");
        alphabetint.put(203, "Л");
        alphabetint.put(204, "М");
        alphabetint.put(205, "Н");
        alphabetint.put(206, "О");
        alphabetint.put(207, "П");
        alphabetint.put(208, "Р");
        alphabetint.put(209, "С");
        alphabetint.put(210, "Т");
        alphabetint.put(211, "У");
        alphabetint.put(212, "Ф");
        alphabetint.put(213, "Х");
        alphabetint.put(214, "Ц");
        alphabetint.put(215, "Ч");
        alphabetint.put(216, "Ш");
        alphabetint.put(217, "Щ");
        alphabetint.put(218, "Ъ");
        alphabetint.put(219, "Ы");
        alphabetint.put(220, "Ь");
        alphabetint.put(221, "Э");
        alphabetint.put(222, "Ю");
        alphabetint.put(223, "Я");

//        alphabetint.put(11000000, "А");
//        alphabetint.put(11000001, "Б");
//        alphabetint.put(11000010, "В");
//        alphabetint.put(11000011, "Г");
//        alphabetint.put(11000100, "Д");
//        alphabetint.put(11000101, "Е");
//        alphabetint.put(11000110, "Ж");
//        alphabetint.put(11000111, "З");
//        alphabetint.put(11001000, "И");
//        alphabetint.put(11001001, "Й");
//        alphabetint.put(11001010, "К");
//        alphabetint.put(11001011, "Л");
//        alphabetint.put(11001100, "М");
//        alphabetint.put(11001101, "Н");
//        alphabetint.put(11001110, "О");
//        alphabetint.put(11001111, "П");
//        alphabetint.put(11010000, "Р");
//        alphabetint.put(11010001, "С");
//        alphabetint.put(11010010, "Т");
//        alphabetint.put(11010011, "У");
//        alphabetint.put(11010100, "Ф");
//        alphabetint.put(11010101, "Х");
//        alphabetint.put(11010110, "Ц");
//        alphabetint.put(11010111, "Ч");
//        alphabetint.put(11011000, "Ш");
//        alphabetint.put(11011001, "Щ");
//        alphabetint.put(11011010, "Ъ");
//        alphabetint.put(11011011, "Ы");
//        alphabetint.put(11011100, "Ь");
//        alphabetint.put(11011101, "Э");
//        alphabetint.put(11011110, "Ю");
//        alphabetint.put(11011111, "Я");



        Scanner in = new Scanner(System.in);
        System.out.println("Введите свою фамилию:");
        String surname = in.nextLine();
        String surnameUpperCase = surname.toUpperCase();

        String[] surnameArray = surnameUpperCase.split("");

        int[] surnameNumArr = new int[surname.length()];
        String strsurname = "";
        String binsurname = "";
        for(int i = 0; i < surname.length(); i++){
            surnameNumArr[i] = alphabet.get(surnameArray[i]);
            strsurname += Integer.toString(surnameNumArr[i]) + " ";
        }
        int sur = (surnameNumArr[0]);
        System.out.println(Integer.toBinaryString(surnameNumArr[0]) + " " + alphabetint.get(surnameNumArr[0]));
        for(int i = 1; i < surname.length(); i++){
            sur = (sur^surnameNumArr[i]) ;
            System.out.println(Integer.toBinaryString(surnameNumArr[i]) + " " + alphabetint.get(surnameNumArr[i]));
        }
        binsurname = Integer.toBinaryString(sur);
        System.out.println("= " + binsurname + " = " + sur);
        System.out.println();

        String gamma = "";
        String binsurname1;
        String binsurname2;
        for(int i = 0; i < 10; i++){
            binsurname2 = binsurname;
            String invertedbinsurname = new StringBuilder(binsurname).reverse().toString();
            String[] binsurnameArray = invertedbinsurname.split("");
            int b7 =  Integer.parseInt(binsurnameArray[0].trim()) ^ Integer.parseInt(binsurnameArray[2].trim()) ^ Integer.parseInt(binsurnameArray[3].trim()) ^ Integer.parseInt(binsurnameArray[4].trim());
            gamma += binsurnameArray[0];
            int sur1 = sur >> 1;
            if (b7==1){
                sur = sur1+128;
            }else {
                sur = sur1;
            }
            binsurname = Integer.toBinaryString(sur);
            binsurname1 = Integer.toBinaryString(sur1);
            while (binsurname.length() < 8){
                binsurname = "0"+binsurname;
            }
            while (binsurname1.length() < 7){
                binsurname1 = "0"+binsurname1;
            }
            while (binsurname2.length() < 8){
                binsurname2 = "0"+binsurname2;
            }
            System.out.println((i+1) + ")  " + binsurname2 + " " + "b7=" + b7 + " " + binsurname1 + " " + binsurname);
        }
        System.out.println("Гамма: " + gamma);


//        String[] binarray = new String[8];
//        String[] binarray1 = Integer.toBinaryString(sur).split("");
//        if (binarray1.length < 8){
//            for(int i = 0; i < 8-binarray1.length; i++){
//                binarray[i] = "0";
//            }
//            for (int i=8-binarray1.length; i<8; i++){
//                binarray[i] = binarray1[i-8+binarray1.length];
//            }
//        }else{
//            binarray = binarray1;
//        }
//        int b7;
//        int[] gamma = new int[10];
//        String strsur;
//        int razn = 0;
//        for (int j = 0; j<10; j++){
//            gamma[j] = Integer.parseInt(binarray[7].trim());
//            b7 =  Integer.parseInt(binarray[3].trim()) ^ Integer.parseInt(binarray[4].trim()) ^ Integer.parseInt(binarray[5].trim()) ^ Integer.parseInt(binarray[7].trim());
//            sur = sur >> 1;
//            binarray = Integer.toBinaryString(sur).split("");
//
//            if (binarray.length < 8){
//                for(int i = 0; i < 8-binarray.length; i++){
//                    binarray1[i] = "0";
//                }
//                for (int i=8-binarray.length; i<8; i++){
//                    binarray1[i] = binarray[i-8+binarray.length];
//                }
//            }else{
//                binarray1 = binarray;
//            }
//
//            binarray1[0]=Integer.toString(b7);
////            for (int i=1; i<8; i++){
////                while (binarray.length<8){
////                    binarray1[i] = "0";
////                    razn += 1;
////                    binarray[] += "1";
////                }
////                binarray1[i] = binarray[i-razn];
////            }
//            for(int i = 0; i < 8; i++){
//                System.out.print(binarray1[i]);
//            }
//            binarray = binarray1;
//            strsur = (binarray[0].trim()+binarray[1].trim()+binarray[2].trim()+binarray[3].trim()+binarray[4].trim()+binarray[5].trim()+binarray[6].trim()+binarray[7].trim());
//            sur = Integer.parseInt(strsur,2);
//            System.out.println();
//
//        }
//        for (int i =0; i<10; i++){
//            System.out.print(gamma[i]);
//        }



//        System.out.println("Введите гамму:");
//        String gamma = in.nextLine();
//        String gammaUpperCase = gamma.toUpperCase();
//
//        String[] gammaArray1 = gammaUpperCase.split("");
//        String[] gammaArray = new String[surname.length()];
//        for (int i = 0; i < surname.length(); i++){
//            gammaArray[i] = gammaArray1[i % gamma.length()];
//        }
//
//        int[] gammaNumArr = new int[surname.length()];
//        String strgamma = "";
//        String bingamma = "";
//        for(int i = 0; i < surname.length(); i++){
//            gammaNumArr[i] = alphabet.get(gammaArray[i]);
//            strgamma += Integer.toString(gammaNumArr[i]) + " ";
//            bingamma += Integer.toBinaryString(gammaNumArr[i]) + " ";
//        }
//
////        for(int i = 0; i < gamma.length(); i++){
////            System.out.println(gammaNumArr[i]);
////        }
//
//        int[] resultArray = new int[surname.length()];
//        String strresult = "";
//        String binresult = "";
//        for (int i = 0; i < surname.length(); i++){
//            resultArray[i] = (gammaNumArr[i] ^ surnameNumArr[i]);
//            strresult += Integer.toString(resultArray[i]) + " ";
//            binresult += Integer.toBinaryString(resultArray[i]) + " ";
//        }
//        System.out.println();
//
////        for (int i = 0; i < surname.length(); i++){
////            System.out.println(resultArray[i]);
////        }
//
////        String result = "";
////        for (int i = 0; i < surname.length(); i++){
////            result += alphabetint.get(resultArray[i]);
////        }
//
//        System.out.println(surname);
//        System.out.println(strsurname);
//        System.out.println(binsurname);
//        System.out.println();
//        System.out.println(gamma);
//        System.out.println(strgamma);
//        System.out.println(bingamma);
//        System.out.println();
//        System.out.println(strresult);
//        System.out.println(binresult);
    }
}

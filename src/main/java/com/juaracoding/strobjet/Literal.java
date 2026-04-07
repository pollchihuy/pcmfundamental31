package com.juaracoding.strobjet;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Literal {

    public static void main(String[] args) {
        int intX = 4;
        double doY = 3.1;
        String strX = "ok";
        System.out.println(strX+intX+doY);

        String isi = "isiString";
        System.out.println(isi);
        System.out.println(isi.toUpperCase());
        String tokenPWT = "1090940#1201920945";
        System.out.println("Length tokenPWT : "+tokenPWT.length());
        int intLength = tokenPWT.length();
        for (int i = 0;
             i < intLength;
             i++) {
            System.out.println(tokenPWT.charAt(6));
        }
//        char [] chArr = tokenPWT.toCharArray();// {'1','0',}
//        System.out.println("char Array : "+chArr[6]);
//        System.out.println("Pakai charAt : "+tokenPWT.charAt(6));
//        for (int i = 0; i < chArr.length; i++) {
//            System.out.println(chArr[i]);
//            System.out.println(tokenPWT.charAt(i));
//        }

//        String strCallAPI = callAPI(data);// I/O
//        getUsername(String token);//30
//        getEmail(String token);
//        getNoHp(String token);
//        getUserID(String token);
//        String [] strArr = extractToken(String token);//30
//        strArr[0]
//        strArr[1]
//        strArr[2]
//        strArr[3]
//        strArr[1]

    }
}

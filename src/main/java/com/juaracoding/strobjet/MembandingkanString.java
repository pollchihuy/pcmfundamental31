package com.juaracoding.strobjet;

public class MembandingkanString {

    public static void main(String[] args) {
        String strA = "adi";//lower
        String strB = new String("Adi");//lower
//        System.out.println("pakai == : "+(strA==strB));
        System.out.println("pakai equals : "+strA.equalsIgnoreCase(strB));
        //jwt
        String strJwt = "Bearer 01j0ioiwjwio0ehr0ih10239.091u230123no1ih";
        System.out.println("Token asli : "+strJwt.substring(7));
        String strWelcome = "Welcome";
        System.out.println("strWElcome 3 sd 5 "+strWelcome.substring(3,5));
    }
}

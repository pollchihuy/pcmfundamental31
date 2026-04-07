package com.juaracoding.strobjet;

public class Concatenation {

    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "DEF";
        System.out.println(str1.concat(str2));
        System.out.println(str1+str2);
        StringBuilder sBuild = new StringBuilder();
        System.out.println(sBuild.append(str1).append(str2).
                append("b").append("c").append("d").append(str1).
                append(str2).append("b").append("c").append("d").
                append(str1).append(str2).append("b").append("c").append("d").append(str1).append(str2).append("b").append("c").
                append("d").append(str1).append(str2).append("b").append("c").append("d").append(str1).append(str2).append("b").append("c").append("d").toString());
        sBuild.setLength(0);
        System.out.println("Isi sBuild --> "+sBuild.toString());
    }
}

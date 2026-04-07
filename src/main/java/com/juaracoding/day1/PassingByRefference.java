package com.juaracoding.day1;

public class PassingByRefference {

    public static void main(String[] args) {
        ClassA a = new ClassA();//2f4d3709
        System.out.println("isi dari object a "+a);
        a.intX = 20;
        System.out.println("niali intX dari object a : "+a.intX);
        ClassA a1 = a;
        a1.intX = 40;
        System.out.println("niali ke 2 intX dari object a : "+a.intX);
    }
}

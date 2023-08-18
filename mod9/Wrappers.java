package br.com.paulosa;

import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {
        int x = 10;
        int y = 20; int z = 12;
        double a = 3; double b = 1;
        double c = (double)x/y;
        int h = (int) c;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("h = "+h);
    }
}
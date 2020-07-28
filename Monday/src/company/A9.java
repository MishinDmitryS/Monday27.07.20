package company;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args){
        System.out.println("Простые числа");
        System.out.println("1");
        for (int i = 2; i<=100; i++) {
            boolean W = true;
            for (int j = 2; j < i; j++) {

                if ((i % j) == 0) {
                    W = false;
                }

            }
            if (W) System.out.println(i);
        }

    }
}
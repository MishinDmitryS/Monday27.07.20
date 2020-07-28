package company;

import java.util.Scanner;

public class A10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //System.out.println();

        int n = in.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(0);

        System.out.println(1);

        for(int i = 2; i < n; i++){
            int f = a + b;

            System.out.println(f);

            a = b;

            b = f;
        }

    }
}
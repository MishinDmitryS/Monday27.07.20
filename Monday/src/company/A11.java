package company;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //System.out.println();

        int a = in.nextInt();
        int b = in.nextInt();

        int random = (int)(Math.random()*((b-a)+1))+a;

        System.out.println(random);
    }
}
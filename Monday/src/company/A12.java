package company;

import java.util.Scanner;

public class A12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s;

        s = in.nextLine();

        int n = in.nextInt();

        for(int i = 0; i <= s.length() - 1; i++){
            if(i != n){
                System.out.print(s.charAt(i));
            }
        }
    }
}
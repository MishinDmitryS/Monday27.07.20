package company;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean t = true;

        for (int i = 0; i < s.length() / 2; ++i) {

            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println("False");
                t = false;
                break;

            }
        }

        if (t){
            System.out.println("True");
        }


    }
}

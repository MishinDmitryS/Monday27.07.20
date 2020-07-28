package company;

import java.util.Scanner;

public class A15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a, b, c, d, B, B1;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        d = 4*b - a * c;

        if(d < 0){
            System.out.println("Нет решения");
        } else if(d == 0) {
            B = b*b / (2*a);
            System.out.println("Ответ " + B);
        } else if(d > 0 ) {
            B = (b*b - Math.sqrt(d) ) / (2*a);
            B1 = (b*b + Math.sqrt(d) ) / (2*a);

            System.out.println("Ответ " + B + "  " + B1);
        }

    }
}
package company;

import java.util.Scanner;

public class A18 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if((a > 89) && (b > 89) && (c > 89)){
            System.out.println("Нет решения");
        } else if((a+b+c) != 180){
            System.out.println("Нет решения");
        } else if((a > 90) || (b > 90) || (c > 90)){
            System.out.println("Тупоугольный");
        } else if((a < 90) && (b < 90) && (c < 90)){
            System.out.println("Остроугольный");
        } else if((a == 90) || (b == 90) || (c == 90)) {
            System.out.println("Прямоугольный");
        }
    }
}
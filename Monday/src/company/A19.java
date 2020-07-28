package company;

import java.util.Scanner;

public class A19 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str[] = {"null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };

        int Numb = in.nextInt();

        while(Numb > 0){
            if(Numb == 100){
                System.out.println("C");
                Numb = 0;
                break;
            } else
            if(Numb >= 90){
                System.out.print("XC");
                Numb -= 90;

            }else
            if(Numb >= 50){
                System.out.print("L");
                Numb -= 50;
                continue;
            } else
            if(Numb >= 10){
                System.out.print("X");
                Numb -= 10;
                continue;
            } else
            if(Numb < 10){
                String s = str[Numb];
                System.out.print(s);
                Numb = 0;
                break;
            }
        }
    }
}
package company;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double Numb;

        boolean Z;
        Z = true;
        Numb = in.nextDouble();

        if ((int)Numb < 4){
            System.out.println("Число простое");
            //break;
        }
        else{
            for (int i=2; i<=Numb/2; i++) {
                int w = (int) Numb % i;
                if (w == 0) {
                    System.out.println("Число не простое");

                    Z = false;

                    break;
                }

            }
            if(Z) {System.out.println("Число простое");}
        }

    }
}

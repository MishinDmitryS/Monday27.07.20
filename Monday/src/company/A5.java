package company;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int Chislo , i;

        double Numb = in.nextDouble();

        i = 0;
        Chislo = 0;

        do{
            i = Chislo;

            Chislo = i + (int)Numb % 10;

            Numb /= 10;
        }while(Numb > 1);

        System.out.println(Chislo);
    }
}

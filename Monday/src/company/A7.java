package company;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double Numb = in.nextDouble();



        if((Numb == 0) || (Numb == 1) ){
            System.out.println(Numb);
        }

        for(int i = 1; i < Numb; i++){
            double Numb2 = Numb / (double)i;

            Numb2 -= (int)(Numb / i);

            if (Numb2 == 0 ){
                System.out.println(i);
            }
        }

    }
}

package company;

import java.util.Scanner;

public class A14 {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str[] = {"null", "A", "B", "C", "D", "E", "F", "G","H", "I", "J", "K","L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V","W", "X", "Y", "Z"};

        int m = (int) (Math.random() * 26) + 1;

        String Text = str[m];

        //System.out.println(Text);

        for(;;){
            System.out.println("Угадайте букву A-Z");
            String s = in.nextLine();

            if(s.equals(Text)){
                System.out.println("Right");
                break;
            }

            int prov = 28;
            for(int i = 0; i <= str.length; i++){
                if(s.equals(str[i])){
                    prov = i;
                    break;
                }


            }

            if(prov < m){
                System.out.println("You’re too low");
            }

            if(prov > m){
                System.out.println("You’re too high");
            }

        }
    }
}
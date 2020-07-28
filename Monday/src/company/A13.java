package company;

import java.util.ArrayList;
import java.util.Scanner;

public class A13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //System.out.print();

        System.out.println("Введите число");
        int n = in.nextInt();
        boolean Exitt = false;



        ArrayList<Integer> nums = new ArrayList<>();



        for (int i = 0; i <= n; i++ )
        {
            int Z = (int)((Math.random() * ( 50)) + 1);
            nums.add(Z);
        }


        System.out.println("введите цифру: 1, 2, 3");
        for(int WW = 1; WW < 1000; WW++) {
            n = in.nextInt();

            switch (n) {
                case 1: {
                    for(Integer x: nums){
                        System.out.print(x);
                        System.out.print(" ");
                        System.out.println();

                    }
                    break;
                }

                case 2: {
                    int Size = nums.size();
                    int k = Size;
                    Size *= 1.1;
                    for(int i = 0; i <= (Size-k); i++ ){
                        int Z = (int)((Math.random() * ( 50)) + 1);
                        nums.add(Z);
                    }
                    break;
                }

                case 3: {
                    Exitt = true;
                    break;
                }
            }


            if(Exitt) {
                break;
            }
            System.out.println("введите цифру: 1, 2, 3");
        }
    }
}
package company;

import java.util.Scanner;

public class A17 {
    public static void main(String[] args){
        //System.out.println(3);
        Scanner in = new Scanner(System.in);
        int[][] Mass = new int[6][7];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                Mass[i][j] = (int)(Math.random() * 9) + 1;
                //System.out.print(Mass[i][j] + "  ");
            }
            //System.out.println();
        }

        //System.out.println(1);

        for(int i = 0; i < 6; i++){
            for(int x = 0; x < 6; x++){
                for(int j = 0; j < 6; j++) {
                    if (Mass[i][j] > Mass[i][j + 1]) {
                        int b = Mass[i][j];
                        Mass[i][j] = Mass[i][j + 1];
                        Mass[i][j + 1] = b;
                        //System.out.println(22);
                    }
                }
            }
        }

        //System.out.println(2);

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(Mass[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
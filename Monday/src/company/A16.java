package company;


public class A16 {
    public static void main(String[] args){
        int v = 50000;

        int result = 0;

        for(int i = 0; i <= v; i++){
            //boolean z = ;
            if(Vl(i)) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean Vl(int a){
        boolean z = false;

        do{
            if((a%10) == 2){
                z = true;
                break;
            }
            a /= 10;
        } while(a>1);

        return z;
    }
}
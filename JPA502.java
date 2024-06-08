import java.util.Scanner;
public class JPA502{
    public static void main(String[] argv) {
        Scanner scn = new Scanner(System.in);
        int finish;
        while (true) {
            System.out.printf("Input n ( 0 <= n <= 16 ):");
            int num = scn.nextInt();
            if (num == 999){
                scn.close();
                break;
            }
            else{
                int first = 1;
                for (int i = 1;i <= num;i++){
                    first *= i;
                }   
                System.out.println(num+"的階乘(迴圈) = "+first);
                finish = facTail(num-1 , num);
                System.out.println(num+"的階乘(尾遞迴) = "+finish);
            }
        }
    }
    public static int facTail(int a, int b){
        if  (a==1){  
            return b;} 
        else   
            return facTail(a-1,a*b); 
    }
}

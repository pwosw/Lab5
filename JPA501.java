
import java.util.Scanner;
public class JPA501{
    public static void main(String[] argv) {
        Scanner scn = new Scanner(System.in);
        int total;
        while (true) {
            System.out.printf("Input n (0<=n<=16):");
            int num = scn.nextInt();
            if (num == 999){
                scn.close();
                break;
            }
            else{
                total = fac(num);
                System.out.println(num+"的階乘 = "+total);
            }
        }
    }
    static int fac(int i){
        if(i==0) 
        return 1;  
        else   
        return  i*fac(i-1);
    }
}


import java.util.Scanner;
public class JPA504 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Input the number:");
        int n = scn.nextInt();
        System.out.println("Ans:"+sum2(n));
        scn.close();
    }
    static int sum2(int m){
        if(m==1)   
            return 2; 
        else {
            int sum = 0; 
            sum += sum2(m-1)+2*m; 
            return sum; }
    }
}

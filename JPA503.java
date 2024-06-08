import java.util.Scanner;
public class JPA503 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Input m:");
        int a = scn.nextInt();
        while (a!=999) {
            System.out.printf("Input n:");
            int b = scn.nextInt();
            System.out.printf("最大公因數為：%d\n", gcd(a, b));
            System.out.printf("Input m:");
            a = scn.nextInt();
        }
    }
    static int gcd(int m,int n){
        if (n==0){
            return m;
        }
        else{
            return gcd(n , m % n);
        }
    }
}

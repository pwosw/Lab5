
import java.util.Scanner;
public class JPA506 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int c_num = 5;
        int x = 5;
        int y = 10;
        double a = 10;
        double b = 5;
        System.out.println("圓形面積為:"+calCircle(c_num));
        System.out.println("三角形面積為:"+calTriangle(a, b));
        System.out.println("長方形面積為:"+calRectangle(x, y));
        System.out.println("此圖形面積為:"+(calCircle(c_num)+calRectangle(x, y)+calTriangle(a, b)));
    }
    public static double calCircle(int c_num){
        double PI = 3.1415926;
        return c_num *c_num* PI;
    }
    public static int calRectangle(int x,int y){
        return x*y;
    }
    public static double calTriangle(double a,double b){
        return (a*b)/2;
    }
}

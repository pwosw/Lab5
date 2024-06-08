import java.util.Scanner;

public class JPA505 {
    static Scanner scn = new Scanner(System.in);
    static int count_1 = 0;
    static double count_2 = 0;
    static String count;

    public static void main(String[] args) {
        System.out.println("Adding two integers:");
        String intInput = scn.nextLine();
        String[] intArray = intInput.split(",");
        int i = Integer.parseInt(intArray[0]);
        int j = Integer.parseInt(intArray[1]);
        add(i, j);

        System.out.println("Adding two doubles:");
        String doubleInput = scn.nextLine();
        String[] doubleArray = doubleInput.split(",");
        double x = Double.parseDouble(doubleArray[0]);
        double y = Double.parseDouble(doubleArray[1]);
        add(x, y);

        System.out.println("Adding two strings:");
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        add(s1, s2);

        System.out.println(count_1 + " " + count_2 + " " + count);
    }

    public static void add(int i, int j) {
        count_1 = i + j;
    }

    public static void add(double i, double j) {
        count_2 = i + j;
    }

    public static void add(String i, String j) {
        count = i + j;
    }
}

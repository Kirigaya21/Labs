import java.util.Scanner;

import static java.lang.Math.*;

public class Lab1 {
    public static void main(String[] args) {
        double x = 1.72;
        double a = 2.1;
        double b = -1.24;
        double c = 2.17;

        Scanner sc = new Scanner(System.in);
        System.out.print("x:");
        x = sc.nextDouble();
        System.out.print("a:");
        a = sc.nextDouble();
        System.out.print("b:");
        b = sc.nextDouble();
        System.out.print("c:");
        c = sc.nextDouble();
        System.out.println(pow(a, sqrt(x - b)) / (3 * pow(x, 3) - c * pow(x, 2) + b));
    }
}

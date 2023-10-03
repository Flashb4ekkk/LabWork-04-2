import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        double x, xp, xk, dx, A, B, y = 0;
        System.out.print("xp = ");
        xp = skan.nextDouble();
        System.out.print("xk = ");
        xk = skan.nextDouble();
        System.out.print("dx = ");
        dx = skan.nextDouble();

        DecimalFormat df1 = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.000");

        System.out.println("------------------------");
        System.out.println("| " + String.format("%7s", "x") + " | " + String.format("%10s", "y") + " |");
        System.out.println("------------------------");

        x = xp;
        while (x <= xk) {
            A = 2 * Math.abs(5 - x);
            if (x <= -1) {
                B = Math.exp(Math.abs(2 + x));
            } else {
                if (x > -1 & x < 1) {
                    B = Math.pow(Math.sin(1 / Math.abs(2 + x)), 2);
                } else {
                    B = (Math.pow(Math.cos(x), 2)) / (1 + Math.abs(Math.sin(x)));
                }
            }
            y = A - B;
            System.out.println("| " + String.format("%7s", df1.format(x)) + " | " + String.format("%10s", df2.format(y)) + " |");
            x += dx;
        }
        System.out.println("------------------------");
    }
}
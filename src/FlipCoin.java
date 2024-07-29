import java.util.Scanner;
import java.util.*;

import static java.lang.Math.random;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tailsCount = 0;
        int headCount = 0;
        if (n < 0) {
            System.out.println("Take positive number");
        } else {
            for (int i = 0; i < n; i++) {
                double val = random();

                if (val < 0.5) {
                    tailsCount++;
                } else {
                    headCount++;
                }

            }
            System.out.println((int) (((float) headCount / n) * 100));
            System.out.println((int) (((float) tailsCount / n) * 100));

        }
    }
}
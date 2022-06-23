/** @author: Zhadan Sasha, group TZ-91
 * Lab 03, Task 9
 * data:01.06.2022
 * */
import java.util.Scanner;
public class Lab3_TASK9 {
    public static double equationOfSum(int t, int n, int l) {

        double sum = 0;
        if (l % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                double equation = (1 / (Math.sqrt(t))) * l;
                sum += equation;
            }

        } else {
            for (int i = 1; i <= n; i++) {
                double equation = l / t;
                sum += equation;
            }
        }
        return sum;
    }



    static void outputResults(int t, int n, int l, double result) {
        System.out.println("t=" + t + ";\nn=" + n + "\nl=" + l + ";\nvalue sum of series=" + result + ";");
    }

    public static void main(String[] args) {
        Lab3_TASK9 numeration = new Lab3_TASK9();
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Please specify a variable t:");
            int t = in.nextInt();
            System.out.print("Please specify a value n:");
            int n = in.nextInt();
            System.out.print("Please specify a variable l:");
            int l = in.nextInt();
            double result = numeration.equationOfSum(t, n, l);
            numeration.outputResults(t, n, l, result);
        } catch (Exception e) {
            System.out.print("IllegalArgumentExceptio");
        }

    }
}
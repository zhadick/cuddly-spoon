/** @author: Zhadan Sasha, group TZ-91
 * Lab 03, Task 15
 * data:01.06.2022
 * */
import java.util.Scanner;
public class Lab3_TASK15 {
    public static double sum(int n) {
        int i = 1;
        double sum = 0;
        double ex = Math.abs(Math.E);
        if (n <= ex) {
            double result = (Math.pow(-1,(i+1)))/(i*(i+1)*(i+2));
            sum += result * n;

        }
        else {
            throw new IllegalArgumentException(String.valueOf(n));
            /* System.out.print("Перевірте введені значення"); */
        }
        return sum;
    }

    public static void output(int n, double result) {
        System.out.println("\nn=" + n + ";\nСума ряду=" + result);
    }

    public static void main(String[] args) {
        Lab3_TASK15 numeration = new Lab3_TASK15();
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введіть n:");
            int n = in.nextInt();
            double result = numeration.sum(n);
            numeration.output( n, result);

        } catch (Exception e) {
            System.out.print("Перевірте введені значення");
        }

    }
}


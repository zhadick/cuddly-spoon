/** @author: Zhadan Sasha, group TZ-91
 * Lab 02, Task 3
 * data:01.06.2022
 * */
public class Lab2T3 {
    public static void main(String[] args) {
        double a = 0.345;
        double b = -2.25;
        double c = 2.65;
        double d = 3.99;

        System.out.println("Task 24:");

        double num1 = Math.cos(b) + Math.sin(Math.sqrt(a));
        double num2 = Math.log(c);
        double num3 = Math.pow(Math.E, d);
        double num4 = 2 * num2 + num3;

        double result24 = num1 / num4;

        System.out.println(result24);

    }
}

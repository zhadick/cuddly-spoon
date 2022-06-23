/** @author: Zhadan Sasha, group TZ-91
 * Lab 03, Task 3
 * data:01.06.2022
 * */
import java.util.Scanner;
public class Lab3_TASK3 {
    public static double equationOfSum(double z, int k) { //створюємо медо з параметрами z u k
        double sum = 0; //створюємо параметр двоїчної точності суми
        if (k < 15) { //вказуєм умови
            for (int i = 1; i <= k; i++) { //цикл буде працювати до тих пір пока число і не перестане соотвестувати умові
                double equation = ((1 / Math.sqrt(z * i)) + Math.tan(k / i)); //записуєм приклад із умови лаб.роботи
                sum += equation; //прирівнюєммо значення отримане в результаті вичесления прикладу до парарметру sum
            }


        }
        return sum; //повертаємо значення sum

    }


    static void outputResults(double z, int k, double result) { //створюємо статический метод з параметрами
        if (result != 0) { //пишем умову "якщо result не рівний 0"
            System.out.println("z=" + z + ";\nk=" + k + ";\nvalue sum of series=" + result + ";");
        }

        if (result == 0) { //пишем умову "якщо result рівний 0"
            System.out.print(" Warning value k >=15");
        }
    }

    public static void main(String[] args) {
        Lab3_TASK3 numeration = new Lab3_TASK3(); //створюємо екземпляр файла
        Scanner in = new Scanner(System.in);
        try { //якщо введені значення не відповідають умові завдання вище,програма могла піймати помилку в catch і видати повідомлення про помику
            System.out.print("Please specify a variable z:");
            double z = in.nextDouble();
            System.out.print("Please specify a value k:");
            int k = in.nextInt();
            double result = numeration.equationOfSum(z, k);
            numeration.outputResults(z, k, result);
        } catch (Exception e) {
            System.out.print("IllegalArgumentExceptio");
        }

    }
}

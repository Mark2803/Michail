/*
Напишите программу, которая считает сумму всех чисел
от 1 до n, где n — это число, введенное пользователем.
 */
import java.util.Scanner;
public class CountNumTillN {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int n = 0;

            for (int i = num; i >= 1; i--) {
                // int n = num;
                n = n + num;
                num--;
            }
            System.out.println(n);
        }

    }
}
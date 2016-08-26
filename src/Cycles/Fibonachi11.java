package Cycles;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 * Created by drkomp on 26.08.2016.
 */
public class Fibonachi11 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        System.out.println("1 Fibonachi's number is " + n1);
        System.out.println("2 Fibonachi's number is " + n2);
        for (int i = 3; i < 12; i++) {
            n3 = n1 + n2;
            System.out.println(i + " Fibonachi's number is " + n3);
            n1=n2;
            n2=n3;
        }
    }
}

package recursion;

import java.util.Scanner;

/**
 * Created by drkomp on 27.08.2016.
 * •	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class  SumN {
    public static int sum0toN(int n) {
        return n < 1 ? 0 : (n + sum0toN(n - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates sum of number from 1 to n.");
        System.out.println("For exit type 0");
        int n;
        do{
            System.out.print("Enter n: ");
            n=input.nextInt();
            System.out.println("Sum 1 to "+n+" is: "+sum0toN(n));
        }while (n>0);
    }
}

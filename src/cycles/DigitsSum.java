package cycles;
import java.util.Scanner;
/**
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
 * (заранее не известно сколько цифр будет в числе).
 * Created by drkomp on 26.08.2016.
 */
public class DigitsSum {
    long n;
    int sumDigits;
    public void go(){
        Scanner input = new Scanner(System.in);
        System.out.println("For exit type 0");
        do {
            System.out.print("Enter a number for calculate the sum of digits (max 18 digits): ");
            sumDigits = 0;
            n = input.nextLong();
            while(n!=0){
                sumDigits+=n%10;
                n=n/10;
            }
            System.out.println("The sum of digits is: "+sumDigits);
        } while(sumDigits != 0);
    }
    public static void main(String[] args){
        DigitsSum tsk = new DigitsSum();
        tsk.go();
    }
}

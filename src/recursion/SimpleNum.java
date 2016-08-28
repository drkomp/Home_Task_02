package recursion;

import java.util.Scanner;

/**
 * Created by drkomp on 27.08.2016.
 * •	Создайте код, который выводит все простые числа из интервала от 2 до n
 * (заданного с клавиатуры). Результат должен быть: 2,3,5,7 ...
 */
public class SimpleNum {
    public static boolean isSimpleNum (int exNum, int deviderSrart){
        if(deviderSrart+deviderSrart > exNum)return true;
        if(exNum%deviderSrart ==0)return false;
        else return isSimpleNum(exNum, deviderSrart+1);
    }
    private static void printSimpleNumSequence(int n){
        if(n <= 2){
            System.out.print(n+",");
            return;
        }
        printSimpleNumSequence(n-1);
        if(isSimpleNum(n,2)) System.out.print(n+",");
        return;

    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("This program prints simple number from 2 to n. To exit type 0");
        do{
            System.out.print("Enter n: ");
            n=input.nextInt();
            if(n==0) break;
            printSimpleNumSequence(n);
            System.out.print("\n");
        }while( true);
    }
}

package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by drkomp on 27.08.2016.
 * •	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых
 * чисел из отрезка [10;99]. Вывести массив на экран.
 */
public class RandomArray5x8 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] randomArray = new int[8][5];
        for (int i = 0; i < randomArray.length; i++){
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = 10 + r.nextInt(90);
            }
            System.out.println( Arrays.toString(randomArray[i]));
        }
    }
}

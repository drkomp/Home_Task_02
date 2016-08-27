package Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by drkomp on 27.08.2016.
 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением
 * элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class RandomArray7x4 {
    public static void main(String[] args) {
        Random r = new Random();
        int currMult;
        int maxMult = 0;
        int maxMultRowIndex = 0;
        int[][] randomArray = new int[7][4];
        for (int i = 0; i < randomArray.length; i++) {
            currMult = 1;
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = r.nextInt(11) - 5;
                currMult = currMult * randomArray[i][j];
            }
            System.out.println(Arrays.toString(randomArray[i]));
            if (maxMult < Math.abs(currMult)) {
                maxMult = Math.abs(currMult);
                maxMultRowIndex = i;
            }
        }
        System.out.println("The Row with maximum multiplication has index "+maxMultRowIndex);
    }
}

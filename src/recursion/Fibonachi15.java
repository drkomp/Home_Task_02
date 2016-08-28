package recursion;

/**
 * Created by drkomp on 28.08.2016.
 * Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент
 * последовательности Фибоначчи для вычисления пятнадцатого элемента.
 */
public class Fibonachi15 {
    static int fibonachi4calcs = 0;

    public static int getFibonachiNum(int index) {
        if (index == 4) fibonachi4calcs++;
        if (index == 1) return 1;
        if (index <= 0) return 0;
        return getFibonachiNum(index - 1) + getFibonachiNum(index - 2);
    }

    public static void main(String[] args) {
        fibonachi4calcs = 0;
        System.out.println("15-th element of Fibonachi sequence is: "+getFibonachiNum(15));
        System.out.println("4-th element calculates for " + fibonachi4calcs + " times");
    }
}


package recursion;

import sun.security.provider.SHA;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by drkomp on 27.08.2016.
 * Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и
 * лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного стержня на другой за
 * наименьшее число ходов. За один раз разрешается переносить только одно кольцо, причём нельзя класть
 * большее кольцо на меньшее.
 * (Ханойская башня )
 */

public class MovingRing {
    private Shaft[] shafts;
    public int getCalls;
    public int putCalls;

    public MovingRing(int numRing) throws InvalidAlgorithmParameterException {
        shafts = new Shaft[3];
        shafts[0] = new Shaft(numRing);
        shafts[1] = new Shaft(numRing);
        shafts[2] = new Shaft(numRing);
        int n = numRing;
        for (int i = 0; i < numRing; i++) {
            shafts[0].putRing(n--);
        }
    }

    public class Shaft {
        private int[] shaftStack;
        private int index;

        Shaft(int capacity) {
            if (capacity < 1) throw new IllegalArgumentException("Shaft is too small!");
            shaftStack = new int[capacity];
            index = 0; //under first free place
        }

        public void putRing(int size) throws InvalidAlgorithmParameterException {
            putCalls++;
            if (index == shaftStack.length) throw new InvalidAlgorithmParameterException("The stuff is full!");
            if (index == 0) {
                shaftStack[index++] = size;
            } else if (shaftStack[index - 1] <= size)
                throw new InvalidAlgorithmParameterException("You put largest ring to smallest!!! AAAAA!!!!");
            else {
                shaftStack[index++] = size;
            }
        }

        public int getRing() {
            getCalls++;
            int tmp = shaftStack[--index];
            shaftStack[index] = 0;
            return tmp;
        }

        public void printShaftState() {
            System.out.println(Arrays.toString(shaftStack));
        }
    }

    public void printShafts() {
        for (Shaft shaft : shafts) {
            shaft.printShaftState();
        }
    }

    public void moveRingPiramid(int amount, int from, int to) throws InvalidAlgorithmParameterException {
        int intermediary;
        if ((from == 0 && to == 1) || (from == 1 && to == 0)) intermediary = 2;
        else if ((from == 1 && to == 2) || (from == 2 && to == 1)) intermediary = 0;
        else if ((from == 0 && to == 2) || (from == 2 && to == 0)) intermediary = 1;
        else
            throw new InvalidAlgorithmParameterException("Parameters from or to is out of range ! from=" + from + ", to=" + to);
        if (amount == 2) {
            shafts[intermediary].putRing(shafts[from].getRing());
            shafts[to].putRing(shafts[from].getRing());
            shafts[to].putRing(shafts[intermediary].getRing());
            return;
        }
        moveRingPiramid(amount - 1, from, intermediary);
        shafts[to].putRing(shafts[from].getRing());
        moveRingPiramid(amount - 1, intermediary, to);
        return;
    }

    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        System.out.println("This program  solves the Towers of Hanoi task.");
        System.out.print("Enter number of rings N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        MovingRing movingRingEx = new MovingRing(n);
        System.out.println("Starts position is");
        movingRingEx.printShafts();
        System.out.println("Moving rings from 1 to 3 shaft");
        movingRingEx.moveRingPiramid(n, 0, 2);
        System.out.println("Result moving is: ");
        movingRingEx.printShafts();
        System.out.println("Amount of steps is " + movingRingEx.getCalls);
    }
}

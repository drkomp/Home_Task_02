package recursion;

/**
 * Created by drkomp on 27.08.2016.
 * Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и
 * лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного стержня на другой за
 * наименьшее число ходов. За один раз разрешается переносить только одно кольцо, причём нельзя класть
 * большее кольцо на меньшее.
 */
public class MovingRing {
    private int[] staff1;
    private int[] staff2;
    private int[] staff3;
    public MovingRing(int numRing){
        staff1 = new int[numRing];
        staff2 = new int[numRing];
        staff3 = new int[numRing];
        int n=numRing;
        for(int i = 0;i<numRing;i++){
            staff1[i]=n--;
        }
    }
    public void moveRingPiramid(int amount, int from, int to){
        if(amount == 1){}
    }
}

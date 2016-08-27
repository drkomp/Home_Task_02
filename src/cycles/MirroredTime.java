package cycles;

/**
 * Created by drkomp on 27.08.2016.
 * •	Электронные часы показывают время в формате от 00:00 до 23:59.
 * Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная
 * комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class MirroredTime {
    public static void main(String[] args) {
        int numMirroredComb = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                if ((i % 10 == (j / 10) % 10) && ((i / 10) % 10 == j % 10)) numMirroredComb++;
            }
        }
        System.out.println("During the day the electronic clock shows mirrored time for "+numMirroredComb+" times.");
    }
}

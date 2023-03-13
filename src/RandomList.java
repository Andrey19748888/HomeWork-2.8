import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomList {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(r.nextInt(1000));
        }

        System.out.println(set);

        for (int i = 1; i < 1000; i += 2) {
            if (set.contains(i)) {
                set.remove(i);
            }
        }

        System.out.println(set);
    }
}

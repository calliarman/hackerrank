import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {


        public static int getTotalX(List<Integer> a, List<Integer> b) {

            Collections.sort(a);
            Collections.sort(b);

            int min = a.get(a.size() - 1);
            int max = b.get(0);
            int count = 0;
            boolean condition = true;

            for (int current = min; current <= max; current++) {
                for (int j : a)
                    if (current % j != 0)
                        condition = false;

                for (int j : b)
                    if (j % current != 0)
                        condition = false;

                if (condition)
                    count++;

                condition = true;
            }

            return count;
        }


    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    }
}

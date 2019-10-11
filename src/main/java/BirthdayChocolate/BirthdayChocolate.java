import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {


    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;


        for (int i = 0; i <= s.size() - m; i++) {
            int total = 0;
            for (int j = i; j < i + m; j++) {
                total += s.get(j);
            }
            if (total == d)
                result++;
        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));//2

        System.out.println(birthday(Arrays.asList(4), 4, 1));//1

        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2)); //0

    }
}

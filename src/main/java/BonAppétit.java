import java.util.Arrays;
import java.util.List;

public class BonAppétit {

        static void bonAppetit(List<Integer> bill, int k, int b) {

            Integer sum = bill.stream()
                    .reduce(0, Integer::sum);

            int normalizedSum = sum - bill.get(k);
            /*System.out.println(normalizedSum);
            System.out.println(sum);*/

            if(normalizedSum/2 == b)
                System.out.println("Bon Appetit");
            else
                System.out.println(b - normalizedSum/2);
        }


    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);

        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);

    }
}

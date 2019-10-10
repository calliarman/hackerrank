package RepeatedString;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long totalCount = 0;

        long countForSubstring = s.chars().filter(ch -> ch == 'a').count();

        long divisor = n / s.length();

        totalCount += divisor * countForSubstring;

        long remainder = n % s.length();

        s = s.substring(0,(int) remainder);

        totalCount += s.chars().filter(ch -> ch == 'a').count();

        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}

package CountingValleys;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyCount = 0;
        boolean valleyStarted = false;
        int newLevel = 0;
        int lastLevel = 0;

        for (int i = 0; i < s.length(); i++) {
            lastLevel = newLevel;

            if (s.charAt(i) == 'U')
                newLevel++;
            else
                newLevel--;

            if (newLevel < 0 && valleyStarted == false) {
                valleyStarted = true;
                valleyCount++;
            }

            if (newLevel == 0 && valleyStarted == true) {
                valleyStarted = false;
            }

        }

        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);
        scanner.close();
    }
}

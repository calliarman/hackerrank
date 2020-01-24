package Day10BinaryNumbers;

import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = Integer.toString(n, 2);
        int total = 0;
        int current = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (flag)
                    current++;
                else {
                    current = 1;
                    flag = true;
                }
                if (current > total)
                    total = current;

            } else
                flag = false;
        }

        System.out.println(total);
        scanner.close();
    }
}

package Day6LetsReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            strings.add(line);
        }
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            String temp1 = "";
            String temp2 = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0)
                    temp1 += s.charAt(j);
                else
                    temp2 += s.charAt(j);
            }
            System.out.println(temp1 + " " + temp2);
        }
    }
}

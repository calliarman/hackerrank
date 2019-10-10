package DrawingBook;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int numberOfPages = n/2 + 1;

        if(p == 1 || n == p || (n%2 != 0 && n-1 == p))
            return 0;

        int fromLeft = p/2;
        int fromRight;

        fromRight = numberOfPages - 1 - fromLeft;

        if(fromLeft < fromRight)
            return fromLeft;

        return fromRight;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true){
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int p = scanner.nextInt();

            int result = pageCount(n, p);

            System.out.println(String.valueOf(result));
        }


    }
}

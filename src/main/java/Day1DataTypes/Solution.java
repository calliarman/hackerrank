package Day1DataTypes;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Read and save an integer, double, and String to your variables.*/
        int my_i = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double my_d = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String my_s = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + my_i);
        System.out.println(d + my_d);
        System.out.println(s + my_s);

        scan.close();
    }
}
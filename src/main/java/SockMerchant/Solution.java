package SockMerchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i : ar)
        {
            integers.add(i);
        }


        int count = 0;

        for (int i=0; i<integers.size(); i++){
            for(int j = i+1 ; j < integers.size(); j++){
                if(integers.get(i) == integers.get(j)){
                    count++;
                    integers.remove(j);
                    integers.remove(i);
                    j = i;
                }
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);


        scanner.close();
    }
}

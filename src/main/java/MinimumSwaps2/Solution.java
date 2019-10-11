package MinimumSwaps2;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swapTotal = 0;
        int temp;
        int swappedIndex = -1;
        int startIndex = 0;
        int numberTobeFound = 1;
        boolean found = false;
        boolean finished = false;

        while (!finished) {
            for (int i = startIndex; i < arr.length; i++) {

                if (arr[i] == numberTobeFound) {
                    swappedIndex = i;
                    found = true;
                }

                if (found) {
                    if (swappedIndex != startIndex) {
                        temp = arr[swappedIndex];
                        arr[swappedIndex] = arr[startIndex];
                        arr[startIndex] = temp;
                        swapTotal++;
                    }
                    numberTobeFound++;
                    startIndex++;
                    found = false;

                    if (startIndex == arr.length)
                        finished = true;

                    break;

                }
            }
        }
        return swapTotal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        int res = minimumSwaps(arr);
        System.out.println(String.valueOf(res));
        scanner.close();
    }
}

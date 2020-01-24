package Day14Scope;

import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] array) {
        elements = array;
    }

    public void computeDifference() {
        maximumDifference = -1;
        int diff;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                diff = Math.abs(elements[i] - elements[j]);

                if (diff > maximumDifference)
                    maximumDifference = diff;
            }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
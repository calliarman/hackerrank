public class AppleandOrange {


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        for(int i = 0; i < apples.length; i++){
            int position = a + apples[i];
            if(s <= position && position <= t)
                appleCount++;
        }

        for (int i = 0; i < oranges.length; i++ ){
            int position = b + oranges[i];
            if(s <= position && position <= t)
                orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        countApplesAndOranges(7,11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
    }
}

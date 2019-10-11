public class BreakingtheRecords {


    static int[] breakingRecords(int[] scores) {
        int minRecordCount = 0;
        int maxRecordCount = 0;

        int minScore = scores[0];
        int maxScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxRecordCount++;
            }

            if (scores[i] < minScore) {
                minScore = scores[i];
                minRecordCount++;
            }

        }

        System.out.print(maxRecordCount + " " + minRecordCount);

        return new int[]{maxRecordCount, minRecordCount};
    }


    public static void main(String[] args) {

        //breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42});

    }
}

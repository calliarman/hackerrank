public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1 == x2)
            return "YES";


        if ((x2 > x1 && v1 > v2) || (x1 > x2 && v2 > v1)) {
            int count = 0;
            while (true) {

                x1 += v1;
                x2 += v2;

                if(x1 == x2)
                    return "YES";

                count++;
                if (count > 100)
                    break;
            }
        }

        return "NO";
    }


    public static void main(String[] args) {
        System.out.println(kangaroo(0, 2, 5, 3)); //NO

        System.out.println(kangaroo(0, 3, 4, 2)); //YES

    }
}

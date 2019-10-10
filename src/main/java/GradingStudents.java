import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int count = 0;
        for (Integer integer : grades) {
            if (integer >= 0) {
                if (integer % 5 == 0)
                    System.out.println("OK");
                else if (integer % 5 < 3)
                    System.out.println("OK");
                else
                    integer = integer + (5 - integer % 5);
                System.out.println(integer);
            }
            if(integer >= 40)
                grades.set(count, integer);

            count++;
        }

        return grades;
    }


    public static void main(String[] args) {
        //List<Integer> integers = Arrays.asList(75, 67, 40, 33);
        List<Integer> integers = Arrays.asList(73, 67, 38, 33);

        System.out.println(gradingStudents(integers));
    }
}

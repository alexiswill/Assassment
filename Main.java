package Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



       double[] arrayOfScores = new double[] {63.0, 45.0, 87.0, 78.0, 98.0, 90.0};


        Student student = new Student("Mike", "Jones", new double[]{63.0, 45.0, 87.0, 78.0, 98.0, 90.0});
        System.out.println(student);
        System.out.println("Mike's scores are:" + Arrays.toString(arrayOfScores));
        System.out.println("Mike's total score is: " + student.totalScore(arrayOfScores));
        System.out.println("Mike's average score is: " + student.calculateAverageScore(arrayOfScores));













    }
}

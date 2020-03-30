package Student;

import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    private double[] scores;


    public Student(String firstName, String lastName, double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String getFirstName(double[] arrayOfScores) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public double[] getScores() {
        return scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }

    public double totalScore(double[] scores) {
        double sum = 0;
        for (int s = 0; s < scores.length; s++) {
            sum += scores[s];
        }
        return sum;


    }

    public double calculateAverageScore(double[] scores) {
        double average = 0;
        for (int i = 0; i < scores.length; i++) {
            average += scores[i]/6;

        }
        return average;
    }
}


























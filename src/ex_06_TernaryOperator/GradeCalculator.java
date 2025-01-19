package ex_06_TernaryOperator;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85; // Example score, you can change this value to test

        // Calculate the grade using nested ternary operators
        String grade = (score >= 90 && score <= 100) ? "A" :
                       (score >= 80 && score < 90) ? "B" :
                       (score >= 70 && score < 80) ? "C" :
                       (score >= 60 && score < 70) ? "D" :
                       (score >= 0 && score < 60) ? "F" : "Invalid score";

        // Display the grade
        System.out.println("The letter grade is: " + grade);
    }
}

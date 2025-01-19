package ex_06_TernaryOperator;

public class Lab068_AgeCalculation {
    public static void main(String[] args) {
        //int age = 25 ;
        // Parse the age from command-line arguments
        int age = Integer.parseInt(args[0]);
        System.out.println(age);
        String result = (age <18) ? "Minor" : (age<65)? "Adult":"senior";
        System.out.println(result);
    }
}

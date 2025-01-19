package Task_19thJan;

public class MaxOf2 {
    public static void main(String[] args) {



        int num1 = Integer.parseInt(args[0]);  // First number
        int num2 = Integer.parseInt(args[1]);  // Second number

        // Use the ternary operator to calculate the maximum
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + max);

    }
}

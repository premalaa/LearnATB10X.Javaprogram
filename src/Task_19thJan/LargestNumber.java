package Task_19thJan;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 10;

        // Using nested ternary operators to find the largest number
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        // Output the result
        System.out.println("The largest number is: " + largest);
    }
}

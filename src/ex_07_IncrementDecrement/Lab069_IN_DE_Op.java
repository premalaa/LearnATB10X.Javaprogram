package ex_07_IncrementDecrement;

public class Lab069_IN_DE_Op {
    public static void main(String[] args) {
        // Parse the age from command-line arguments
        int age = Integer.parseInt(args[0]);
        System.out.println(age);

        String canIgoGoa = age >= 24 ? "yes":"no";
        System.out.println(canIgoGoa);

    }
}

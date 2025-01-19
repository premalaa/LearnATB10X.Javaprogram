package Task_19thJan;

public class task_CLI {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        //if (args.length != 3) {
          //  System.out.println("Please provide Name, Age, and Salary as arguments.");
         //   return;
       // }

        // Assign arguments to variables
        // Extract the values from the command-line arguments
        String name = args[0];              // First argument is Name
        int age = Integer.parseInt(args[1]);  // Second argument is Age (convert to integer)
        double salary = Double.parseDouble(args[2]);  // Third argument is Salary (convert to double)

        // Print the entered information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
    }


class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class AdvancedExceptionHandling {

    // Method with throws keyword
    static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Advanced Exception Handling Demo ===");

        // 1. Multiple Catch Blocks
        try {
            int[] arr = new int[3];
            arr[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        // 2. Nested Try-Catch
        try {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e.getMessage());
            }

            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        // 3. Throw and Throws
        try {
            checkAge(15);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 4. Try-With-Resources
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Exception in Try-With-Resources: " + e.getMessage());
        }

        System.out.println("End of Advanced Exception Handling Demo");
    }
}

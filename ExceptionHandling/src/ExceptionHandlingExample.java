public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
           
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            
            System.out.println("Finally block executed");
        }
    }

    
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

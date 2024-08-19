import java.util.Scanner;

/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A Number");
        int Number = scanner.nextInt();

        long Factorial = CalcFactorial(Number);
        System.out.println("Factorial = " +Factorial);
        scanner.close();
    }

    private static long CalcFactorial(int n) {
    
    if (n == 0 | n ==1 ) {
        return 1;
    }else{
        long result = 1;
        for(int i=2; i <= n ; i++){

            result *= i;
        }
        return result;
    }

    }
    
}


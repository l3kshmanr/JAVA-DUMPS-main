import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A 1st Num");
        int firstnum = scanner.nextInt();

        System.out.println("Enter A last Num");
        int Lastnum = scanner.nextInt();
        
        Loopcheck(firstnum, Lastnum);
        scanner.close();

    }

    private static void Loopcheck(int firstnum, int lastnum) {
        for(int i=firstnum; i <=lastnum; i++){
            if (verify(i)) {
                System.out.println(i+ " ");
            }
        }
    }

    private static boolean verify(int number) {
        int OriginalNumber = number;
        int Digits = String.valueOf(number).length();
        int sum = 0;

        while(number != 0){
            int Digit = number % 10;
            sum += Math.pow(Digit, Digits); // 0^3
            number /= 10 ;
            
        }
        return sum == OriginalNumber;
        
    }
}

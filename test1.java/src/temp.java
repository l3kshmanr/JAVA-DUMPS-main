// import java.util.Scanner;

// public class ArmstrongNumberFinder {

//   public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter First Number");
//     int firstnum = scanner.nextInt();

//     System.out.println("Enter Last Number");
//     int lastnum = scanner.nextInt();

//     loopcheck(firstnum, lastnum);
//     scanner.close();
//   }

//   //checking via loop
//   public static void loopcheck(int firstnum, int lastnum){
//     for(int i = firstnum; i <= lastnum; i++){
//         if (check(i)) {
//             System.out.println(i+" ");
//         }
//     }

//   }

//   public static boolean check (int number){
//     int OriginalNumber = number;
//     int digits = String.valueOf(number).length();
//     int sum = 0;
//     while (number != 0) {
//      int digit = number % 10;

//      sum += Math.pow(digit, digits);
//      number /= 10;
     
//     }
//     return sum == OriginalNumber;
//   }

// }

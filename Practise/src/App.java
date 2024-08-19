//#################### PROGRAM 1 ///////////

// import java.util.Scanner;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Scanner Scanner = new Scanner(System.in);

        
//         System.out.println("Enter First Num");
//         int Firstnum = Scanner.nextInt();
//         System.out.println("Enter First Num");
//         int Lastnum = Scanner.nextInt();


//         LoopCheck( Firstnum,  Lastnum);
//         Scanner.close();
//     }

//     private static void LoopCheck(int firstnum, int lastnum) {
//         // TODO Auto-generated method stub
//         for(int i= firstnum; i<=lastnum; i++){

//             if(validate(i)){
//                 System.out.println(i+"");
//             }
//         }
//     }
//     public static boolean validate(int number) {
        
//         int Original = number;
//         int Digits = String.valueOf(number).length();
//         int sum = 0;

//         while (number != 0) {
//             int Digit = number % 10;
//             sum += Math.pow(Digit, Digits);
//             number /= 10;
//         }
//         return Original == sum;
//     }

// }






////////////////// PROGRAM 2 /////////////

/**
 * App
//  */
// public class App {

//     public static void main(String[] args) {
//       sub subobj = new sub();
//       subobj.Addition(10, 10);
//       subobj.substarction(30, 10);  
//     }
// }





///program 3

/**
 * App
 */
// public class App {

//     public static void main(String[] args) {
//         sub subobj = new sub();
//         subobj.add(10, 5);
//     }
// }


/**
 * App
 */

///program 4
// public class App {
//     public static void main(String[] args) {
//         add addobj = new add();
//         addobj.Addition(10, 20, 20);
//     }
    
// }


/**
 * App
 */


 ///program 5
// public class App {

//     public static void main(String[] args) {
//         sub subobj = new sub();
//         subobj.Addition(10, 10);
//     }
// }


/**
 * App
 */

 ///program 6
// public class App {

//     public static void main(String[] args) {
//         sub subobj = new sub();
//         subobj.add(10, 20);
//         subobj.substarction(10, 5);
//     }
// }


/**
 * App
 */

 ///program 7
// public class App {

    
//     public static void main(String[] args) {
//         add addobj = new add(10, 200);
//     }
// }

/**
 * App
 */

 ///program 8
// public class App {

//     public static void main(String[] args) {
//         add addobj = new add();
//         add addobj2 = new add(10);
//     }
// }



/**
 * App
 */

 
 ///program 9                                
// public class App {

//     public static void main(String[] args) {
//         add addobj = new add();
//         sub subobj = new sub();
//         addobj.Addition(10);
//         subobj.substarction(10, 5);

//     }
// }


/**
 * App
 */
public class App {

    public static void main(String[] args) {
        

        try{
            int result = divide(0, 0);
            System.out.println("Result = "+result);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught"+e.getMessage());
        }finally{
            System.out.println("Finally Block Worked");
        }
    }

    static int divide(int d, int n){
        return n/d;

    }
}
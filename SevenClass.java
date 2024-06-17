import java.util.*;
// public class SevenClass {
// //   public static void PrintMyName(String name)
// //      {
// //     System.out.println(name);
// //      }
// //      public static int SumOfNumbers(int num1,int num2){
// //         int sum = num1 + num2;
// //         System.out.println("Sum of Num1 and Num2 is " +sum);
// //         return sum;
// //      }
// public static void PrintFactorial(int n){
//     if(n<0){

//         System.out.println("invalid number");
//     }

//     int factorial = 1;

//     for (int i = n; i >=1; i--) {

//     factorial = factorial * i;

//     }
//     System.out.println(factorial);
// }
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         System.out.println("Enter your number");
//         int n = Sc.nextInt();
//         // System.out.println("Enter your name");
//         // String name = Sc.next();
//         // System.out.println("Your respone is");
//         // PrintMyName(name);
//         // int num1= Sc.nextInt();
//         // int num2= Sc.nextInt();
        
//         // System.out.println("Your respone is");
//         // SumOfNumbers(num1,num2);
//            PrintFactorial(n);
//         Sc.close();
//     }
// }
// public class SevenClass{
//   public  static boolean isprime(int number){
//         if(number <= 1){
//             return false;
//         }
//         for(int i=2;i<number;i++){
//             if(number % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENter your number");
//         int number  = sc.nextInt();
//         boolean isprime = isprime(number);
//         if(isprime){
//             System.out.println(number +"is prime number");
//         }
//         else{
            
//             System.out.println(number +"is not prime number");
//         }
//         sc.close();
//     }
// }

// public class SevenClass{
//     public static boolean IsEvenOrOdd(int number){
//         if(number%2 ==0){
//             return true;
//         }
//        else{

//            return false;
//        }
      
        
//     }
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your number");  
//     int number = sc.nextInt();
//     boolean IsEvenOrOdd = IsEvenOrOdd(number);
//     if(IsEvenOrOdd){
//         System.out.println(number+"Is Even ");
//     }
//     else{

//         System.out.println(number+"Is odd ");
//     }
//     sc.close();      
//     }
// }
// Make a function to print the table of a given number n.
public class SevenClass{
    public static int Table(int n){

     for(int i = 1;i<=10;i++){
        System.out.println(n+"X"+i+"="+(n*i));
     }
 return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        Table(n);
        sc.close();
    }
}
import java.util.Scanner;
// Enter 3 numbers from the user & make a function to print their average.
// public class EightClass {
//     public static int IsAvarage(int num1,int num2,int num3){
//         int avg = (num1+num2+num3)/3;
//         return avg;
//     }
//     public static void main(String[] args) {
//  Scanner  sc = new Scanner(System.in);
//  System.out.println("Enter Your Numbers");
//  int num1= sc.nextInt();
//  int num2= sc.nextInt();
//  int num3= sc.nextInt();
//  System.out.println("The average of " + num1+ " " +num2+ " " +num3+ " is " + IsAvarage(num1, num2, num3));
//  ;
//  sc.close();
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.
// public class EightClass{
//     public static void Sum_Odd_Numbers(int n){
//         int sum =0;
//         for(int i=1;i<=n;i++){
//             if(i%2!=0){
//                 sum = sum + i;
//             }
          
            
//         }
//         System.out.println("The sum of all odd number is"+sum);
      
//     }
//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//          System.out.println("Enter Your Numbers");
//          int n = sc.nextInt();
//          Sum_Odd_Numbers(n);
//          sc.close();
//     }
// }
// Write a function which takes in 2 numbers and returns the greater of those two.
// public class EightClass{

//     public static int GreaterNumber(int num1,int num2){
//         if(num1 > num2){
//             return num1;
//         }
//         else{
//             return num2;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//                  System.out.println("Enter Your Numbers");
//                  int num1 = sc.nextInt();
//                  int num2 = sc.nextInt();
                
//                  System.out.println("The Greater number is "+ GreaterNumber(num1, num2));
//                  sc.close();
//     }
// }
// Write a function that takes in the radius as input and returns the circumference of a circle.
// public class EightClass{
//     public static void circle(float radius){
//         final float PI = 3.14f; 
//         float circle = PI * (radius*radius);
//         System.out.println("The Circumference of a circle is "+circle);
//     }
//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         System.out.println("Enter Your Number");
//         float radius = sc.nextFloat();
//         circle(radius);
//         sc.close();
//     }
// }
// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// public class EightClass{
//     public static void isEligibleOrNot(int age){
//         if(age >= 18){
//             System.out.println("Is eligible for voting");
//         }
//         else{
//             System.out.println("Is not eligible for voting");
//         }
       
//     }
//     public static void main(String[] args) {
//         Scanner  sc = new Scanner(System.in);
//         System.out.println("Enter Your Number");
//         int age = sc.nextInt();
//         isEligibleOrNot(age);
//         sc.close();
//     }
// }
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
public class EightClass{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                
                if (number > 0) {
                    positiveCount += 1;
                } else if (number < 0) {
                    negativeCount += 1;
                } else {
                    zeroCount += 1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'stop' to finish.");
            }
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}

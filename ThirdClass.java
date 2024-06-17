import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // if (age >= 18) {
        //     System.out.println("You are eligible to drive a car");
        // } else {
        //     System.out.println("you are not eligible to drive a car");
        // }
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Number is even");
        // } else {
        //     System.out.println("number is odd");
        // }
        // System.out.println("Enter numbers for comparision");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // if (num1 == num2) {
        //     System.out.println("equal");
        // } else if (num1 > num2) {
        //     System.out.println("num1 is greater");
        // } else {
        //     System.out.println("num1 is lesser");
        // }

        //Switch
        // System.out.println("Enter your button");
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1:System.out.println("Hello");
                
        //         break;
        //     case 2:System.out.println("Namaste");
                
        //         break;
        //     case 3:System.out.println("Bonjour");
                
        //         break;
        
        //     default:System.out.println("Invalid Input");
        //         break;
        // }
        //QUestions
//         1. Make a Calculator. Take 2 numbers (a & b) from the user and an
// operation as follows :
// 1 : + (Addition) a + b
// ● 2 : - (Subtraction) a - b
// ● 3 : * (Multiplication) a * b
// ● 4 : / (Division) a / b
// ● 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and
// display it to the user.
System.out.println("Enter your numbers");
int num1= sc.nextInt();
int num2= sc.nextInt();
System.out.println("enter your key to perform operations");
int key = sc.nextInt();

switch(key){
    case 1:System.out.println("addition is "+(num1 +num2));
    break;
    case 2:System.out.println("Substraction is "+(num1 -num2));
    break;
    case 3:System.out.println("multiplication is "+(num1 * num2));
    break;
    case 4:System.out.println("division is "+(num1 / num2));
    break;
    case 5:System.out.println("modulous is "+(num1 % num2));
    break;
    default: System.out.println("invalid");
    break;
}
// Ask the user to enter the number of the month & print the name
// of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ &
// so on.
System.out.println("Enter the month key");
int month = sc.nextInt();
switch (month) {
    case 1:System.out.println("January");
        
        break;
    case 2:System.out.println("February");
        
        break;
    case 3:System.out.println("March");
        
        break;
    case 4:System.out.println("April");
        
        break;
    case 5:System.out.println("May");
        
        break;
    case 6:System.out.println("June");
        
        break;
    case 7:System.out.println("Jully");
        
        break;
    case 8:System.out.println("August");
        
        break;
    case 9:System.out.println("September");
        
        break;
    case 10:System.out.println("October");
        
        break;
    case 11:System.out.println("November");
        
        break;
    case 12:System.out.println("December");
        
        break;

    default:System.out.println("Invalid Month");
        break;
}
sc.close();;

}
}

import java.util.Scanner;
public class SecondClass {
    public static void main(String[] args)
    {
//output
// System.out.print("Hello World With Java\n");
// System.out.println("Hello World With Java");
System.out.println("Print The Star");
System.out.println("*\n**\n***\n****\n*****");
//variables
String name = "Rushikesh";
int length = 24;
int breath = 32;
double price = 23.43;
 System.out.println(name);
 System.out.println(length * breath);
 System.out.println(price);
 //input
 //  String line = sc.next();
 //nextInt(),nextFloat,next,nextdouble,nextlong,nextLine()
 //  System.out.println(line);
 // int a = sc.nextInt();
// int b = sc.nextInt();
// int z = a + b;
// System.out.println("The Sum of a and b is "+z);  
//HomeWork 
//Try to declare meaningful variables of each type. 
int num1=11 ;
int num2=10;
System.out.println("Sum of numbers is " +(num1+num2));
String lastName = "Nikam";
System.out.println(lastName);
char myGrade = 'B';
boolean value = true;
short  shortvalue = 10;
short shortvalue1 = 20;
float ratingvalue = 4.3f;
double decimalvalue = 4.0030;
System.out.println(decimalvalue);
System.out.println(ratingvalue);

System.out.println(myGrade);
System.out.println(value); 
System.out.println(shortvalue);
System.out.println(shortvalue1);
try (// Make a program that takes the radius of a circle as input,
// calculates its radius and area and prints it as output to the user.
Scanner sc = new Scanner(System.in)) {
    System.out.println("enter the radius of circle");
    float radius = sc.nextFloat();
    final float PI = 3.14f;
    System.out.println("The calculation of  circle radius and area is"+(PI*(radius*radius)));    
    System.out.println("The value of table is ");
    int TableValue = sc.nextInt();
    System.out.println(TableValue * 1);
    System.out.println(TableValue * 2);
    System.out.println(TableValue * 3);
    System.out.println(TableValue * 4);
    System.out.println(TableValue * 5);
    System.out.println(TableValue * 6);
    System.out.println(TableValue * 7);
    System.out.println(TableValue * 8);
    System.out.println(TableValue * 9);
    System.out.println(TableValue * 10);
}
}
};

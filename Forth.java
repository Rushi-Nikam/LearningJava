import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        // int i = 0;
        // while(i<11){
        // System.out.println(i);
        // i++;
        // }
        // int i1= 0;
        // do {
        // System.out.println(i1);
        // } while (i1<0);
        Scanner sc = new Scanner(System.in);
        System.out.println("the value is ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println("enter your number");
        int j = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(j + "X" + i + "=" + j * i);
        }
        // Homework Problems
        // 1. Print all even numbers till n
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }

        }
        // for( ; ; ){
        // System.out.println("Apna College");
        // }
        sc.close();
    };

}

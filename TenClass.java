import java.util.Scanner;
public class TenClass {
 public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("ENter the size");
//     int size = sc.nextInt();
//     int[] marks = new int[size];
//     marks[0]=32;
//     marks[1]=25;    
//     marks[2]=32;
//     marks[3]=26;
//     marks[4]=34;
    

// // String Subjects[]={"java","python","javascript","nodeJs","MondoDB"};
// int x = sc.nextInt();
// for (int k = 0; k <= size; k++) {
// if(marks[k]==x){
//     System.out.println("X found in index"+k);
// }
// // else{

//     System.out.println(" marks is " +marks[k]+" for subject " +Subjects[k]);
// }
// }
// sc.close();
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
String names[] = new String[size];


//input
for(int i=0; i<size; i++) {
    names[i] = sc.next();
}

//output
 for(int i=0; i<names.length; i++) {
     System.out.println("name " + (i+1) +" is : " + names[i]);
 }
 sc.close();
}

}


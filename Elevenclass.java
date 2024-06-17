import java.util.Scanner;
public class Elevenclass {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int column = sc.nextInt();
    int[][] matrix = new int[rows][column];
    // input 
    for (int i = 0; i < rows; i++) {
        for(int j=0;j<column;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    // output 
    int x= sc.nextInt();
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < column; j++) {
            if(matrix[i][j]==x){
                System.out.print(" The indices of "+x+ " is (" +i + ","+j+")");
            }
            // System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }
    sc.close();
}    
}

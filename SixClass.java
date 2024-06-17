public class SixClass {
    public static void main(String[] args) {
    //Butterfly pattern
     //upper half
//      int n=4;
//      for(int i=1;i<=n;i++){
// //1st part
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         int  spaces = 2 * (n-i);
//         for(int k=1;k<=spaces;k++){
//             System.out.print(" ");

//         }
//         for(int l=1;l<=i;l++){
//             System.out.print("*");

//         }
//         System.out.println();
//      }
     //lower half
    /*   for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int k=1;k<=spaces;k++){
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++){
            System.out.print("*");
        }
        System.out.println();
    } 
*/
    //Solid Rhombous
//     int m=5;
//    /*  for (int i = 1; i <=m; i++) {
//         for(int j=1;j<=m-i;j++){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=5;k++){
 
//             System.out.print("*");
//         }
//         System.out.println();
//     }*/
//     //Number pyramid
//   for (int i = 1; i <=m; i++) {
//     for(int j=1;j<=m-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=1;k<=i;k++){
//         System.out.print(i +" ");
//     }
//     System.out.println();
//   }

//   //palindromic pattern
//   for (int i = 1; i<=m; i++) {
//     for(int j=1;j<=m-i;j++){
//         System.out.print(" ");
//     }
//     for(int k=i;k>=1;k--){
//         System.out.print(k);
//     }
//     for(int l=1;l<=i;l++){
//         System.out.print(l);
//     }
//     System.out.println();
//   }

// //   Diamond pattern 

// for (int i = 1; i<=m; i++) {
//     for(int j=1;j<=m-i;j++){
//         System.out.print(" "+" ");
//     }
   
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print("*"+" ");
//     }
//     System.out.println();
// }
// for (int i = m; i>=1; i--) {
//     for(int j=1;j<=m-i;j++){
//         System.out.print(" "+" ");
//     }
   
//     for(int k=1;k<=2*i-1;k++){
//         System.out.print("*"+" ");
//     }
//     System.out.println();
// }

//print a hollow Rhombus

int m=4;
int n=5;
for (int i = 1; i <=m; i++) {
    for(int j=1;j<=m-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=n;k++){
  if(i==1 || i==m||k==1 || k==n){

      System.out.print("*");
    }
    else{
      System.out.print(" ");

  }
    }
  System.out.println();
}
//   upper half
    
     for(int i=1;i<=n;i++){
//1st part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int  spaces = 2 * (n-i);
        for(int k=1;k<=spaces;k++){
            System.out.print(" ");

        }
        for(int l=1;l<=i;l++){
            System.out.print("*");

        }
        System.out.println();
     }
     //lower half
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces = 2 * (n-i);
        for(int k=1;k<=spaces;k++){
            System.out.print(" ");
        }
        for(int l=1;l<=i;l++){
            System.out.print("*");
        }
        System.out.println();
    } 

    }
}

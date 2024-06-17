public class FiveClass {
    public static void main(String[] args) {
        // solid rectangle
        // for(int i=1 ; i<=4;i++){
        // for(int j=1;j<=5;j++){
        // System.out.print("*");
        // }
        // System.out.println("*");
        // }

        // hollow Rectangle
        int n=4;
        int m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
        // inner Loop
        for (int j = 1; j <= m; j++) {
            if (i == 1 || j == 1 || i == n || j == m) {
        System.out.print("*");
        } else {

        System.out.print(" ");
        }
        }

        System.out.println();
        }

        // Half Pyramid
        /*  for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){

        System.out.print("*");
        }
        System.out.println();
        }*/
        // Invert Half Pyramid
       /*  for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }*/
        // Inverted Half Pyramid (rotated by 180 deg)
      /* for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
                }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //Half Pyramid with Numbers
      /*   for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(j);
                }
                System.out.println();
                }*/
                //inverted Half Pyramid with Numbers
        //         int n = 5;
        //         for(int i=1;i<=n;i++){
        //             for(int j=1;j<=n-i+1;j++){
                
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //Floyd's Triangle
        // int n = 5;
      /*  int k=1;
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        } */
    //    0-1 Triangle

    //    int n = 5;
      
        //         for(int i=1;i<=n;i++){
        //             for(int j=1;j<=i;j++){
        //                 int sum = i+j;
        //                 if(sum%2==0){

        //                     System.out.print('1');
        //                 }
        //       else{
        //         System.out.print("0");
        //       }
        //     }
        //     System.out.println();
        // }  
    }
}

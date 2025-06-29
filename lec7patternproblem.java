
import java.util.Scanner;


public class lec7patternproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        // int c  =sc.nextInt();

        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         System.out.print("*"); // ye line pura print kar dega ek hi line me pura star row and col pure ka
        //     }
        //     System.out.println(); // this is new line 
        // }

                                //------------Question 2:- Rectungular pattern--------

//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c;j++){
//                 if( i== 1 || i == r || j== 1 || j == c){
//                 System.out.print("*");
//                 }
//                 else{
//                   System.out.print(" ");
         
//         }
//     }
//     System.out.println();
   
// }

 //----------------Question 3:- Reverse Traingular Pattern--------------

            //     for(int i=1;i<=r;i++){
            //         for(int j=1;j<=(r+1-i);j++){
            //             System.out.print("*");
            //           }
            //         System.out.println();
            //     }
            //   }

             //------------Second method--------

     //         for(int i=r;i>=1;i--){
    //             for(int j=1;j<=i;j++){
    //               System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    // }
    //      }


            //----------Question 4:- Traingular pattern--------
            // for(int i=1;i<=r;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

           //------------Question 5:- Pyramid pattern----------
        //    for(int i=1;i<=r;i++){ //Reversing over row
        //     //print r-i spaces
        //     for(int j=1;j<=r-i;j++){
        //         System.out.print(" ");
        //     }
        //     //print 2*i
        //     for(int k=1;k<=2*i-1;k++){
        //     System.out.print("*");

        //    }
        //    System.out.println();
        // }

        //----------------------Numerical pattern problem-----------

                    //   for(int i=1;i<=r;i++){
                    //     for(int j=i;j<=r;j++){
                    //         System.out.print(j);
                    //     }
                    //     for(int k=1;k<=i-1;k++){
                    //         System.out.print(k);
                    //     }
                    //     System.out.println();
                    //   }
    
         // ------------------Rectangular pattern into Numerical pattern-----
         
                //    for(int i=1;i<=r;i++){
                //     for(int j=1;j<=c;j++){
                //         System.out.print(j);
                //     }
                    
                //     System.out.println();
                //    }
                
           // --------Hollow Rectangular Patterns int numerical form--
        //    for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if(i == 1 || i == r || j == 1 || j == c){
        //             System.out.print(j);
        //         }else{
        //             System.out.print(" ");
        //         }
               
        //     }
        //      System.out.println();
        //    }    
        
        //------- Question:----------------------12122121-----this type
        // for(int i=1;i<=r;i++){
        //     for(int j=1;j<=c;j++){
        //         if((i+j) % 2 == 0){
        //             System.out.print(1);

        //         }else{
        //             System.out.print(2);
        //         }

        //     }
        //     System.out.println();
        // }

        //-----------Question :- Numerical pattern of rectangular-------

        //     for(int i=1;i<=r;i++){
        //     for(int j=1;j<=i;j++){
        //      System.out.print(j);
        //     }
        //     System.out.println();
        //  }
    
        //------Question :- Pyramid pattern numerical form-------
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--){
            System.out.print(l);
        }
        System.out.println();
    }
        }
    }
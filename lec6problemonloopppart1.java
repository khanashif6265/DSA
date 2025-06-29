
import java.util.Scanner;




public class lec6problemonloopppart1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
    //     int numofdigtis =0;
    //     while(n>0){
    //         n = n/10;
    //         numofdigtis++;
    //     }
    //     System.out.println(numofdigtis);
    // }

    //------------Question 2:- Find the sum of digits in a given number n------
     
    //   int sumofdigit= 0;
    //   while(n>0){
    //    sumofdigit +=n%10;
    //    n=n/10;
    //   }
    //   System.out.println(sumofdigit);

    //-----------------Question 3:- Reverse the digit of a number
    
//   int ans=0;
//    while(n>0){
//    ans=ans*10+n%10;
//     n=n/10;
//    }
//    System.out.println(ans);

//------------Using for loop---------

// int ans=0;
// for(int i=0;i<n;i++){
// ans=ans*10+n%10;
// n=n/10;
// }
// System.out.println(ans);
//     }
// }

//----------------------Question 4:- Find the sum of the following series-----
//----------------                    S=1-2+3-4...n
//--------------                      ans += odd
//----------------------               ans -= even

// int ans=0;
// for(int i=1;i<= n;i++){
//     if(i % 2==0){
//         ans -= i;
//     }else{
//         ans += i;
//     }
//     }
// System.out.println(ans);

//---------------------------------Question 5:- Find the sum of the following series--------
                        //   int n=6;
                        //   int fact = 1;
                        //   for(int i=1;i<n;i++){
                        //     fact = fact*i;
                        //   }
                        //   System.out.println(fact);

  //------------------------------Question 6:- Given 2 Number a and b. Find a raise to the power b.
         Scanner sc = new Scanner(System.in);
         int a =sc.nextInt(), b = sc.nextInt();

         int ans =1;
         for(int i=1;i<=b;i++){
            ans *=a;

         }
  
         System.out.println(ans);
}
}
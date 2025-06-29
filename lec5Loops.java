
public class lec5Loops {

    //-----------While Loop-----------------//

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int num=1;
    //     while(num<=n){
    //     System.out.println(num);
    //    // num = num+1; iske jagah pe aisa bhi likhte hai remember
    //    num++;
    //      }
    // }

//----print the sum of the first natural number--------

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//          int sum =0;
//         int num = 1;
//         while(num<= n){
//             sum=sum+num;
//           num++;
//         }
//         System.out.println(sum);
        
    
//     }
// }

//-------------------------For Loop-------------------------//
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for(int num=n;num>=1;num-=2){
//         System.out.println(num);

//     }
   
//      }

//----------------do while loop----------------
// public static void main(String[] args) {
//     int num = 1;
//     do { 
//         System.out.println(num);
//         num++;
        
//     } while (num <=10);
// }


//-----------------------Question:-1 Print the sum of stream of integer in the input----------

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int num = sc.nextInt();
//     int sum=0;
//     while(num != -1){
//         sum += num;
//         num=sc.nextInt();
//   }
//     System.out.println(sum); 
// }

//------------------------Question:-2 print the number multiple of 5 and 7----------
// public static void main(String[] args) {
//     int num=1;
//     while (true) { 
//         if((num % 5==0) &&(num % 7==0)){
//             System.out.println("found"+ num);
//             break;
//         }
//         num++;
//         }}

    //------------------Question:-3 print all the values between 1 and 50 except for the multiples of 3.
    public static void main(String[] args) {
    //     for(int num=1;num<=10;num++){
    //         if(num % 3==0){
    //             continue;
    //             }
    //         System.out.println(num);
    //     }
    // }

    //------Using while loop-------
    int num=1;
    while(num<=15){
        if(num % 3==0){
         num++;
      }
      System.out.println(num);

    num++;
}
     
}
}


    

import java.util.Scanner;
//------------Binary to decimal---------------
public class lec8NumberSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     int binary_num = sc.nextInt();
    //     int ans=0; //converted decimal number
    //     int pw=1;  //2^0 = 1 power of 2

    //     while(binary_num > 0){
    //         int unit_digit = binary_num %10;
    //         ans += (unit_digit * pw);
    //         binary_num /= 10;
    //         pw *= 2;

    //     }
    //     System.out.println(ans);
    // }

    //-------------------Decimal to binary----------

    int dec_num = sc.nextInt();
    int ans=0;
    int pw=1;

    while(dec_num>0){
        int parity = dec_num %2;
        ans += (parity * pw);
        pw *=10;
        dec_num /=2;
 }
 System.out.println(ans);


    }
}

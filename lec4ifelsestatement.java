import java.util.Scanner;

public class lec4ifelsestatement {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     if(num % 2==0){
    //         System.out.println("Number is even");
    //     }else{
    //         System.out.println("False");
    //     }

        
    // }
    
    //-----------Age group------------//
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     if(age<=12){
    //         System.out.println("Children");
    //     }
    //    else if(age >12 && age<17){
    //     System.out.println("teenager");

    //    }else{
    //     System.out.println("Adult");
    //    }
    

    // }

    //-------------Try this question----------
    // //-------Write a program to print the value it is even and divisible by 3.
    //  public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int value = sc.nextInt();
    //     if(value%3==0 || value%5 == 0){
    //         System.out.println("found ans- "+ value);
    //     }
    //  }

    //---------Switch case----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
                break;
          case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
                  case 6:
                       System.out.println("Staurday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Invalid day no");
                }

         
    }
}


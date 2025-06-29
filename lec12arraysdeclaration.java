//-----------Question:1- Calculate sum of Array------
// class ArraysExample{
//     void sumOfArray(){
//         int[] arr= {1,5,3};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//           sum = sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }
// public class lec12arraysdeclaration {
//     public static void main(String[] args) {
//     ArraysExample obj = new ArraysExample();
//    obj.sumOfArray();
//     }    

//----------Question:2-> Calculate the maximum value out of all the element int the array------
 
// class ArraysExample{
//     void maxOfArray(){
//         int[] arr = {1,4,5,6,1,8,4};
//         int ans = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>ans){
//                 ans = arr[i];
//             }
//         }
//         System.out.println("Max: "+ ans);

//     }
// }
// public class lec12arraysdeclaration {
//     public static void main(String[] args) {
//     ArraysExample obj = new ArraysExample();
//     obj.maxOfArray(); 
//     }

//-------------Question:-3- Search the given element in the array if present then return the index else return -1----
class ArraysExample{
    void SearchInArray(){
        int arr[]={1,2,3,4,3,5,6};
        int x = 3;
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans = i;
                break;
            }

        }

        if(ans == -1){
            System.out.println("Not Fount");
        }else{
            System.out.println("Fount "+ x + " at index " +ans);
        }

    }
}
public class lec12arraysdeclaration {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.SearchInArray();
    }
}



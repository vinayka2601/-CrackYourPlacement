import java.util.Arrays;
import java.util.Scanner;

public class evenOdd {

    public static int evod(int a){
        if(a%2==0){
            return 1;
        }  
        return 0;
        
    }
    public static int voting(int age){
    if(age>=18){
        
        System.out.println("jaa vote de");
        return 1;
    }else{
        System.out.println("bhag jaa bacchi");
        return 0;
    }

    }
    public static int[] sort(int arr[]){
        Arrays.sort(arr);
        return arr;
       
    }

    public static int num(int a){
        return 5;
    }

    public static int mathod(int arr[]){
     for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            return arr[i];
        }
     }
     return -1;
    }
    public static void main(String[] args) {
    //     int a=44;
    //    if(evod(a)>0){
    //     System.out.println("naruto");
    //    }
    // System.out.println(voting(-2));;

          int arr[]={1,3,5,7,4,5,6,4};
          //mathod(arr);//return 2
          if(mathod(arr)>2){
            System.out.println("yes");
          }else{
            System.out.println("no");
          }
          
        //   System.out.println(sort(arr));
        // System.out.println(Arrays.toString(sort(arr)));;
        // System.out.println(Arrays.toString(arr));
        
    //    System.out.println(num(3));

    

    }
}

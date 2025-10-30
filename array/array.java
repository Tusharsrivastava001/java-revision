import java.util.Scanner;
import java.util.Arrays;

class Main{
    enum days{
    MON,TUE,WED,THURS,FRI,SAT;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        days d1=days.MON;
        System.out.println(d1);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
        //this alsoo the wya 
        int[] arr1={1,2,3,4,5};
        
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
        }
        
        int[] copy=arr.clone();
        //if we want to make the copy of the array 
        for(int i=0;i<arr.length;i++){
            System.out.println(copy[i]+" ");
        }
        
        System.out.println(Arrays.equals(arr1,arr));
        
    }
}

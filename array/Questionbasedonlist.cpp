import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double avg=(a+b+c)/3.0;
        System.out.printf("%.2f\n",avg);
        int[] arr={a,b,c};
        int[] cop=arr.copy();
        Arrays.sort(cop);
        int s1=cop[0];
        int s2=cop[1];
        
        List<Integer> ord=new ArrayList<>();
        for(int x : arr){
            if(x==s1 || x==s2){
                ord.add(x);
            }
        }
        
        if(avg>s1 && avg>s2) System.out.printf("Average is greater than both %d and %d",ord.get(0),ord.get(1));
        else System.out.printf("Average is not greater than two smallest expenses");
    }
}

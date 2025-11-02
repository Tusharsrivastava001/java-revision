// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       ArrayList<Integer> ll=new ArrayList<>();
       ll.add(10);
       ll.add(20);
       System.out.println(ll);
       
       for(int i=0;i<ll.size();i++){
           System.out.println("Elements: "+ll.get(i));
       }
       ll.set(1,55);
       for(int i=0;i<ll.size();i++){
           System.out.println("Elements: "+ll.get(i));
       }
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> li=new ArrayList<>();
       for(int i=0;i<5;i++){
           li.add(sc.nextInt());
       }
       for(int i=0;i<li.size();i++){
           System.out.println("Elements: "+li.get(i));
       }
      System.out.println(Collections.max(li));
    }
}

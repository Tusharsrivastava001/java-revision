import java.util.*;
class Main{
    public static void main(String[] args){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(25);
        dq.addLast(25);
        dq.addLast(25);
        dq.addLast(35);
        dq.addLast(65);
        System.out.println(dq);
        
        
        System.out.println("Remoove the last"+dq.removeLast());
        System.out.println("Remove from the rist"+dq.removeFirst());
        
           System.out.println(dq);
        
    }
}

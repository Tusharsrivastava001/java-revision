import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        
        for(int ele : set){
            System.out.println(ele+" ");
        }
        
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Tushar");
        map.put(2,"aman");
        map.put(3,"Tushar");
        
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        System.out.println(map.get(1));
    }
}

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        String[] words=str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String w : words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        
        System.out.println(map);
        // HashMap<Integer,String> map=new HashMap<>();
        // map.put(1,"Tushar");
        // map.put(2,"aman");
        // map.put(3,"Tushar");
        
        // System.out.println(map);
        // System.out.println(map.get(1));
        // System.out.println(map.keySet());
        // System.out.println(map.get(1));
    }
}

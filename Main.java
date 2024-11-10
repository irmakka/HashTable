

import java.util.HashMap;
public  class Main{
    public static void main(String[] args) {
       HashMap <String,Integer>hashMap=new HashMap<>();
       hashMap.put("ırmak",5523);
       hashMap.put("Ayşe", 5524);
       System.out.println(hashMap);
       System.out.println(hashMap.get("ırmak"));
       System.out.println(hashMap.containsKey("Ayşe"));
       System.out.println(hashMap.containsValue(5523));   
          hashMap.replace("ırmak",5522);
          System.out.println(hashMap);    
    }
}
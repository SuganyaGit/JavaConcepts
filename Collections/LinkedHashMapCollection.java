/*
A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It is same as HashMap instead maintains insertion order.
*/

import java.util.*;  
class LinkedHashMapCollection{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

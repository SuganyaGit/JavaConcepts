/*
A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
*/

import java.util.*;  
class HashMapCollection{  
 public static void main(String args[]){  
   
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(102,"Rahul");  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(101,"testDup"); // Not displayed in result 
  hm.put(null,"testDup");
  hm.put(103,"Vijay");
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

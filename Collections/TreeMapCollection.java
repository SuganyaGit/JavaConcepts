/*
A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
It contains only unique elements.
It cannot have null key but can have multiple null values.
It is same as HashMap instead maintains ascending order.
*/

import java.util.*;  
class TreeMapCollection{  
 public static void main(String args[]){  
   
  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

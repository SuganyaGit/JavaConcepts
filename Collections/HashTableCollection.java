/*
A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method.A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
It contains only unique elements.
It may have not have any null key or value.
It is synchronized.


*/

import java.util.*;  
class HashTableCollection{  
 public static void main(String args[]){  
   
  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
  
  hm.put(101,"Vijay"); 
  hm.put(100,"Amit");
  hm.put(103,"Ravi");   
  hm.put(102,"Ravi");   
  hm.put(103,"Ravisf");
  //hm.put(null,"dup"); run time error if uncommented. Null not allowed here
   
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  

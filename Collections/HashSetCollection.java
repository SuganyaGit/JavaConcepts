/*
uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
contains unique elements only.
can have one null element
Insertion Order not maintained
List can contain duplicate elements whereas Set contains unique elements only.
*/

import java.util.*;  
class HashSetCollection{  
 public static void main(String args[]){  
   
  HashSet<String> al=new HashSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");
  al.add(null);  
  al.add("Ajay");  
  al.add(null);  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
} 

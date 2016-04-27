/*
Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
can hav null
*/

import java.util.*;  
public class LinkedListCollection{  
 public static void main(String args[]){  
   
  LinkedList<String> al=new LinkedList<String>();  
  al.add("spring");  
  al.add("java");  
  al.add("web");  
  al.add("jenkins");  
  al.add(null); 
  al.add("jenkins");   
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
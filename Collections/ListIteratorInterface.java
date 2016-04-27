/*
Commonly used methods of List Interface:

public void add(int index,Object element);
public boolean addAll(int index,Collection c);
public object get(int Index position);
public object set(int index,Object element);
public object remove(int index); index starts with '0'
public ListIterator listIterator();
public ListIterator listIterator(int i);
Java ListIterator Interface

ListIterator Interface is used to traverse the element in backward and forward direction.
*/

import java.util.*;  
public class ListIteratorInterface{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Spring");  
al.add("Jenkins");  
al.add("Sonar");  
al.add(1,"Test"); 
al.add("Sonar");   
al.add(null);
  
System.out.println("element at 2nd position: "+al.get(2));  
  
ListIterator<String> itr=al.listIterator();  
  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
  
  
System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious()){  
System.out.println(itr.previous());  
 }  
}  
}  
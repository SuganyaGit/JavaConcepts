import java.util.*;  
class SortingCollection{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(Integer.valueOf(560));  
al.add(Integer.valueOf(790));  
al.add(210);//internally will be converted into objects as Integer.valueOf(230)  
  
Collections.sort(al);  
  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
System.out.println("Reverse Order"); 
System.out.println("============="); 
Collections.sort(al,Collections.reverseOrder());  
  
itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  

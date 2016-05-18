/*

Before generics, we can store any type of objects in collection i.e. non-generic.
Now generics, forces the java programmer to store specific type of objects.

Advantage of Java Generics

There are mainly 3 advantages of generics. They are as follows:

1)	Type-safety : We can hold only a single type of objects in generics. It doesn’t allow to store other objects.

2)	Type casting is not required: There is no need to typecast the object.

3)  Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
     The good programming strategy says it is far better to handle the problem at compile time than runtime.
*/

import java.util.*; 
class generics{

public static void main(String args[]){

Map<Integer,String> map=new HashMap<Integer,String>();  
map.put(1,"sgfs"); 
map.put(7,"vijay");  
map.put(3,"umesh");  
map.put(6,"ankit");  


Map<Integer,String> map=new HashMap<Integer,String>();  
map.put(1,"sgfs"); 
map.put(7,"vijay");  
map.put(3,"umesh");  
map.put(6,"ankit");  
  
//Now use Map.Entry for Set and Iterator  
Set<Map.Entry<Integer,String>> set=map.entrySet();  
  
Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
while(itr.hasNext()){  
Map.Entry e=itr.next();//no need to typecast  
System.out.println(e.getKey()+" "+e.getValue());  
} 

}
}

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

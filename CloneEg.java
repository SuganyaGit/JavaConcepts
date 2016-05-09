class CloneEg implements Cloneable{  
int rollno;  
String name;  
  
CloneEg(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
 public Object clone()throws CloneNotSupportedException{  
return super.clone();  
} 
  
public static void main(String args[]){  
try{  
CloneEg s1=new CloneEg(101,"amit");  
  
CloneEg s2=(CloneEg)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  

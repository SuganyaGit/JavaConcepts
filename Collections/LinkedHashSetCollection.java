/*
contains unique elements only like HashSet. It extends HashSet class and implements Set interface.
maintains insertion order.
Accepts one null
*/

import java.util.*;
class Student{  
  int rollno;  
  String name;  
  int age; 

  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  } 
//Removing duplicates
 public int hashCode(){
     //   System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = rollno;
      System.out.println("In hashcode:"+hashcode);
        return hashcode;
    } 
 public boolean equals(Object obj){
        System.out.println("In equals");
        if (obj instanceof Student) {
            Student stud = (Student) obj;
            return (stud.rollno==this.rollno);
        } else {
            return false;
        }
    }

}
  
class LinkedHashSetCollection{  
 public static void main(String args[]){  
   
  LinkedHashSet<String> al=new LinkedHashSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
 LinkedHashSet<Student> a2=new LinkedHashSet<Student>();  
  Student s1=new Student(101,"Sonoo",23);  
  Student s2=new Student(103,"Ravi",21);  
  Student s3=new Student(102,"Hanumat",25); 
 Student s4=new Student(103,"Ravi",21);  

  a2.add(s1);//adding Student class object  
  a2.add(s2);  
  a2.add(s3);  
 a2.add(s1);
 a2.add(s4);
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  

Iterator itr2=a2.iterator();  
  while(itr2.hasNext()){  
   Student st=(Student)itr2.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age); 
  } 

 
 }  
}  

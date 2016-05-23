/*
contains unique elements only like HashSet. The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
maintains ascending order.
No null(No error in compilation, but during runtime error will be displayed)
*/

import java.util.*;
class Student implements Comparable{  
  int rollno;  
  String name;  
  int age; 

  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  } 
//Removing duplicates

 public int compareTo(Object obj){
        System.out.println("In equals");
        if (obj instanceof Student) {
            Student stud = (Student) obj;
		if(stud.rollno==this.rollno)
			return 0;
		else if(stud.rollno<this.rollno)
			return 1;
		else
			return -1;
	        } else {
            return -1;
        }
    } 

}

  
class TreeSetCollection{  
 public static void main(String args[]){  
   
  TreeSet<String> al=new TreeSet<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");
 TreeSet<Student> a2=new TreeSet<Student>();  
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

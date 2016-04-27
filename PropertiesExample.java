/*
Properties class in Java

The properties object contains key and value pair both as a string. It is the subclass of Hashtable.

It can be used to get property value based on the property key. The Properties class provides methods to get data from properties file and store data into properties file. Moreover, it can be used to get properties of system.

Advantage of properties file

Easy Maintenance: If any information is changed from the properties file, you don't need to recompile the java class. It is mainly used to contain variable information i.e. to be changed.

Methods of Properties class

The commonly used methods of Properties class are given below.

Method	Description
public void load(Reader r)	loads data from the Reader object.
public void load(InputStream is)	loads data from the InputStream object
public String getProperty(String key)	returns value based on the key.
public void setProperty(String key,String value)	sets the property in the properties object.
public void store(Writer w, String comment)	writers the properties in the writer object.
public void store(OutputStream os, String comment)	writes the properties in the OutputStream object.
storeToXML(OutputStream os, String comment)	writers the properties in the writer object for generating xml document.
public void storeToXML(Writer w, String comment, String encoding)	writers the properties in the writer object for generating xml document with specified encoding.
*/

import java.util.*;  
import java.io.*;  
public class PropertiesExample {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("db.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  

Properties p2=System.getProperties();  
Properties p3=new Properties(); 
//Create new property

p3.setProperty("name","testName");  
p3.setProperty("email","testEmail");  

p3.store(new FileWriter("info.properties"),"testWriteProperties");    
}  
}

   

import java.io.*;  
class ReadTxtFileContent{  
public static void main(String args[])throws Exception{  
FileInputStream fin=new FileInputStream("javaFileNames.txt");  
BufferedReader br = new BufferedReader(new InputStreamReader(fin));
 
	String line = null;
File file;
	while ((line = br.readLine()) != null) {
		//create File object
    file = new File(line+".java");
   
    /*
     * To actually create a file specified by a pathname, use
     * boolean createNewFile() method of Java File class.
     *
     * This method creates a new empty file specified if the file with same
     * name does not exists.
     *
     * This method returns true if the file with the same name did not exist and
     * it was created successfully, false otherwise.
     */
   
     boolean blnCreated = false;
     try
     {
       blnCreated = file.createNewFile();
     }
     catch(IOException ioe)
     {
       System.out.println("Error while creating a new empty file :" + ioe);
     }
   
     System.out.println("Was file " + file.getPath() + " created ? : " + blnCreated);
   
     /*
      * If you run the same program 2 times, first time it should return true.
      * But when we run it second time, it returns false because file was already
      * exist.
      */
	}
 
	br.close();
 
fin.close();  
}  
}  




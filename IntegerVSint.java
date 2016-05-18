class IntegerVSint{
public static void main(String args[]){

String str="5";
Integer val=10;
String excpStr="asdf";

System.out.println("str:"+Integer.parseInt(str)); 
System.out.println("str valofx:"+Integer.valueOf(val));
try{
System.out.println("str:"+Integer.parseInt(excpStr));
}

catch(NumberFormatException e){
System.out.println("Ins exception:"+e.getMessage());
}

catch(Exception e){
System.out.println("Exception:"+e.getMessage());
}

}
}

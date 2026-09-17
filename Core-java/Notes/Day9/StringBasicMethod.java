 /* 1. Basic / length-related
	length()
	isEmpty()
	isBlank() — Java 11+ 
	
	========
	2. Character access
	charAt()
	===============
	3. Comparison
	equals()
	equalsIgnoreCase()
	compareTo()
	compareToIgnoreCase()
	
=============================
                Searching
	contains()
	startsWith()
	endsWith()
	indexOf()
	lastIndexOf()
	
	*/
import static java.lang.IO.*;
import java.util.Arrays;
void main(){
	String str="abcd";
	String str5=new String("ABCD");
	int len=str.length();
	IO.println(len);
	String str1=" ";
	boolean bool1=str1.isEmpty();// ''
	boolean bool2=str1.isBlank();
	IO.println(bool1);
	IO.println(bool2);
	//public char charAt(int);
	char ch=str.charAt(1);
	IO.println(ch);
	//== --> Address...
	boolean beq=str.equals(str5);
	boolean beqic=str.equalsIgnoreCase(str5);
	println(beq);
	println(beqic);
	
   int compare= str.compareTo("abcd");
   println(compare);
   
   
   //public boolean contains(java.lang.CharSequence);
   
    String str6="i like java";
	boolean boolc=str6.contains("z");
	println(boolc);
	//
	println(str6.startsWith("i",0));
	
	
	String str7="  bcrno ouhebf oauhf  ";
	println(str7.indexOf("o"));
	
	println(str7.lastIndexOf("o"));
	String str8=str7.toUpperCase();
	println(str8);
	println(str8.toLowerCase());
	
	println(str7.trim());
	
	
	  /*   replace()
		replaceFirst()
		replaceAll() */
	println(str7.replace("bcrno","Zen"));
	
	
	/* split()
	concat()
	join() */
	  String [] sarry=str8.split(" ");
	  println(Arrays.toString(sarry));
	  
	  println(str8.join(" ","-"));
	  
	  
	/* toCharArray()
	getBytes()
	valueOf() */ 
   char [] ch10= str8.toCharArray();
    println(Arrays.toString(ch10));
     	
	byte [] b11=str8.getBytes();
	println(Arrays.toString(b11));
	
    int val =10;
	String str111= String.valueOf(val);	
	println(str111);
	  
	  
	  
}
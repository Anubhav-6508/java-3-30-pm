what is comment?
-> comment is special syntax
	use to tell to compiler to ingore those line which in comment(//,/**/,/** */)
/*

// --> Info to another programer --> clean coding
 TOD
 write a java program where u add two number 
*/


// best practice
/**  // it not simple multi line comment
	
	build by abc person...
	version 1.0v
	date : 1995

*/

class Day3{
	
	//It is method where we are add two numbers
	public static void addition(int a, int b){// class memory
		int c=a+b;
		System.out.println(c);
	}
	// It is Main method which will call JVM
	public static void main(String args[]){
		/*int a=5;
		int b=5;
		int c=a+b;
		System.out.println(c);*/
		
		addition(10,20);// compiler --> it doen't knnow where this method present
	}
	
}
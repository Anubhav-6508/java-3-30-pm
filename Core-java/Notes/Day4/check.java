class Day2{
	int num1=5;
	int num2=6;
	int num3=7;
	public void m1(){
		System.out.println("I am in m1 method"+num2);
	}
	public void m2(){
		// System --> class 
		// in the System class   PrintStream varibal  out
		// println method present in PrintStream class
	// System class having static fiels
	// static PrintStream out=new PrintStream();
		System.out.println("I am in m1 method"+num2);
	}
}
class check{// System
	static public void main(String abcd[]){
		 
		 //PrintStream out =new PrintStream();
		 //out.println();
		Day2 out =new Day2();
		System.out.println(out.num1);
		out.m1();
		System.out.println("HELLO WORLD...");
	}
}

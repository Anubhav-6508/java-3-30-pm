// Operators
class Day10{
	public static int add(int a, int b){
		int c=a+b;
		//+--> symbol (operator)
		// a,b -> operand
		//IO.println(c);
		return c;
	}
	public static int minus(int a,int b){
		int c=a-b;
		 // - operator
		 // a-b operands
		// IO.println(c);
		return c;
	}
	public static int multiply(int a, int b){
		int c=a*b;
		//operator (*)
		// a,b operand
		IO.println(c);
		return c;
	}
	public static double divide(int a,int b){
		double c= a/b;  // a(int )/b (int)--> int  3
		// double c=3;
		// 3.0
		//IO.println(c);
		return c;
	}
	public static int modulos(int a, int b){
		//return a%b;
		int c= a%b;
		return c;
	}
    void main(){
		IO.println(Day10.add(10,20));
		IO.println(Day10.minus(20,10));
		int mult=Day10.multiply(5,3);
		IO.println(mult);
		IO.println(Day10.divide(10,3));
		int val =Day10.modulos(10,3);
		IO.println(val);
		
	}	
}
class A{
	int a;   // instance variable // global
    String name;
	static int c;
	static public void m1(){
		static int b=10;  // non -static  // 
		System.out.println("Hello"+a+" "+b);
	}
	void m2(){
		System.out.println("Hello"+name);
	}
	
}
class PrivateAccess{
	public static void main(String args[]){
		A a=new A();
		a.m1();
	}
}


//  Access modifier 
//  static/ non static 
//  final
//  return type  
// method name 
// pernthesis ( whatever parameter)
// throws exception

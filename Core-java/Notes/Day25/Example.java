class Example {

	static int a = 10;
	int x = 20;
	
	public static void main(String[] args) {

		Example e1 = new Example();
		Example e2 = new Example();

		System.out.println(e1.a +" "+e2.a); // 10   10
		System.out.println(e1.x +" "+e2.x); // 20   20
		System.out.println();

		e1.a = 15;
		e1.x =16;

		System.out.println(e1.a +" "+e2.a);  //15   10
		System.out.println(e1.x +" "+e2.x);  //16   20
	}
}
//> javac Example.java
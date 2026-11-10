/* class Example {
// whever class is loaded then static family is also
	        // execute 
	static int a = 10;  // a[0/ 10] 	
	int x = 20;
	
	
	public Example(){
		super();
	}
	
	public static void main(String[] args) {

		Example e1 = new Example();
		Example e2 = new Example();

		System.out.println(e1.a +" "+e2.a); 
		System.out.println(e1.x +" "+e2.x);
		System.out.println();

		e1.a = 15;
		e1.x =16;

		System.out.println(e1.a +" "+e2.a);  
		System.out.println(e1.x +" "+e2.x);  
	}
}
//> javac Example.java */

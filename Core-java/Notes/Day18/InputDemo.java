import java.io.*;
class InputDemo{
	void main()throws IOException{
	/* System.out.println("i am in first line");
		System.in.read();
	System.out.println("i am in second line"); */	
	
	   /*  System.out.println("i am in first line");
		System.out.println(System.in.read());
		System.out.println(System.in.read());
		System.out.println(System.in.read());
		System.out.println("i am in second line");	 */
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		 int val1 =Integer.parseInt(br.readLine());
		System.out.println(str);
		System.out.println(val1);
		
		
		java -> object oriented programing
		// BR -> Pipe line
	    // coversion problem
		// throws IOException
		// difficult
		
	//Scanner--> 
	/*  object oriented
	 solve coversion
	 no need of wring throws IOException
	 easy */
	 
	/*  Scanner sc=new Scanner(System.in);
	 sc.next();  // single String  bdhfbi jdgfi   
	 sc.nextLine(); // it take input till enter
	 sc.nextInt();
	 sc.nextFloat();
	 sc.nextDouble();
	 sc.nextBoolean();
	 .....
	 sc.next().charAt(0); */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
}
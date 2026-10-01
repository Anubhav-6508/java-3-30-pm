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
	   
		
	}
}
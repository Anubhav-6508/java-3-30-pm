import java.util.Scanner;
class Example{
    static int a; // a[0  ]
	 static {
		 System.out.println("SB"); //sb
		 Scanner scn = new Scanner(System.in);
		 System.out.print("Enter a: "); // Enter a: 
		 a = scn.nextInt();  // a[xyz]
		 System.out.println("value is stored in SV a\n"); //
	 }
	 public static void main(String[] args) {
		 System.out.println("main"); //
		 System.out.println(" a: "+a); //  
	 }
} 

class Parent{
	int proll;
	String pname;
	public Parent(){}
	public Parent(int proll,String pname){
		this.proll=proll;
		this.pname=pname;
	}
}


class ConstructerDemo extends Parent{
	int roll; //101
	String name; // aj
	// default constucter     //101    //aj
 	public ConstructerDemo(int roll,String name){//parameter
		//super();  //this()
		this.roll=roll;//101
		this.name=name;
	} 
	public ConstructerDemo(){
		super();
	}
	public static void main(){
		ConstructerDemo cd=new ConstructerDemo(101,"aj");//Argument
		IO.println(cd.roll);
		IO.println(cd.name);
		
	}
	
	// type of method
	//-> static 
	//-> non-static
	/* <Access Modifer> <static / non-static> 
	<final> <return type>  <Method Name>
    <parenthesis> <throws Exception > */
	// static --> static method class level
	// method which called by class name
	/* non-static -> non-static method info is present
	in method Area so whenever we have to call 
	non-static	method
	we have create object and then call the method; */
	/*
	instance variable --> 
	these are the gloable variable which can be
	access within the class .
	--> when object is created instance variable is    instialize by default value . 
	*/
	
	/*
		1.when  object is craeted and we don't want 
		  default value instialize in instance variable
		  so have created Constructer
		2. Constructer instialize instance variable
		   when object craeted.
		3.static and return type is not use in 
		   Constructer Signature.
		4. constucter is called when object is   created.
		signature
		<AccessModifier> <className>
		<Parameter> <throws Exception>
		
		5. if u are not creating constucter jvm will create default constucter
		6. if you have  create any constucter then jvm will 
		   not create default constucter.
		   
		7. the first line of constucter is super or this 
		   you or not write jvm will create super () in constucter
	
	*/
}
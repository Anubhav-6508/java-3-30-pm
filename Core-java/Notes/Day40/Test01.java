/*
1. What is an Abstraction?
    -> The process of creating a class by hiding the implementation details of an object's operation and providing necessary information 
	  to the user programmer for accessing this object's operations is called abstration.

2. How can we develop an abstraction?
	-> The abstraction is developed by using an abstract method
      by declaring it either inside 'abstract class' or inside an 'interface'.

3. What is abstarct method?
	-> A method that has only declaration ends with ; 
	  is called abstract method.

	-> It means an abstract method must not contain body { },
	  it must ends with ; and must contain 'abstract' keyword
	  in its declaration.
	
	-> For example:
		abstract class A {
			abstract void m1();
		}

4. Why Abstration or Adv abstraction?
	- Abstraction givens benifits to user programmer

	- Abstration hide the bigger picture of the object 
	  implementation details. So that the user programmer
	  easily find the list of the methods available in
	  this object and can access easily.
	
	- Abstraction provides 100% strong encapsulation
	  because user programmer has only methods information
	  to access. All fileds are hidden in sub class and provides
	  access only via methods those are declared in super class.

	- Abstration forces all sub classes to implement the method
	  with same singnature. Hence the method which is invoked in user class
	  can be executed from all sub class at runtime dynamically.

	- Abstraction provides 100% Runtime Polymorphism between user class and sub classes
	  because the invoked method is 100% implemented in sub class and 
	  the object stored in super class referened variable is always sub class object

	- If you want achieve 100% SE, LC and RP,
	  you must develop your object starts with abstraction
	  then automatically all OOP concepts class, object, Encapuslation, 
	  inheritance, polymorphsim following by SE, LC and RP are implemented
	  and your project becomes highly scalable and extensable.

5. Real life examples on abstraction?
		User class   Super class
	1. Person     and Fan { void on(); and off(); }   
					-> Elecrician and Fan companies	---> Sub classes
									-> Bajaj
									-> Usha
									-> Ganga
									-> Havells

	2. Developer and Keyboard { void typing(); }		
						-> Lenovo	{ void typing() { --- } }
						-> Dell		{ void typing() { --- } }
						-> Zebronics{ void typing() { --- } }

	3. Person and Digestive System [I Don't know -> Abstaction]	

	4. Passenger wants to catch a Bus []
		Abstraction means 
			1. hide unncessary information	[super class developer point of view]
			2. take necessary information	[user class developer proint of view]

6. Real time(business) examples on abstraction?	
					User class				 super class
	1. Customer 
				-> ATM [card.withdraw();] -> ATMCard [void withdraw();]
													-> HDFCCard
													-> SBICard
													-> KotakCard

	2.			-> Mobile [sim.call();] -> SIM [void call();]
											 -> Airtel
											 -> BSNL
											 -> jio
											 -> Vi

	3.			-> Plank	-> TubeLight
									-> Philips
									-> Wipro
									-> Surya

7. What are the rules we must follow in developing abstraction?
	1. The method must not have body { }
	   it must ends with ; and must contian abstart keyword
       else it leads to CE

	2. If a class contains abstract method,
	   this class must be declared as abstract
	   else it leads CE:

	3. Fro sub class from an abstrat class 
	   we must use 'extends' keyword. 
	   
	4. The sub class of an abstract class must override
	   all abstract methods available in this abstract class
	   or must declare it as abstract else its leads to CE

	5. We can not instantiate an abstract class,
	   it leads to CE, because it is not fully implemented.

Below example shows implementing abstraction
with abstract method and abstrfact class

calling and executing it from different sub class
and its execution flow
*/

class Test01  {
	public static void main(String[] args) {
		A a1 ;		//allowed
		
		//a1 = new A(); //R #3:
		//a1.m1();

		a1 = new C();
		a1.m1();
	}
}

//abstraction
abstract class A { //R #2:
	abstract void m1(); //R #1:
}

class B extends A { //R #4:
	void m1() {		//R #5:
		System.out.println("B m1");		
	}	
}

class C extends A {
	void m1() {
		System.out.println("C m1");
	}
}
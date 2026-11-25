/*
1. What is an abstract method?
2. What are the rules in creating abstract method?
3. Where can we create abstact method?
4. When must we declare a class as abstract?
5. What is the rule on an abstract class?
6. When must we declare a class as an abstract?
7. Can we declare a concrete class as an abstract, Yes, why?
8. What are the different members we can create inside an abstract class?
9. Can an abstract class has constructor, yes, need of it?
10. Can we create object from abstract class, no, but ...? 
11. Can we declare abstract method as final, static, private?
12.	What are the allowed modifiers to an abstract method?
13. Can we declare abstract class as final?

14. What is the use of abstract method?
15. A sub class can implement how many businesses?
16. What is the code we must write to create a class implmenting mulitiple businesses?

*/

class Bike {
	void printDetails() { }
}

class Car {
	void printDetails() { }
}

class Honda extends Bike, Car { //multiple inheritance

}

/*
17. Does Java support Multiple inheritance by using a class (either CC or AC)?
	- Java does not support multiple inheritance by using classes

18. Then how we implement multiple busniness with single class in Java?
	- by using interface

19. When we have abstaract class for developing abstraction,
    why do we have interface?
	- Java does not support multiple inheritance by using classes
	  for supporting multiple inheritance and for implementing 
	  multiple businesses at a time by using a single class
	  interface is given in Java Langauge.

20. Why Java does not support multiple inheritance by using class?
	because it leads ambiguous to the compiler 
		1. in calling and executing	constructor by using super() and 
		2. in calling and executing method by using super keyword 
		   if both super classes constain a method with same signature.

			class Bike {
				void printDetails() { }
			}

			class Car {
				void printDetails() { }
			}

			class Honda extends Bike, Car { //multiple inheritance
				Honda() {
					super(); //a e, calls which super class constrcutor?
				}	

				void showDetails() {
					super.printDetails(); //a e, calls which super class method?
				}
			}


	Note: This multiple inheritance 'ambiguous error 
				is also called as 'diamond problem'

						 Object

			
					Car			Bike


						 Honda



*/



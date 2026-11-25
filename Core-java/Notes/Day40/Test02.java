/*
Create RWO Shape in the PW by implementing all OOP concepts
by achieving security to object data and dynamic binding between
user class and sub classes objects of this Shape object
	1. class
	2. object

	3. Encapsulation

	4. Inheritance
	5. Polymorphsim
	6. Abstraction

	7. Loose coupling
	8. Runtime Polymorphsim
	9. Message passing

1. We must create this Shape object 
   by using three types of classes
   	1. Super class	-> Shape
	2. Sub classes	-> Rectangle, Square, Circle
	3. Use class	-> Painter

2. In the super class Shape, we mus declare the operation findArea()
   to force all its sub classes to implement this operation as per
   their requiement, because the findArea() operation implementation
   logic is changed from one sub type to another sub type and also
   for acheving 100% LC and RP as shown below

						    Shape
								void findArea(); //its implementation is changing
												//from one sub type to another sub type

		Rectangle				Square					Circle
			void findArea(){		void findArea(){		void findArea(){

				l*b						s*s						PI*r*r
			}						}						}
			
3. Then in the user class Painter, we must call findArea() method
   by using super class 'Shape' type referenced variable 
   by storing sub class object for achieving (LC and RP)
 
as shown below

*/

//abstraction 
abstract class Shape {
	abstract void findArea();		
}

//inheritance
class Rectangle extends Shape {

	private double l;	//encapsulation
	private double b;

	void findArea() {	//polymorphism
		System.out.println("Rectangle area");
	}
}

class Square extends Shape {
	void findArea() {//polymorphism
		System.out.println("Square area");
	}
}

class Circle extends Shape {
	void findArea() {//polymorphism
		System.out.println("Circle area");
	}
}

class Painter {

	public static void main(String[] args) {
		Shape s1;				//LC	

		s1 = new Rectangle();	//Message passing
		s1.findArea();		//RP or DB

		s1 = new Square(); //message passing
		s1.findArea();		//RP


		s1 = new Circle();	//message passing
		s1.findArea();		//DB

	}
}

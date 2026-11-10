class Animal{ //Super class
              // Parent class
	public void leg(){
		IO.println("4 legs ...");
	}
	public void eye(){
	  IO.println("2 eye ...");
    }
	public void tail(){
		IO.println("1 tail ...");
	}
}        
class Lion extends Animal{
	
}
class Tiger extends Animal{
	
}
class Test{
	void main(){
	Animal a=new Tiger();
	a.leg();
	a.eye();
	a.tail();
	IO.println("===================");
	
	}
}
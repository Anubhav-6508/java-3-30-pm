class Parent{
   	public Parent(){
		IO.println("no-parametrise Const parent class");
	}
}
class Chain extends Parent{
	public Chain(){
		IO.println("no-parametrise Const");
	}
	public Chain(int a , int b){
		this(a);
		IO.println("two-parametrise Const");
	}
	public Chain(int a){
		this();
	 IO.println("Single-parametrise Const");
	}
}

class ConstructerChaning{
	public static void main(String args[]){
		Chain c=new Chain(1,2);
	}
}
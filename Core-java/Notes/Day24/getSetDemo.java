import static java.lang.IO.*;

class Student{// extends Object //
	int sId;
	String sName;
	
	public Student(){}
	public Student(int sId,String sName){
		this.sId=sId;
		this.sName=sName;
	} //while object creation -> intialize
	
	public void setSId(int sId){
		this.sId=sId;
	}
	public void setSName(String sName){
		this.sName=sName;//abc
	} // after Object Creation
	public String display(){
		return "sId: "+sId+" "+"sName: "+sName;
	}
	@Override
	public String toString(){
		return "sId: "+sId+" "+"sName: "+sName;
	}
	public static void main(String args[]){
		Student s1=new Student(1,"Aj");
    /*     println(s1.sId);		
        println(s1.sName);		
       println("manualy calling toString() :"+s1.toString());				
        println("my own display() : "+s1.display());	
        println("help ToString() :"+s1); */	
		s1.setSName("ABCD");
       println(s1);		
		
	}
}
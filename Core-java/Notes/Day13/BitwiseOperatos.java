import static java.lang.IO.*;
public String bitwiseAndOp(int a,int b){
	int c= a&b;
	return "Our bitwise And Value = "+ c;
}
public String bitwiseOR_Op(int a, int b){
	int c=a|b;
	return "Our bitwise OR Value = "+ c;
}
public String bitwiseNo_Or(int a,int b){
	int c=a^b;
	return "Our bitwise not OR Value = "+ c;
}
public String bitwiseNot(){
	int c=~5;
	   // n =-(n+1);
	return "Our bitwise Not Value = "+ c;
}
public String bitwiseLeftShift(int a, int b){
	int c= a<<b;
	//a* 2^n
	 //5 * 2 1 =10
	return "Our bitwise Left Shif Value = "+ c;
}
public String bitwiseRightShift(int a, int b){
	int c= a>>b;
	  //a/ 2^n
	 //5 / 2 1 =10
	return "Our bitwise Right Shift Value = "+ c;
}

void main(){
	println(bitwiseAndOp(4,6));
	println(bitwiseOR_Op(5,6));
	println(bitwiseNo_Or(4,6));
	println(bitwiseNot());
	println(bitwiseLeftShift(5,1));
	println(bitwiseRightShift(5,1));
}
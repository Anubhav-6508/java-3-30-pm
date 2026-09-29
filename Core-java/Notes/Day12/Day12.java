public String doubleEquals(int a,int b){
	if(a>b){
		return "A equals to (==) b";
	}
	return "A not equals to B";
}
public String logicalOperators(int c, int e){
	if(!(c>=0 || c>=e)){
		return "both condition are true";
	}
	return "any one of the condition is false";
}
public int AssOperators(int c, int e){
	c+=10;
	// c=c+10;
	return c;
}
public String ternaryOp(int a, int b){
	return (a>b)?"A greater than B":"A less than B"; 
}

void main(){
	String str=doubleEquals(10,20);
	IO.println(str);
	IO.println(logicalOperators(0,8));
	IO.println(AssOperators(0,8));
	IO.println(ternaryOp(0,8));
}
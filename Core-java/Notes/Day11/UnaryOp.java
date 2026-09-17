class UnaryOp{
	public int increment(int a){
		// 10+1
		return ++a;
	}
   	public int decrement(int b){
		return --b;
		return --b;
	}
	public int postIncrement(int c){
		//[]  c=5+1 =6 
		c=(c++) + (c++);  //6+5=11
		return c;  // 11,11
	}
	public int preIncrement(int c){
		int d=0; 
		d=(++c) + (++c);// 13,12,12,10 
		return d;
	}
	public int tryPrePost(){
		int a=10;// 11
		 return a++;
		 /* IO.println("A--> : "+a);
		 IO.println("b---> :"+b);
		 return a; */
	}
	public static void main(String args[]){
		UnaryOp op=new UnaryOp();
		int val=op.decrement(10);
		IO.println(val);
		IO.println(op.postIncrement(5));
		IO.println(op.preIncrement(5));
		IO.println(op.tryPrePost());
	}
}
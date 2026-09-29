import static java.lang.IO.*;
void main(){
	
	println("1. Addition");
	println("2. Subtraction");
	println("3. Multiplication");
	println("4. Division");
	println("5. Exit.");
	
    int choice =0;
	do{
	choice=Integer.parseInt(readln("Enter the choice"));
		int result=switch(choice){
			case 1->10+5;
			case 2->10-5;
			case 3->10*3;
			case 4->10/2;
			default->-1;
		};
		println(result);
	}while(choice<5);
	
}
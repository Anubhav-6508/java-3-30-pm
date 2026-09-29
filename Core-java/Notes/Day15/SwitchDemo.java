import static java.lang.IO.*;
void main(){
	String day=readln("Enter the day : ");
	
	int msg=switch(day){
		case "mon"-> 1;
		case "tue"->  1;
		default-> yield 9;
	};
	println(msg);
	
}
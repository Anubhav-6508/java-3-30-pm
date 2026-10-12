import static java.lang.IO.*;
void main(){
   String pinCode="abc ";
          //false              //        
 if(!(pinCode.contains(" ")) && pinCode.length()==4){
	   println("THE PIN LENGTH IS CORRECT");    
	}else{
		println("PIN LENGTH MUST BE FOUR"); 
	}
   
   
}
package MethodJava;

public class HomeWork2 {
	
public static void main(String[] args) {
		
		getGender('m'); // declaring variable and value. data type??
		
	}
	
 public static void getGender(char gender) { 
//modifier, return, method---parameters	 

 
	switch (gender) {
	    // controlling expression  
	
	
	case 'f':
		 System.out.println("Female:" +  gender );
	     break;
	
		
	
	case 'm':
		 System.out.println("Male:"  +  gender);
		 break;
	
		 
		 
	default: 
		System.out.println("error");
		

}
}
}
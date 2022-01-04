package MethodJava;

public class HomeWork1Trial {
	
	public static void main(String[] args) {
		
		calculate(7.5, 9.3, '+'); //declaring variable and value
		
	}
	
 public static void calculate( double numOne, double numTwo, char mathOperationSign) { // outside of the loop
	 
 
	switch (mathOperationSign) { // use when i have at least 2 options to differentiate. Also use the break; key
	      //controlling expression
	
	
	case '+': 
		 System.out.println(numOne + numTwo); // to print
	     break;
	
	case '-':
		 System.out.println(numOne - numTwo);
		 break;
	
	case '*':
		 System.out.println(numOne * numTwo);
		 break;
	
	case '%':
		 System.out.println(numOne % numTwo);
		 break;
		 
	case '/':
		 System.out.println(numOne / numTwo);
		 break;
	
		
	
	 
	}
 
 }
}

package MethodJava;

public class HomeWork3 {
	
	public static void main(String[] args) {
		
		oddEven (23); // declaring variable and value up to 23.
	}

	public static void oddEven(int number) { // method declaration
// modifier, return method, parameter	
		
		//if--else; boolean expression. use when we have 2 conditions and one is true or false
		
		if ( number % 2 == 0) { // if boolean--expression
			System.out.println("The number is an even number"); // print
			
		}else  { // second condition true or false
			System.out.println("The number is and odd number");// print
		}
		
		
	}
}

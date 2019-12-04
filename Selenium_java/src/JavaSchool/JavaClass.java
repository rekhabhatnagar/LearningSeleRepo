package JavaSchool;

/*Arithmatic Operators
 * Addition ‘+’ : This add two numbers or concatenate two strings
Subtraction ‘-‘ : This subtracts right side operand from the left side operand
Multiplication ‘*’ : This multiplies two numbers
Division ‘/’ : This divides left side operand by the right side operand
Modulo ‘%’ : This divides left side operand by the right side operand and returns remainder
Increment ‘++’ : This increases the value by 1
Decrement ‘- -‘ : This decreases the value by 1*/

public class JavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b = 10, c = 5;
		 a = b + c;
		 System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		 a = b - c;
		 System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		 a = b * c;
		 System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		 a = b / c;
		 System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		 
		 b = 13;
		 a = b % c;
		 System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		 b++;
		 System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		 c--;
		 System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);
		
		 //Relational Operators
		 System.out.println("a > b " + (a>b));
		 System.out.println("a > b " + (a==b));
		 System.out.println("a > b " + (a!=b));
		 
		 //Conditional Operator 
		 //variable = (expression) ? value if true : value if false
		 
		 int Val;
		 String str; 
		 str = (a >b ) ? "a is greater" : "b is greater";
		 System.out.println ("(a >b ) ? a : b " + str);
		 
		 Val = (a >b ) ? a : b;
		 System.out.println ("(a >b ) ? a : b " + Val);
		 
		 }
		 

}

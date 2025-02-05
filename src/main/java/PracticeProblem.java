import java.util.Scanner;

public class PracticeProblem {
//1. Get a String using "In: " as the prompt.  Output the string.
//2. Get two integers from user input using "In: " as the prompt.  Output the quotient (rounded down) and the remainder on separate lines.
//3. Get a String using "In: " as the prompt.  Output the String + " was the text you wrote" on the same line.
//4. Get an integer from user input using "In: " as the prompt.  Output the result of the integer times by 5.
//5. Get a boolean using "In: " as the prompt.  Output the boolean followed by " is a boolean"
//6. Get a double using "In: " as the prompt.  Output the double - 3.2.

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		
		String text;
		text = in.nextLine();
		System.out.print("In: "+text);
		System.out.println("");

	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: In: ");
		
		int num1;
		int num2;
		num1 = in.nextInt();
		in.nextLine();
		
		num2 = in.nextInt();
		in.nextLine();
		System.out.print(num1/num2); 
		System.out.println("\n"+num1%num2);
		
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String textAgain;
		textAgain = in.nextLine();
		System.out.print(textAgain + " was the text you wrote");
		System.out.println();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int nextNum;
		nextNum = in.nextInt();
		in.nextLine();
		System.out.print((nextNum*5)+"\n");

		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean newBoolean;
		newBoolean = in.nextBoolean();
		System.out.print(newBoolean+" is a boolean");
		System.out.println();
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double doubelNum;
		doubelNum = in.nextDouble();
		System.out.print(doubelNum - 3.2);
		System.out.println();
	}

}

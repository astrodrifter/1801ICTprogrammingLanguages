package ezDemo;
import java.util.Random;


public class HelloWorld1 {

	public static void main(String[] args) {
		
		//print hello world
		System.out.println("Hello World");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//declare, initialize and print an integer
		int myNum;
		myNum = 2;
		System.out.printf("myNum = " + myNum + "\n");
		
		//declare, initialize and print a string
		String myString = "Word";
		System.out.println(myString);
		myString = "New word";   //assign new string to myString
		System.out.println(myString);
		
		//while loop
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		// Array of integers
		int myArray[] = new int[5]; //elements initialized to zero automatically
		myArray[0] = 1;
		
		for (int j = 0; j < 5; j++) {
			System.out.println(myArray[j]); //print array elements
		}
		
		// 2D array of integers
		int myArray2[][] = new int[5][5]; //elements initialized to zero automatically
		myArray2[0][0] = 1; //enter a value into first element position
		
		//fill array with random number between -10 and 10
		int max = 10;
		int min = 0;
		Random rn = new Random();
		int n = max - min + 1;
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				int num = rn.nextInt() % n;
				myArray2[j][k] = num;
			}
		}
		
		
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
			System.out.printf(" " + myArray2[j][k]); //print array elements
			}
			System.out.printf("\n");
		}
		
		// find max in each row of myArray
		int biggest = myArray2[0][0];
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				if(myArray2[j][k] > biggest) {
					biggest = myArray2[j][k];
				}
			}
		}
		System.out.printf("biggest = " + biggest + "\n");
		
		// access from another class "methods"
		int a = 2;
		int b = 3;
		int sum = methods.sum(a,b);
		System.out.printf(" sum of " + a + " and " + b + " = " + sum);
	}

}

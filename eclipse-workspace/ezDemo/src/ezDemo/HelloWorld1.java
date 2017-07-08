package ezDemo;

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
		myArray2[0][0] = 1;
		
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
			System.out.printf(" " + myArray2[j][k]); //print array elements
			}
			System.out.printf("\n");
		}
		
		
		
	}

}

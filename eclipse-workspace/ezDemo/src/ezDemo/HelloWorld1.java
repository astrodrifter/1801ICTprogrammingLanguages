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
		
	}

}

import java.util.Random;

public class Scoring {
	public static void main(String[] args) {
		int myArray[] = new int[5];
		fillArray(myArray);
		
		for (int j = 0; j < 5; j++) {
			System.out.printf(" "+myArray[j]);
		}
		
		
	}
	static void fillArray(int[] arr) {
		//fill array with random number between -10 and 10
		int max = 10;
		int min = 0;
		Random rn = new Random();
		int n = max - min + 1;
		for (int j = 0; j < 5; j++) {
			int num = rn.nextInt() % n;
			arr[j] = num;
		}
	}
}

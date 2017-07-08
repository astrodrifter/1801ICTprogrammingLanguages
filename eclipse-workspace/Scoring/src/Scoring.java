import java.util.Random;

public class Scoring {
	public static void main(String[] args) {
		
		//1D array declare, initialize, send to method to fill
		int myArray1[] = new int[5];
		printArray1(myArray1); //initial print
		fillArray1(myArray1); //fill array with random values between 0 and 10
		printArray1(myArray1); //print again
		
		//2D array declare, initialize, send to method to fill
		int contestants = 5;
		int judges = 7;
		int myArray2[][] = new int[contestants][judges];
		fillArray2(myArray2,contestants, judges); //fill array with random values between 0 and 10
		printArray2(myArray2,contestants, judges); //print again
		
		
		
	}
	/* fill 1D array with random numbers between 0 and 10 */
	static void fillArray1(int[] arr) { 
		int max = 10;
		int min = 0;
		Random rn = new Random();
		int n = max - min + 1;
		for (int j = 0; j < 5; j++) {
			int num = rn.nextInt() % n;
			arr[j] = Math.abs(num);
		}
	}
	/* prints 1D array  */
	static void printArray1(int[] arr) {
		for (int j = 0; j < 5; j++) {
			System.out.printf(" "+arr[j]);
		}
		System.out.printf("\n");
	}
	/* fill 2D array with random numbers between 0 and 10 */
	static void fillArray2(int[][] arr, int rows, int cols) {
		int max = 10;
		int min = 0;
		Random rn = new Random();
		int n = max - min + 1;
		for (int j = 0; j < rows; j++) {
			for(int k = 0; k < cols; k++) {
				int num = rn.nextInt() % n;
				arr[j][k] = Math.abs(num);
			}
		}
	}
	/* prints 2D array  */
	static void printArray2(int[][] arr, int rows, int cols) {
		for (int j = 0; j < rows; j++) {
			for(int k = 0; k < cols; k++) {
				System.out.printf(" "+arr[j][k]);
			}
			System.out.printf("\n");
		}
		
	}
}

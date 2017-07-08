/*
 * File name: Scoring
 * Purpose: Calculate winner of Olympic diving.
 * By Dhruva O'Shea 08/07/2017
 *
 * Program will randomly generate judges scores then calculate the winner
 * 
 */

import java.util.Random;

public class Scoring {
	public static void main(String[] args) {
		
		/* 2D array declare, initialize, send to method to fill */
		int contestants = 5;
		int judges = 7;
		int myArray2[][] = new int[contestants][judges];
		fillArray2(myArray2,contestants, judges); //fill array with random values between 0 and 20
		printArray2(myArray2,contestants, judges); //print again
		
		/* store contestant scores in new 1D array */ 
		int scores[] = new int[contestants];
		rowAve(myArray2, scores, contestants, judges);
		findWinner(scores, contestants);
		
	}
	/* prints 1D array  */
	static void printArray1(int[] arr) {
		for (int j = 0; j < 5; j++) {
			System.out.printf(" "+arr[j]);
		}
		System.out.printf("\n");
	}
	/* sum values in array row */
	static int sumRow1(int[] arr) {
		int sum = 0;
		for (int j = 0; j < 5; j++) {
			sum += arr[j];
		}
		return sum;
	}
	/* fill 2D array with random numbers between 0 and 20 */
	static void fillArray2(int[][] arr, int rows, int cols) {
		int max = 20;
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
	/* Find Row Averages */
	static void rowAve(int[][] arr, int[] scores, int rows, int cols) {
		int sum;
		for (int j = 0; j < rows; j++) {
			sum = 0;
			for(int k = 0; k < cols; k++) {
				sum += arr[j][k];
			}
			scores[j] = sum/cols;
			System.out.printf("Contestant " +(j+1)+ " scored " +scores[j]+ "\n");
		}
		
	}
	/* find the winner by finding max score in scores array */
	static void findWinner(int[] arr, int rows) {
		int max = arr[0];
		int winner = 1;
		/* find max and winner */
		for(int i = 0; i < rows; i++) {
			if(arr[i] > max) {
				max = arr[i];
				winner = i;
			}
		}
		/* check is equal winners */
		int count = 0; // count winners
		for(int i = 0; i < rows; i++) {
			if(arr[i] == max) {
				count++;
				
			}
		}
		
		if(count > 2) {
			int winners[] = new int[rows];
			for(int i = 0; i < rows; i++) {
				if(arr[i] == max) {
					winners[i] = i;
				
				}
			}
			System.out.printf("Players ");
			for(int j = 0; j < rows; j++) {
				if(winners[j] != 0) {
					System.out.printf(j+" ");
				}
			}
			System.out.printf(" are equal winners with a score of "+max);
		} else {
			System.out.printf("The winner was contestant "+winner+" with "+max+" points.\n");
		}
	
		
	}
	
}

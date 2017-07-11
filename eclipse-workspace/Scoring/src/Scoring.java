/*
 * File name: Scoring
 * Purpose: Calculate winner of Olympic diving.
 * By Dhruva O'Shea 08/07/2017
 *
 * Program will randomly generate number of contestants and judges, 
 * randomly generate scores and then calculate the winner.
 * 
 */

import java.util.Random;

public class Scoring {
	public static void main(String[] args) {
		
		/* 2D array declare, initialize, send to method to fill */
		int contestants;
		int judges;
		contestants = getNum();
		judges = getNum();
		
		int myArray2[][] = new int[contestants][judges];
		fillArray2(myArray2,contestants, judges); //fill array with random values between 0 and 20
		printArray2(myArray2,contestants, judges); //print again
		
		/* store contestant scores in new 1D array */ 
		int scores[] = new int[contestants];
		rowAve(myArray2, scores, contestants, judges);
		findWinner(scores, contestants);
		
	}
	/* generate random number of contestants and judges */
	static int getNum() {
		int num;
		int max = 10;
		int min = 2;
		Random rn = new Random();
		int n = max - min + 1;
		int rnNum = rn.nextInt() % n;
		num = Math.abs(rnNum);
		if(num > 2) {
			num++;
		}
		return num;
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
		System.out.printf("SCORES\n");
		for (int j = 0; j < rows; j++) {
			System.out.printf("Contestant "+(j+1)+": ");
			for(int k = 0; k < cols; k++) {
				System.out.printf(" "+arr[j][k]);
			}
			System.out.printf("\n");
		}
		
	}
	/* Find Row Averages */
	static void rowAve(int[][] arr, int[] scores, int rows, int cols) {
		int sum;
		System.out.printf("TOTALS\n");
		for (int j = 0; j < rows; j++) {
			sum = 0;
			for(int k = 0; k < cols; k++) {
				sum += arr[j][k];
			}
			scores[j] = sum/cols;
			System.out.printf("Contestant " +(j+1)+ ": scored " +scores[j]+ "\n");
		}
		
	}
	/* find the winner by finding max score in scores array */
	static void findWinner(int[] arr, int rows) {
		System.out.printf("RESULT\n");
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
		
		if(count > 1) {
			int winners[] = new int[rows];
			for(int i = 0; i < rows; i++) {
				if(arr[i] == max) {
					winners[i] = 1;
				
				}
			}
			System.out.printf("Contestants ");
			for(int j = 0; j < rows; j++) {
				if(winners[j] != 0) {
					System.out.printf((j+1)+", ");
				}
			}
			System.out.printf(" are equal winners with a score of "+max);
		} else {
			System.out.printf("The winner was contestant "+(winner+1)+" with "+max+" points.\n");
		}
	
		
	}
	
}

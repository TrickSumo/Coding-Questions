/*
 * Aim: To find saddle points in a 5*5 matrix

 * 
 * According to the question, element A(i,j) is a saddle point if it meets two criteria:-
 * 
 *1. Its greatest or equal to greatest in that particular row ( i-th row)
 *2. Its smallest or equal to smallest in that particular column (j-th column)
 *
 *Input1:-
 *
 *0  1  1  1  2
 *8  9  1  12 3
 *10 11 12 13 4
 *22 23 24 25 5
 *26 27 28 29 10
 *
 * Output1:-
 * 1,5 (0th row and 4th column as per index of element)
 * 
 * Input2:- 
 * 
 * 0  1  1  3  3
 * 8  9  11 12 3
 * 10 11 12 12 4
 * 1  2  0  3  3
 * 26 27 28 29 10
 * 
 * Outpu2:-
 * 1,4 
 * 1,5 
 * 4,4 
 * 4,5 
 * 
 * Logic:-
 * 
 * Navigate through each element of 2D array. 
 * For each element, check:-
 *  if its greatest (or equal) in that row. 
 *  if its smallest (or equal) in that column.  
 */



import java.util.*;

public class SaddlePoint {

	public static void main(String[] args) {

		// Get 5x5 matrix as input
		
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		
		int arr[][] = new int[5][5];
		
		System.out.println("Enter 5x5 matrix:-");
		
		for (int i = 0; i<n; i++) {
			
			for (int j=0; j<n; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		

		Boolean flagNotFound = true;  // initially suppose there is no saddle point in the give 2D array
		
		for (int i = 0; i<n; i++) {
						
			for (int j=0; j<n; j++) {
				
				Boolean isGreatestInRow = true, isGreatestInCol = true;
				
				isGreatestInRow = isGreatestInRow(arr, i, j, n);
				isGreatestInCol = isGreatestInCol(arr, i, j, n);
				
				if (isGreatestInRow  && isGreatestInCol) {
					
					System.out.printf("%d,%d %n",i+1,j+1); 
					flagNotFound = false; // found saddle point hence update flagNotFound to false
				}
				
			}
			
		}
				
		if(flagNotFound) {System.out.println("Saddle point not found");}
		return;

	}
	
	// Navigate all elements of i-th row and compare with Arr(i,j) 
	public static Boolean isGreatestInRow(int arr[][], int i, int j, int n) {
		
		for(int k=0; k<n; k++) {
			
			if (arr[i][j] < arr[i][k]) return false;
		}
		
		return true;
	}
	
	// Navigate all elements of j-th column and compare with Arr(i,j) 
	public static Boolean isGreatestInCol(int arr[][], int i, int j, int n) {
		
		for(int k=0; k<n; k++) {
			
			if (arr[i][j] > arr[k][j]) return false;
		}		
		
		return true;
	}

}

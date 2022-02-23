/*

Enter symbol
*
Enter size of hills:
7
Enter numbers of hills:
3
Enter hill no to conquer and make castle
2
Enter height of the castle
4
      **            **            **      
     ****          ****          ****     
    ******        ******        ******    
   ********      ********      ********   
  **********    **********    **********  
 ************  ************  ************ 
******************************************
                    **
                   ****
                  ******
                  ******


*/


import java.util.Scanner;

public class HillsAndTheCastle {

	public static void main(String[] args) {
		int n , p, m, num;
		
		char a = '*';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter symbol");
		a = sc.next().charAt(0);
		
		System.out.println("Enter size of hills:");
		n = sc.nextInt();
		
		System.out.println("Enter numbers of hills:");
		num = sc.nextInt();
		
		System.out.println("Enter hill no to conquer and make castle");
		p = sc.nextInt();
		p-=1;
		
		System.out.println("Enter height of the castle");
		m = sc.nextInt();
		
		
	// Loop to handle hills	
		
		
     for (int i =0; i<n; i++) {
    	 
    	 for (int loop =0; loop<num; loop++){
    		 
    		 for  (int j=0; j<n-i-1; j++) {
        		 
        		 System.out.print(" ");
        	 }
        	 
        	 for  (int j=0; j<2*i +2; j++) {
        		 
        		 System.out.print(a);
        	 }
        	 
        	 for  (int j=0; j<n-i-1; j++) {
        		 
        		 System.out.print(" ");
        	 }
    	 }
    	 
    	System.out.println(""); 
     }
     
     // Loops to handle castle

     for(int i = 0; i< m/2; i++) {
    	 
    	 for (int j = 0; j < 2*n*p; j++) {
    		 
    		 System.out.print(" ");
    	 }
    	 
		 for  (int j=0; j<n-i-1; j++) {
    		 
    		 System.out.print(" ");
    	 }
    	 
    	 for  (int j=0; j<2*i +2; j++) {
    		 
    		 System.out.print(a);
    	 }
    	 
    	 System.out.println("");
     }
     
     for(int i = 0; i< m - m/2; i++) {
    	 
    	 for (int j = 0; j < 2*n*p; j++) {
    		 
    		 System.out.print(" ");
    	 }
    	 
    	 for (int j = 0; j < n -1  - (m/2) ; j++) {
    		 
    		 System.out.print(" ");
    	 }
    	 
    	 for (int j = 0; j < (m/2) * 2 +2; j++) {
    		 
    		 System.out.print(a);
    	 }
    	 
    	 System.out.println("");
     }
     
	}
}

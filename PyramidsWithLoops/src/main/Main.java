/* 
 * Claire Lynch
 * lynchcc@ucmail.uc.edu
 * Assignment 04
 * Due Date: 9/26/19
 * Course: IS4010
 * Sources: https://www.programiz.com/java-programming/examples/pyramid-pattern
 * Description: Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		
		int lines = 5;
		for (int i = 1; i <= lines; i++) { // Gives our starting number as 1, not zero
			for (int j = 0; j < lines - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i + i - 1; k++) { // Gets the correct increase of numbers.. + 2 for each line
				System.out.print(i + ""); // Prints the correct pyramid shape
			}
			System.out.println(); 
			
	        }
		}
	}


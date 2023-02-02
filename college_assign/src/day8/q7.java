package day8;


import java.util.Scanner;

/*
 * 7. The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with
 * his generals. Each letter is replaced by another letter N position down the English alphabet. For
 * example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the 
 * alphabet rotates and it is transformed into a 'd'.Write a methods that return a lambda expression 
 * implement a Decoder for the Ceasar cipher where N = 5.
 */

interface Dcoder {
	String decode(char text[], int key);
}

public class q7 {
	public static void main(String[] args) {
		System.out.print("Enter Ciphered Text: ");
		char text[] = new Scanner(System.in).next().toLowerCase().toCharArray();

		Dcoder Ceasar = (cipher, n) -> {
			for (int i = 0; i < text.length; i++) {
				text[i] -= n;
				if (text[i] < 97) // cyclic rotation
					text[i] += 26;
			}
			return new String(cipher);
		}; // dechiper

		System.out.println(Ceasar.decode(text, 5));

	}
}
 
/* output - 
Enter Ciphered Text: HEllow World
czggjr
*/
package day2;
import java.util.*;

/*8. An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting
is done by marking the candidate number on the ballot paper. Write a program to read the
ballots and count the votes casts for each candidate using an array variable count. In case,
a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’
and the program should also count the number of spoilt ballot.
*/

public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Declaring an array to store all the votes
		int arr[] = new int[6];
		int vote;
		char c;
		for(int i=0;i<6;i++) {
			arr[i] = 0;
		}
		while(true) {
			System.out.println("Enter your vote 1-5");
			vote=sc.nextInt();
			// Creating a menu using switch case to get votes as
			// input for the respective candidate
			switch(vote) {
			case 1:
				arr[1]++;
				break;
			case 2:
				arr[2]++;
				break;
			case 3:
				arr[3]++;
				break;
			case 4:
				arr[4]++;
				break;
			case 5:
				arr[5]++;
				break;
			default:
				// If someone's vote is not within 1 to 5
				arr[0]++;
			}
			System.out.println("Do you want to continue voting?");
			System.out.println("Press y if the next voter wants to vote or else press n to stop:");
			c=sc.next().charAt(0);
			if(c=='y') {
				// If the next voter wants to vote
				continue;
			}
			else if (c=='n')
				// If no one is left to vote
				break;
			else
				// If the input is not 'y' or 'n'
				System.out.println("WRONG INPUT!!!");
		}
		for(int i=1;i<6;i++) {
			// Printing the no. of votes per candidates
			System.out.println("No. of votes for candidate "+i+" = "+arr[i]);
		}
			// printing the no of spoilt votes
			System.out.println("Spoilt Votes = "+arr[0]);
	}

}

/* OUTPUT -
Enter your vote 1-5
3
Do you want to continue voting?
Press y if you want to continue else Press n to stop:
y
Enter your vote 1-5
2
Do you want to continue voting?
Press y if you want to continue else Press n to stop:
y
Enter your vote 1-5
4
Do you want to continue voting?
Press y if you want to continue else Press n to stop:
n
No. of votes for candidate 1 = 0
No. of votes for candidate 2 = 1
No. of votes for candidate 3 = 1
No. of votes for candidate 4 = 1
No. of votes for candidate 5 = 0
Spoilt Votes = 0
*/

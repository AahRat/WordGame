package projects;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String args[]) {
		Random random = new Random();
		int randomNum = random.nextInt(100);
		int score = 100;
		
		Scanner userInput = new Scanner(System.in);
		while (score>0) {
			System.out.print("Enter a Number 1-100: ");
			int userNum = userInput.nextInt();
			
			if(userNum > randomNum) {
				System.out.println("Guess Lower");
			}
			else if(userNum<randomNum) {
				System.out.println("Guess Higher");
				
			}
			else {
				System.out.print("You Guessed the Number. "+"Your Final Score is "+score);
				break;
			}
			score-=1;
		}
		
	}

}

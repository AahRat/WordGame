package projects;
import java.util.*;

public class WordGame {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		while (true ) {
			
		
			String randomWord = getWord();
			int numberOfGuesses = 0;
			
			
			while(true) {
				System.out.println();
				System.out.println("Enter Your Guess: ");
				String userGuess = scanner.nextLine();
				userGuess = userGuess.toLowerCase();
				if (userGuess.length()!= randomWord.length()) {
					System.out.println("Enter Valid Length of: "+ randomWord.length());
					continue;
				}
				
				if(userGuess.equals(randomWord)) {
					System.out.println("Correct Guess");
					System.out.println("It Took You: "+numberOfGuesses+" Guesses");
					break;
				}
				else {
					System.out.println("Incorrect Guess");
				}
				showHint(randomWord, userGuess);
				numberOfGuesses+=1;
				
			}
		
			System.out.println("Do You Want to Play Again: Y/N ");
			String playAgain = scanner.nextLine();
			if(playAgain.toUpperCase().equals("Y")) {
				continue ;
			}
			else break;
		}
	}
	
	public static void showHint(String randomWord, String userGuess) {
		for(int i=0; i<randomWord.length(); i++) {
			if(userGuess.charAt(i)==randomWord.charAt(i)) {
				System.out.print(Character.toUpperCase(userGuess.charAt(i)));
			}
			
			else if(randomWord.contains(new String(new char[] {userGuess.charAt(i)}))){
				System.out.print(userGuess.charAt(i));
			}
			
			else System.out.print("_");
			
		}
	}
		
	public static String getWord() {
		String[] words = {
				  "upset",
				  "shock",
				  "shelf",
				  "chain",
				  "torch",
				  "white",
				  "yearn",
				  "color",
				  "laser",
				  "floor",
				  "cross",
				  "cheek",
				  "straw",
				  "donor",
				  "brand",
				  "tract",
				  "irony",
				  "quote",
				  "noble",
				  "virus",
				  "album",
				  "guard",
				  "wrong",
				  "table",
				  "great",
				  "guide",
				  "slave",
				  "mercy",
				  "Venus",
				  "piece",
				  "siege",
				  "belly",
				  "match",
				  "angel",
				  "allow",
				  "prove",
				  "salad",
				  "dozen",
				  "wheel",
				  "night",
				  "abbey",
				  "humor",
				  "bride",
				  "feign",
				  "slump",
				  "flour",
				  "wheat",
				  "basic",
				  "radio",
				  "sweep"
				};
		
		Random random = new Random();
		int randIndex = random.nextInt(words.length);
		String randomWord = words[randIndex]; 
		return randomWord;
	}
	
}
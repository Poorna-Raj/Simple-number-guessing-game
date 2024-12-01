import java.util.Scanner;
public class NumberGuess 
{
	public static void main(String[] args) 
	{
		int randomNumber = (int)(Math.random()*10)+0;
		int userNumber;
		int attemptCount=0;
		
		System.out.println("Welcome to the number guessing game!");
		System.out.println("Enter a number between O to 10: ");
		
		Scanner input = new Scanner(System.in);
		userNumber = input.nextInt();
		
		
		while(userNumber != randomNumber)
		{
			attemptCount += 1;
			System.out.println("Take another guess: ");
			userNumber = input.nextInt();
		}

		input.close();
		System.out.println("Congratulations! You guessed the number in "+attemptCount+" attemps.");
	}

}

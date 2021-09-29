import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunnerAF
{
	public static void main(String args[])
	{
		String response;
		//Do while loopd to run the game and will continue to run until the player inputs something else 
		//than Y for their response
		do {
			Scanner userInput = new Scanner(System.in);

			//Do while to make sure that user inputs a valid input
			String choice ="";
			do {
				out.println("\n\nMake Your Selection (R, P, S): ");
				choice = userInput.nextLine();
				if(choice.equals("R") || choice.equals("r")){
					break;
				} else if(choice.equals("P") || choice.equals("p")){
					break;
				} else if(choice.equals("S") || choice.equals("s")){
					break;
				} else{
					out.println("Sorry! Please choose a valid option!");
				}
			} while(true);

			RockPaperScissorsAF game = new RockPaperScissorsAF(choice);
			game.determineWinner();
			out.println(game);

			//Do while to make sure that user inputs a valid input
			do{
				out.println("\nWould You Like to Play Again? (Y) (N): ");
				response = userInput.nextLine();
				if(response.equals("Y") || response.equals("N")){
					break;
				} else if (response.equals("y") || response.equals("n")){
					response = response.toUpperCase();
					break;
				} else {
					out.println("Sorry! Please choose a valid option!");
				}
			} while (true);
		
		} while (response.equals("Y"));
	}
}




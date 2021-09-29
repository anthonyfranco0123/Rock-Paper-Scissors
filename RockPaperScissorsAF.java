import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class RockPaperScissorsAF
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissorsAF()
	{
		playChoice="";
		compChoice="";
	}

	//This method is used to determine the computers choice and change the players input to
	//its unabbreviated form
	public RockPaperScissorsAF(String player)
	{
		playChoice = player;
		int compNumChoice = (int)(Math.random()*((3-1)+1))+1;

		if (compNumChoice == 1)
				compChoice = "Rock";
		if (compNumChoice == 2)
				compChoice = "Paper";
		if (compNumChoice == 3)
				compChoice = "Scissors";

		if (playChoice.equals("R") || playChoice.equals("r")){
			playChoice = "Rock";
		} else if (playChoice.equals("P") || playChoice.equals("p")){
			playChoice = "Paper";
		} else if (playChoice.equals("S") || playChoice.equals("s")){
			playChoice = "Scissors";
		}
	}

	//This method would be used to set the player choice up ONLY
		public void setPlayers(String player)
		{
			playChoice = player;
		}

		//This method is used to determine the winner - R beats S, S beats P, P beats R...
		//The string winner will be used to say who wins in each scenario
		public String determineWinner()
		{
			String winner = "";

				if ((compChoice.equals("Rock") && playChoice.equals("Scissors")) ||(compChoice.equals("Paper") && playChoice.equals("Rock"))||(compChoice.equals("Scissors") && playChoice.equals("Paper")))
					winner = "Computer";

				if ((playChoice.equals("Rock") && compChoice.equals("Scissors")) ||(playChoice.equals("Paper") && compChoice.equals("Rock"))||(playChoice.equals("Scissors") && compChoice.equals("Paper")))
					winner = "Player";

				if (playChoice.equals(compChoice))
					winner = "Nobody";


			return winner;
		}

		//output will be the used to output what the player chose and what the computer randomly selected
		public String toString()
		{
			return "\nPlayer Chose: " + playChoice + "\nComputer Chose: " + compChoice + "\n\nWinner: " + determineWinner();
		}
}
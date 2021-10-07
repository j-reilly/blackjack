import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class BlackJackPlaying
	{
		static Scanner userStringInput = new Scanner(System.in);
		static ArrayList<Card> playerHand = new ArrayList<Card>();
		static ArrayList<Card> dealerHand = new ArrayList<Card>();
		static boolean stillPlaying = true;
		
		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffle();
				Dealer.deal();
				Player.displayPlayerHand();
				Dealer.displayDealerHand();
				while (stillPlaying = true)
					{
				askForPlayerMove();
				Player.checkForPlayerBust();
				Dealer.dealerMove();
				Dealer.checkForDealerBust();
					}
			}
		
		public static void askForPlayerMove()
			{
				System.out.println("Would you like to stand or hit?");
				String playerResponse = userStringInput.nextLine();
				if (playerResponse.equals("hit") || playerResponse.equals("Hit"))
					{
						Player.hit();
					}
				else if (playerResponse.equals("stand") || playerResponse.equals("Stand"))
					{
						Player.stand();
					}
			}
	}
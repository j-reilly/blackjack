
public class Player
	{	
		static int totalPlayerCardValue = 0;
		
		public static void displayPlayerHand()
			{
				for (int i = 0; i < BlackJackPlaying.playerHand.size(); i++)
					{
						System.out.println("The player's hand is " + BlackJackPlaying.playerHand.get(i).getCardRank() + " of " + BlackJackPlaying.playerHand.get(i).getCardSuit());
						totalPlayerCardValue = BlackJackPlaying.playerHand.get(i).getCardValue() + totalPlayerCardValue;
					}
				System.out.println("The value of the players's cards are " + totalPlayerCardValue);
			}
		
		public static void bet()
    		{
    			System.out.println("What would you like to bet?");
    			
    		}
		
		public static void stand()
    		{
    			Dealer.dealerMove();
	    	}
		
		public static void hit()
     		{
     			BlackJackPlaying.playerHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				displayPlayerHand();
	    	}
		
		public static void checkForPlayerBust()
	    	{
	    		if (totalPlayerCardValue > 21)
	    			{
	    				System.out.println("The player busted. The dealer wins.");
	    				BlackJackPlaying.stillPlaying = false;
	    			}
	    	}
	}

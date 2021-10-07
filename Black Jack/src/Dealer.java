
public class Dealer
	{
		static int totalDealerCardValue = 0;
		
		public static void deal()
		   {
			   for (int i = 0; i < 2; i++)
				   {
					   BlackJackPlaying.playerHand.add(Deck.deck.get(0));
					   Deck.deck.remove(0);
					   BlackJackPlaying.dealerHand.add(Deck.deck.get(0));
					   Deck.deck.remove(0);
		    		}
		}
		
		public static void displayDealerHand()
			{
				for (int i = 0; i < BlackJackPlaying.dealerHand.size(); i++)
					{
						System.out.println("The dealer's hand is " + BlackJackPlaying.dealerHand.get(i).getCardRank() + " of " + BlackJackPlaying.dealerHand.get(i).getCardSuit());
						totalDealerCardValue = BlackJackPlaying.dealerHand.get(i).getCardValue() + totalDealerCardValue;
						
					}
				System.out.println("The value of the dealer's cards are " + totalDealerCardValue);
			}
		
		public static void dealerMove()
	    	{
	    		if (Dealer.totalDealerCardValue <= 16)
	    			{
	    				Dealer.hit();
	    			}
	    		else if (Dealer.totalDealerCardValue <= 17)
	    			{
	    				Dealer.stand();
	    			}
	    	}
		
		public static void hit()
    		{
     			BlackJackPlaying.playerHand.add(Deck.deck.get(0));
				Deck.deck.remove(0);
				displayDealerHand();
    		}
		
		public static void stand()
    		{
    			BlackJackPlaying.askForPlayerMove();
    			displayDealerHand();
    		}
		
		public static void checkForDealerBust()
    		{
	    		if (totalDealerCardValue > 21)
	    			{
	    				System.out.println("The dealer busted. The player wins.");
	    				BlackJackPlaying.stillPlaying = false;
	    			}
        	}
	}
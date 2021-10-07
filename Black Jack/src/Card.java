
public class Card
	{
		private String cardRank;
		private String cardSuit;
		private int cardValue;
		
		public Card (String cR, String cS, int cV)
		{
			cardRank = cR;
			cardSuit = cS;
			cardValue = cV;
		}

		public String getCardRank()
			{
				return cardRank;
			}

		public void setCardRank(String cardRank)
			{
				this.cardRank = cardRank;
			}
		
		public String getCardSuit()
			{
				return cardSuit;
			}

		public void setCardSuit(String cardSuit)
			{
				this.cardSuit = cardSuit;
			}

		public int getCardValue()
			{
				return cardValue;
			}

		public void setCardValue(int cardValue)
			{
				this.cardValue = cardValue;
			}	
	}


public class Card
	{
		private Suit suit;
		private Rank rank;
		public boolean isFaceUp;
		
		public Card(Rank rank, Suit suit)
		{
			this.rank = rank;
			this.suit = suit;
			isFaceUp = true;
		}
		
		public String getSuit()
		{
			return suit.printSuit();
		}
		
		public int getRank()
		{
			return rank.getRank();
		}
		public String printRank() 
		{
			return rank.printRank();
		}
		public void flipCard()
		{
			isFaceUp = !isFaceUp;
		}
		
		public String toString() 
		{
			String str = "";
			if (isFaceUp)
				{
					str += rank.printRank() + " of " + suit.printSuit();
					return str;
				}
			else
				{
					str = "Card is facing down";
				}
			return str;
		}

	}

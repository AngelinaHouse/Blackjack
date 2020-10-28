import java.util.ArrayList;
public class Hand
	{
		public ArrayList<Card> cards;
		
		public Hand()
		{
			cards = new ArrayList<Card>();
		}
		
		public void clear()
		{
			cards.clear();
		}
		public void add(Card card)
		{
			cards.add(card);
		}
		public String showHand()
		{
			boolean allFaceUp = true;
			String str = "";
			for (Card c: cards)
				{
					str += c.toString() + "\n";
					if (!c.isFaceUp)
						{
							allFaceUp = false;
						}
				}
			if (allFaceUp)
				{
					str += "Total points: " + getTotal() + "\n";
				}
			return str;
		}
		public void flipCard()
		{
			for (Card c: cards)
				{
					c.flipCard();
				}
		}
		public boolean give(Card card, Hand otherHand)
		{
			if (!cards.contains(card))
				{
					return false;
				}
			else
				{
					cards.remove(card);
					otherHand.add(card);
					return true;
				}
		}
		public int getTotal()
		{
			int totalPts = 0;
			boolean hasAce = false;
			for (int i = 0; i < cards.size(); i++)
				{
					totalPts += cards.get(i).getRank();
					if (cards.get(i).printRank() == "Ace")
						{
							hasAce = true;
						}
					if (hasAce && totalPts <= 11)
						{
							totalPts += 10;
						}
				}
			return totalPts;
		}
		public String toString() 
			{
				String str = "";
				for (Card card: cards)
					{
						str += card.toString() + "\n";
						
					}
				return str;
			}
	}


public class Game
	{

		public static void main(String[] args)
		{				
				Deck d1 = new Deck();
				d1.populate();
				d1.shuffle();
				
				Hand h1, h2, h3, dealer;
				h1 = new Hand();
				h2 = new Hand();
				h3 = new Hand();
				dealer = new Hand();
				Hand[] hands = {h1, h2, h3};
				
				d1.deal(hands, 2);
				d1.deal(dealer, 2);
				
				for (int i = 0; i < hands.length; i++)
					{
						//hands[i].flipCard();
						System.out.println(hands[i].showHand());
					}
				
				dealer.cards.get(0);
				System.out.println("Dealers cards: " + dealer.showHand());
				
			
			}

	}

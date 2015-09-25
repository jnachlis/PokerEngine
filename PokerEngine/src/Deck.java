import java.util.ArrayList;
import java.util.Collections;

public class Deck {
// Each deck (you could have multiple decks, depending on the game) is an array of cards.
// When you instantiate a deck, you should build the array list of cards.  
// You should also “shuffle” the deck (make the order of cards random).
// A method is needed that  will be to “draw” from the deck 
// (return next card… assuming deck is shuffled).
// Build a method to denote how many cards are remaining to be drawn.

	protected ArrayList<Card> deck;
	
	public Deck(){
		
		for(int x = 1; x < 5; x++){
			eSuit s = eSuit.values()[x];
			for(int y = 1; y < 14; y++){
				eRank r = eRank.values()[y];
				Card c = new Card(r,s);
				deck.add(c);
			}
		}
		Collections.shuffle(deck);
	}
	
	public Card Draw(){
		Card CardOne = deck.get(0);
		deck.remove(0);
		return CardOne;
	}
	
	public int CardCount(){
		return deck.size();
		}
	
}

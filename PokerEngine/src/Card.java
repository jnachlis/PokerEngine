
public class Card {
// Each card has a numeric rank (A, 2, 3, 4.. 10, J, Q, K, A)
// Each card has a suit (heart, spade, club diamond)
// Attributes should be private, without public setter / getters

	//private SuitEnum card;
    //private RankEnum suit;
    
    private eRank rank;
    
    private eSuit suit;
    
    public Card(eRank RankEnum, eSuit SuitEnum) {
        this.rank = RankEnum;
        this.suit = SuitEnum;
    } 
    
	public eRank getRank() {
		return rank;
	}

	public void setRank(eRank rank) {
		this.rank = rank;
	}

	public eSuit getSuit() {
		return suit;
	}

	public void setSuit(eSuit suit) {
		this.suit = suit;
	}
}
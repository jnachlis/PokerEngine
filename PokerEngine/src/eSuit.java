
public enum eSuit {
	Club(1), Diamond(2), Spade(3), Heart(4);
	
	private eSuit(final int suit){
		this.suit = suit;
	}
	
	private int suit;
	
	
	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	
}

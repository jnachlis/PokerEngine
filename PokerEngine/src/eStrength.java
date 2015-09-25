
public enum eStrength {

	FiveOfAKind(110){
		public String toString()
		{
			return "Five of a kind";
		}
	},
	
	RoyalFlush(100){
		public String toString()
		{
			return "Royal Flush";
		}
	},
	
	StraightFlush(90){
		public String toString()
		{
			return "Straight flush";
		}
	},
	
	FourOfAKind(80){
		public String toString()
		{
			return "Four of a kind";
		}
	},
	
	FullHouse(70){
		public String toString()
		{
			return "FullHouse";
		}
	},
	
	Flush(60){
		public String toString()
		{
			return "Flush";
		}
	},
	
	Straight(50){
		public String toString()
		{
			return "Straight";
		}
	},
	
	ThreeOFAKind(40){
		public String toString()
		{
			return "Three of a kind";
		}
	},

	TwoPair(20){
		public String toString()
		{
			return "Two pair";
		}
	},
	
	OnePair(10){
		public String toString()
		{
			return "One pair";
		}
	},
	
	HighCard(0){
		public String toString()
		{
			return "High card";
		}
	},

}

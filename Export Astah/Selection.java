public class Selection extends Position {
	
	private List<Card> deck;
	
	public void Selection(List<Card> deck){
		this.deck = deck;
	}
	
	public Sacrifice sacrifice(Card card) {
		Sacrifice sac = new Sacrifice(card); //create MoveCard
		sac.move(); //wenn es so implementiert wird, muss die Position gar nichts von anderen Positions wissen
		return sac;
	}

	public Discard discard(Card card, Player player) {
		Discard dis = new Discard(card, player); // Constructor ist wie rum?
		dis.move();
		return dis;
	}

	public Unselect unselect(Card card, Player player) {
		Unselect unsec = new Unselect(card, player);
		unsec.move();
		return unsec;
	}

}

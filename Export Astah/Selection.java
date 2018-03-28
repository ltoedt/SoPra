public class Selection extends Position {
	
	private Game game; //vielleicht braucht es nach der Initalisierung Game gar nicht mehr
	
	private List<Card> deck;
	
	private Graveyard graveyard;
	
	private Market market;
	
	private Stock stock;
	
	public void Selection(Game game, List<Card> deck){
		this.deck = deck;
		this.graveyard = game.graveyard;
		this.market = game.market;
		this.stock = game.stock;
		this.game = game;
	}
	
	// Sacrifice als Eiznige Position kein player als input
	
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

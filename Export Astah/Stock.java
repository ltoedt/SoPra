public class Stock extends Position {

	private int closed_stock_penalty;

	private List<Card> deck; // better representation of 12 positions?

	private Selection selection;

	private Market market;
	
	public void Stock(Game game, List<Card> deck){
		this.selection = game.selection;
		this.market = game.market;
		this.deck = deck;
	}

	public void push() {
		// first better implementation of the positions
	}

	public BuyStock buy(Card card, Player player) {
		BuyStock buys = new BuyStock(card, player);
		buys.move();
		return buys;
	}

}

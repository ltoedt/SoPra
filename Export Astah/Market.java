public class Market extends Position {

	private List<Card> deck; //better representation for positions

	private Selection selection;

	private Stock stock;

	public void Market(Game game, List<Card> deck)
		this.deck = deck;
		this.selection = game.selection;
		this.stock = game.stock;
	
	public Buy buy(Card card, Player player) {
		Buy buy = new Buy(card, player);
		buy.move();
		return buy;
	}

	public boolean has_empty_spot() {
		return false;
	}

}

import java.util

public class Stock extends Position {

	private int closed_stock_penalty;

	private ArrayList<Card> deck; // better representation of 12 positions?

	private Market market;
	
	public void Stock(Game game, List<Card> deck){
		this.market = game.market;
		this.deck = deck;
	}

	public void push() { // better representation for 12 position wanted
		for(int i = 0; i < this.deck.size(); i++){
			Card tmp = this.deck.get(i);
			this.market.add_card(tmp);
			this.deck.remove(tmp);
		}
	}

	public BuyStock buy(Card card, Player player) {
		BuyStock buys = new BuyStock(card, player);
		buys.move();
		return buys;
	}

}

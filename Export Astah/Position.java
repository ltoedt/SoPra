public abstract class Position {

	public List<Card> deck;

	public void add_card(Card card) {
		this.deck.add(card);
	}

	public void remove_card(Card card) {
		this.deck.remove(card);
	}

}

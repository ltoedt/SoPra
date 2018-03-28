public class Hand extends Position {

	private List<Card> deck;

	public void Hand(List<Card> deck){
		this.deck = deck;
	}

	public Select select(Player player, Card card) {
		Select sel = new Select(player, card);
		sel.move();
		return sel;
	}

}

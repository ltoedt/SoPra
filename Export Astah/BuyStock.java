public class BuyStock implements Move, MoveChildren{

	private Player player;

	private Card card;

	private Position position_init;

	private Position position_final;

	private List<MoveCard> children;

	public void BuyStock(Card card){
		this.card = card;
		this.position_init = this.player.game.stock;
		this.position_final = this.player.discardPile;
	}

	public void move(){
		this.position_init.remove_card(this.card);
		this.position_final.add_card(this.card);

		for(int i = 0; i < this.children.size(); i++){
			MoveCard tmp = this.children.get(i);
			tmp.move();
		}
	}

	public void unmove() {
		this.position_final.remove_card(this.card);
		this.position_init.add_card(this.card);

		for (int i = 0; i < this.children.size(); i++) {
			MoveCard tmp = this.children.get(i);
			tmp.unmove();
		}
	}

	public void add_child(MoveCard move){
		this.children.add(move);
	}

	public void remove_child(MoveCard move){
		this.children.remove(move)
	}
}

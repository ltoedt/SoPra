public abstract class MoveCard implements Move {

	private Player player;

	private Card card;

	private Position position_init;

	private Position position_final;

	@Override
	public void move(){
		position_init.remove_card(this.card);
		position_final.add_card(this.card);
	}

	@Override
	public void unmove(){
		position_final.remove_card(this.card);
		position_init.add_card(this.card);
	}

}

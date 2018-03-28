public abstract class ActionCard extends Card {

	private Ability ability;

	public void activate() {
		this.ability.trigger();
	}

}

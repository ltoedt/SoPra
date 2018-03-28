public class Select extends MoveCard{

    private Card card;

    private Position position_init;

    private Position position_final;

    public void Select(Player player, Card card){
        this.card = card;
        this.position_init = player.hand;
        this.position_final = player.game.selection;
    }

}

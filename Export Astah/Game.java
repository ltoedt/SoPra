import java.util;

public class Game {

	private Player current_player;

	//private int gameIndex;

	private List<Player> playerList;

	private Selection selection;

	private Graveyard graveyard;

	private Market market;

	private Stock stock;

	private Board board;

	private GameHistory gameHistory;

	private PlayerHistory playerHistory;

	public void add_player(Player player){
	    if(!this.playerList.contains(player)){
	        this.playerList.add(player);
        }
    }

    public void Game(){
	    this.current_player = NULL;
	    //this.gameIndex = ;

    }

	public void start() {

	}

	public void end() {

	}

	public void assign_turn() {

	}

	public Player determine_winner() {
		return null;
	}

	public static void main(String args[]){
		return;
	}

}

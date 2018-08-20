import java.util.*;

public class PlayerManager {
	
	private static ArrayList<NFLPlayers> playerList = null;
	
	//Constructor.
	public PlayerManager() {
		//Method for array list of players. 
		playerList = new ArrayList<>();
		createPlayers();
	}
	
	//Method to create 6 new players from NFLPLayers class.
	public static void createPlayers() {
		
		NFLPlayers player1 = new NFLPlayers();
		player1.setPlayerName("Tom Brady");
		player1.setTDs(33);
		player1.setINTs(8);
		NFLPlayers player2 = new NFLPlayers();
		player2.setPlayerName("Cam Newton");
		player2.setTDs(22);
		NFLPlayers player3 = new NFLPlayers();
		player3.setPlayerName("Carson Wentz");
		player3.setTDs(33);
		NFLPlayers player4 = new NFLPlayers();
		player4.setPlayerName("Eli Manning");
		player4.setTDs(19);
		NFLPlayers player5 = new NFLPlayers();
		player5.setPlayerName("Kirk Cousins");
		player5.setTDs(27);
		NFLPlayers player6 = new NFLPlayers();
		player6.setPlayerName("Alex Smith");
		player6.setTDs(26);
		
		//insert add methods
		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);
		playerList.add(player6);
		
			
		}
	//Driver method to display 6 players to the console.
	public void driver() {
		System.out.println("Here are the 6 players: " );
		System.out.println(toString());
	}
	public String toString() {

		return "NFLPlayerManager list=" + playerList;

	}

		
	public static void main(String []args) {
	 //Object of this class.
		PlayerManager test = new PlayerManager();
	
	 //Test driver method.
		test.driver();
		
		
	
	}
	
}

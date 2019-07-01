public class Player {
    private String playerName;

    private int playerScore;

	public Player(String name, int score) {
		// TODO Auto-generated constructor stub
		this.playerName = name;
		
		this.playerScore =score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
}
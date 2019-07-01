import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Match {

    public List<Player> playerList = new ArrayList<Player>();
    
    public void ViewAllPlayers() {
    	
    	for(Player player : playerList) {
    		
    		System.out.println("Name: " + player.getPlayerName() + " " + "Score: " + player.getPlayerScore());
    	}
    }

    public static void main(String[] args) {
System.out.println("enter users");
        Scanner br = new Scanner(System.in);
  
        Match match = new Match();
        
        int numberOfPlayers = br.nextInt();
        
        br.nextLine();
        
        numberOfPlayers = numberOfPlayers * 2;
        
		while((numberOfPlayers * 2)!= 0) {
		    String nextLine = br.nextLine();
		    
		    String name;
		    int score;
	        String InputValue = nextLine;
	        String[] Value = InputValue.split(" ");
	        
			name = Value[0];
	        
			score = Integer.parseInt(Value[1]);
			
			Player player = new Player(name, score);
			
			match.playerList.add(player);
			
			numberOfPlayers --;
		}
		
		  match.ViewAllPlayers();
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MatchMaker {

    public List<Player> playerList = new ArrayList<Player>();
    
    public void ViewAllPlayers() {
    	
    	for(Player player : playerList) {
    		
    		System.out.println("Name: " + player.playerName + " " + "Score: " + player.playerScore);
    	}
    }
    
    public void getUniqueSingleMatches(List<Player> players) {
    	
    	int minDiff = players.get(0).playerScore - players.get(1).playerScore;
    	
    	List<Match> matches = new ArrayList<Match>();
    	
    	for(int i=0; i < players.size(); i++) {
    		for(int j=0; j< players.size(); j++ ) {
    			
    			if((i != j)) {
    				
    				int diff = players.get(i).playerScore - players.get(j).playerScore;
    				
    				Match match = new Match();
    				
    				match.playerOne = players.get(i);
    				match.playerTwo = players.get(j);
    				match.scoreDifference = diff;
    				
    				matches.add(match);
    			}
    		}
    	}
    	
    	Collections.sort(matches, new DifferenceComparator());
    	
    	matches.sort(null);
    	
    	
    	System.out.println(matches);
    }

    public static void main(String[] args) {

        Scanner br = new Scanner(System.in);
  
        MatchMaker matchMaker = new MatchMaker();
        
        int numberOfPlayers = br.nextInt();
        
        br.nextLine();
        
        numberOfPlayers = numberOfPlayers * 2;
        
		while((numberOfPlayers)!= 0) {
		    String nextLine = br.nextLine();
		    
		    String name;
		    int score;
	        String InputValue = nextLine;
	        String[] Value = InputValue.split(" ");
	        
			name = Value[0];
	        
			score = Integer.parseInt(Value[1]);
			
			Player player = new Player(name, score);
			
			matchMaker.playerList.add(player);
			
			numberOfPlayers --;
		}
		
		matchMaker.getUniqueSingleMatches(matchMaker.playerList);
		
		 // match.ViewAllPlayers();
    }
}
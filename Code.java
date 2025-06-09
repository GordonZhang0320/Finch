public class Move{
	public static void main(String[] args) {
		Finch f = new Finch();
		boolean corner=false;
		int playerNum=1;
		int players=4;
	    
		f.stopAll();
		while(true) {
			
			if (players==1) {
				f.print(playerNum +"Wins!");
			}
			
		    while(!corner) {
		    	f.setMotors(10, 10);
		    	if (f.getLine("R")<90) {
		    		f.setMotors(0, 0);
		    		corner=true;
		    	}
		    	printPlayer(f, playerNum);
		    }
		    
		    
		    if(f.getButton("B")) {
	    		players--;
	    	}
		    while(corner) {
		    	
		    		
		    	if (f.getButton("A")) {
		    		playerNum++;
		    		f.setTurn("R", 90 ,5);
		    		corner=false;
		    	}
		    	printPlayer(f, playerNum);
		    	
		    }
		    
		    if (playerNum>players) {
		    	playerNum=1;
		    }
		    
		}
	    
	       
	}
	
	public static void printPlayer(Finch f, int playerTurns) {
    	if (playerTurns%4==1) {
        	f.print("1");
		    f.playNote(50,2);
        } else if (playerTurns%4==2) {
        	f.print("2");
		    f.playNote(60,2);
        } else if (playerTurns%4==3) {
        	f.print("3");
		    f.playNote(70,2);
        } else {
        	f.print("4");
		    f.playNote(80,2);
        }
    }
}

public class Move{
	public static void main(String[] args) {
		Finch f = new Finch();
		boolean corner=false;
		int playerNum=1;
	    
		f.stopAll();
		while(true) {
			
		    while(!corner) {
		    	f.setMotors(10, 10);
		    	if (f.getLine("R")<90) {
		    		f.setMotors(0, 0);
		    		corner=true;
		    	}
		    }
		    
		    f.playNote(50,2);
		    f.setBeak(playerNum, playerNum, playerNum);
		    
		    while(corner) {
		    	if (f.getButton("A")) {
		    		playerNum++;
		    		f.setMotors(90,0);
		    		corner=false;
		    	}
		    }
		    
		    if (playerNum>4) {
		    	playerNum=1;
		    }
		    
		}
	    
	       
	}
}

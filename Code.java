public class FinchTest {
   public static void main(String[] args) {
       Finch f = new Finch();
       int playerTurns =1;
       boolean corner=false;
      
      printPlayer(f,playerTurns);
      while(!corner) {
   	   f.setMove("F", 1, 1);
   	   if (f.getButton("A")){
   		   corner=true;
   	   }
      }
     
      
      
      
     
      
      
   }
  
   public static void printPlayer(Finch f, int playerTurns) {
   	if (playerTurns%4==1) {
       	f.print("1");
       } else if (playerTurns%4==2) {
       	f.print("2");
       } else if (playerTurns%4==3) {
       	f.print("3");
       } else {
       	f.print("4");
       }
   }
  
  
  
}


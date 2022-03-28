package Game;

public class Game{
     static char [][] board=new char[6][7];
     public static boolean flag=true;
  
     //checking if the player won or not
     public static void winner(int row,int col) {
    	 char k=board[row][col];
    	 int i,j;
    	 for(i=0;i<6;i++) { //checking if the player won horizontally
    		 for(j=0;j<5;j++) {
    			 if((board[row][col]==board[i][j])&&(board[row][col]==board[i][j+1])&&(board[row][col]==board[i][j+2])) {
    				 System.out.println(k+" is a winner");
    				 flag=false;
    			 }
    		 }
    	 }
    	 for(j=0;j<7;j++) { //checking if the player won vertically
    		 for(i=0;i<4;i++) {
    			 if((board[row][col]==board[i][j])&&(board[row][col]==board[i+1][j])&&(board[row][col]==board[i+2][j])) {
    				 System.out.println(k+" is a winner");
    				 flag=false;
    			 }
    		 }
    	 }
    	 for(i=0;i<4;i++) { //checking if the player won diagonally
    		 for(j=0;j<5;j++) {
    			 if((board[row][col]==board[i][j])&&(board[row][col]==board[i+1][j+1])&&(board[row][col]==board[i+2][j+2])) {
    				 System.out.println(k+" is a winner");
    				 flag=false;
    			 }
    		 }
    	 }
    	 for(i=5;i>1;i--) { //checking if the player won diagonally
    		 for(j=0;j<5;j++) {
    			 if((board[row][col]==board[i][j])&&(board[row][col]==board[i-1][j+1])&&(board[row][col]==board[i-2][j+2])) {
    				 System.out.println(k+" is a winner");
    				 flag=false;
    			 }
    		 }
    	 } 	 
     }
     
     //looping the game between player X and player O until one of them win
     public static void loop() {
    	 int i=0;
    	 while(flag==true && i<42) {
    		Player.inputX();
    		if(flag!=false) {
    			Player.inputO();
    		}
    		if(i==41) {
    			System.out.println("The game is draw");
    		}
    		i++;
    	 }
     }   
}





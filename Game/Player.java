package Game;

import java.util.Scanner;

public class Player {
	
	//initializing the array to -
    public static void initialize() {
   	 for(int row=0;row<Game.board.length;row++) { 
   		 for(int col=0;col<Game.board[0].length;col++) 
   			 Game.board[row][col]='-';
   	 }
    }
    
    //getting the number of row and column from the player X and checking the errors
    public static void inputX() {
   	 Scanner s=new Scanner(System.in);
   	 int r,c;
   	 System.out.println("Player 1 (X)");
   	 System.out.println("Enter the number of row from 0 to 5");
   	 r=s.nextInt();
   	 if(r>5) { //checking if the player enters right number of row
   		System.out.println("ERROR! Enter the number of row from 0 to 5");
      	 r=s.nextInt();
   	 }
   	 System.out.println("Enter the number of column from 0 to 6");
   	 c=s.nextInt();
   	if(c>6) { //checking if the player enters right number of column
   		System.out.println("ERROR! Enter the number of row from 0 to 6");
      	 c=s.nextInt();
   	 }
   	 if(Game.board[r][c]=='-') {
   		 Game.board[r][c]='X';
   		 printArray();
   	 }
   	 else { //checking if any of the players played here before
   		 System.out.println("ERROR! Someone played here before");
   		 inputX();
   	 }
   	 Game.winner(r,c);
    }
   
  //getting the number of row and column from the player O and checking the errors
    public static void inputO() {
   	 Scanner s=new Scanner(System.in);
   	 int r,c;
   	 System.out.println("Player 2 (O)");
   	 System.out.println("Enter the number of row from 0 to 5");
   	 r=s.nextInt();
   	if(r>5) { //checking if the player enters right number of row
   		System.out.println("ERROR! Enter the number of row from 0 to 5");
      	 r=s.nextInt();
   	 }
   	 System.out.println("Enter the number of column from 0 to 6");
   	 c=s.nextInt();
   	if(c>6) { //checking if the player enters right number of column
   		System.out.println("ERROR! Enter the number of row from 0 to 6");
      	 c=s.nextInt();
   	 }
   	 if(Game.board[r][c]=='-') {
   		 Game.board[r][c]='O';
   		 printArray();
   	 }
   	 else { //checking if any of the players played here before
   		 System.out.println("ERROR! Someone played here before");
   		 inputO();
   	 }
   	 Game.winner(r,c);
    }
    
    //printing the array infront of the player to know where he put the X or O
    public static void printArray() {
   	 for(int row=0;row<Game.board.length;row++) { 
   		 for(int col=0;col<Game.board[0].length;col++) {
   			 System.out.print(Game.board[row][col]+" ");
   		 }
   		 System.out.println();
   	 }
    }
    
}

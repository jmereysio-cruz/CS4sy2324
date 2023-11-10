import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){


	Scanner scanner = new Scanner(System.in);


int playerW = 0;
int computerW = 0;

System.out.print("How many wins to win the match?");
int Wneeded = scanner.nextInt();

		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);

    Move playerMoveObj = null; 
        Move computerMoveObj = null; 
    
		while (playerW < Wneeded && computerW < Wneeded) {
	
			int computerMove = (int) (Math.random() *3) + 1;

			System.out.print("Play your move (1: Rock, 2: Paper, 3: Scissors): ");
			int playerMove = scanner.nextInt();


	if (playerMove ==1) {
playerMoveObj= rock;
} else if (playerMove ==2) {
playerMoveObj = paper; 
} else if (playerMove == 3) {
playerMoveObj = scissors;
} else {
System.out.println("Invalid move. Please play a valid move (1: Rock, 2: Paper, 3: Scissors).");
continue;
}

if (computerMove == 1) {
computerMoveObj = rock;
} else if (computerMove == 2) {
computerMoveObj = paper;
} else if (computerMove == 3) {
computerMoveObj = scissors; }

int result = Move.compareMoves(playerMoveObj, computerMoveObj);

if (result == 0){
System.out.println("Draw");
} else if (result == 1){
System.out.println("User wins the round");
playerW++;
} else {
System.out.println("Computer wins the round");
computerW++;
}

System.out.println();

}

if (playerW > computerW) {
System.out.println("User wins the match");
}else {System.out.println("Computer wins the match");}

scanner.close();




}

}

		
package warProject;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//Card cards1 = new Card(1,"A");
		//System.out.println(cards1.getName());
		
		Deck deck = new Deck();
		Player player1 = new Player("Smith");
		Player player2 = new Player("John");
		deck.shuffle();
		
		for (int i =0;i<26;i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		//print out numbers of cards each player has
		System.out.println("Player1 has: "+player1.getHand().size());
		System.out.println("Player2 has: "+player2.getHand().size());
		player1.describe();
		player2.describe();
		int val1;
		int val2;
		for (int i=0;i<26;i++) {
			
			val1= player1.flip().getValue(); //stores the value of player 1 card flip
			val2= player2.flip().getValue();//stores the value of player 2 card flip
			//compares which player gets a point based on the card value
			if (val1>val2) {
				player1.increnebtScore();
			}
			else if (val2>val1) {
				player2.increnebtScore();
			}
			else {System.out.println("no point was awarded");
			
			}
		}
		//determines the winner based on the final score
		if (player1.getScore()>player2.getScore()) {
			System.out.println(player1.getName()+" has won this round");
		}
		else if (player2.getScore()>player1.getScore()) {
			System.out.println(player2.getName()+" has won this round");
		}
		else {System.out.println("It is a tie!");
	}
 }
}


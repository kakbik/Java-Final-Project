package warProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //fields:
	private List <Card> hand;
	private int score;
	private String name;
	//constructor
		public Player(String name) {
			this.hand = new ArrayList<>();
			this.score=0;
			this.name = name;
		}
	//setters and getters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//other methods
	public void describe() {
		System.out.println("Player name is: "+this.name);
		System.out.println("Player score is: "+this.score);
		for (Card card:hand) {
			card.describe();
		}
	}
	public Card flip() {
		//this will remove the top card from player's hand
		return hand.remove(0);
		
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	public void increnebtScore() {
		score += 1;
		
	}
}

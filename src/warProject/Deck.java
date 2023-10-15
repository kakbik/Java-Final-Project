package warProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//field (list of cards)
	private List <Card> cards;
	//Constructor
public Deck() {
	
	this.cards = new ArrayList<>();
	  String[] names = {"Hearts", "Diamonds", "Clubs", "Spades"};
	//outer loop iterates through cards names	  
	     for (String name : names) {
	    	 //inner loop iterates through values of cards 2 through 14
	         for (int i = 2; i < 15; i++) {
	             Card card = new Card();
	             card.setValue(i);  // Values 2 to 14 for 2 to Ace
	             card.setName(name);
	             this.cards.add(card);
	         }
	     }
}

public List<Card> getCards() {
	return cards;
}
public void setCards(List<Card> cards) {
	this.cards = cards;
}
public void shuffle() {
	Collections.shuffle(cards);;
	}
public Card draw() {
	//this will return and remove the top card from the deck
	return cards.remove(0);
}

}


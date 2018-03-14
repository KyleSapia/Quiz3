package Quiz3;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.*;

public class Deck1 {
	
	ArrayList<Card1> cards = new ArrayList<>();

	public Deck1() {
		BuildDeck();
	}
	
	public Deck1(int iNbrOfDecks) {
		
		for (int a = 0; a < iNbrOfDecks;a++) {
			BuildDeck();
		}
	}
	
	public void BuildDeck() {
		
		for (eRank eRank: eRank.values()) {
			for (eSuit eSuit: eSuit.values()) {
					cards.add(new Card1(eSuit, eRank));
				}
		}
		Collections.shuffle(cards);
	}
	
	public Card1 draw() throws Exception {
		if (cards.size() == 0) {
			throw new Exception("Empty Deck");
		}
		return cards.remove(0);
		}
	
	public int getRemaining(Object eNum) {
		int counter = 0;
		if (eNum instanceof eSuit) {
			for(Card1 c: cards) {
				if(c.geteSuit() == eNum) {
					counter++;
				}
			}
		}
		else {
			for(Card1 c: cards) {
				if(c.geteRank() == eNum) {
					counter++;
				}
			}
		}
		return counter;
	}
}
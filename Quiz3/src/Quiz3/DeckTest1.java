package Quiz3;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class DeckTest1 {

	@Test
	void test() throws Exception {
		Deck1 d = new Deck1();
		Card1 c = d.draw();
		assertEquals(12, d.getRemaining(c.geteSuit()));
		assertEquals(3, d.getRemaining(c.geteRank()));
	}

}

package Quiz3;

import pkgEnum.*;

public class Card1 implements Comparable{
	
	private eRank eRank;
	private eSuit eSuit;
	
	
	public Card1(pkgEnum.eSuit eSuit, pkgEnum.eRank eRank) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	
	public eRank geteRank() {
		return eRank;
	}


	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}


	public eSuit geteSuit() {
		return eSuit;
	}


	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Card1 c = (Card1) o;
		return c.geteRank().compareTo(this.geteRank());

}

}

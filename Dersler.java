package Senel;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Embeddable  
	public class Dersler {
	
		 private int matematik;
		private int turkce;
		private int ingilizce;
	
		public int getMatematik() {
			return matematik;
		}
		public void setMatematik(int matematik) {
			this.matematik = matematik;
		}
		public int getTurkce() {
			return turkce;
		}
		public void setTurkce(int turkce) {
			this.turkce = turkce;
		}
		public int getIngilizce() {
			return ingilizce;
		}
		public void setIngilizce(int ingilizce) {
			this.ingilizce = ingilizce;
		}
		@Override
		public String toString() {
			return "Dersler [matematik=" + matematik + ", turkce=" + turkce + ", ingilizce=" + ingilizce + "]";
		}
		public Dersler(int matematik, int turkce, int ingilizce) {
	
			this.matematik = matematik;
			this.turkce = turkce;
			this.ingilizce = ingilizce;
		}
		
		public Dersler() {}
	
}

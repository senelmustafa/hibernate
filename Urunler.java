package Odev_Market;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "urun")
@Cacheable
@Cache(region = "Urunler", usage = CacheConcurrencyStrategy.READ_WRITE)
public class Urunler {
	@Id
	private int u_id;
	private String urunIsim;
	@ManyToOne
	@JoinColumn(name = "birlesme")	
	private IsYerleri isYeri;
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getUrunIsim() {
		return urunIsim;
	}
	public void setUrunIsim(String urunIsim) {
		this.urunIsim = urunIsim;
	}
	public IsYerleri getIsyeri() {
		return isYeri;
	}
	public void setIsyeri(IsYerleri isYeri) {
		this.isYeri = isYeri;
	}
	@Override
	public String toString() {
		return "Urunler [u_id=" + u_id + ", urunIsim=" + urunIsim + "]";
	}
	public Urunler(int u_id, String urunIsim) {
		
		this.u_id = u_id;
		this.urunIsim = urunIsim;
		this.isYeri = isYeri;
	}

}

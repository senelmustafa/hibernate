package Senel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OgrenciKayit {
	@Id
	private int ogrenciNo;
	private String adSoyad;
	private String sinifi;
	
	private Dersler dersler;
	
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public String getSinifi() {
		return sinifi;
	}
	public void setSinifi(String sinifi) {
		this.sinifi = sinifi;
	}
	public Dersler getDersler() {
		return dersler;
	}
	public void setDersler(Dersler dersler) {
		this.dersler = dersler;
	}
	@Override
	public String toString() {
		return "OgrenciKayit [ogrenciNo=" + ogrenciNo + ", adSoyad=" + adSoyad + ", sinifi=" + sinifi + ", dersler="
				+ dersler + "]";
	}
	public OgrenciKayit(int ogrenciNo, String adSoyad, String sinifi, Dersler dersler) {
		super();
		this.ogrenciNo = ogrenciNo;
		this.adSoyad = adSoyad;
		this.sinifi = sinifi;
		this.dersler = dersler;
	}
	
	public OgrenciKayit() {}
	}



package Odev_Market;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "isyeri")
@Cacheable
@Cache(region="isYerleri",usage=CacheConcurrencyStrategy.READ_WRITE)
public class IsYerleri {
	@Id
	private int id;
	private String isYeri;
	
	
	@OneToMany(mappedBy="isYeri",orphanRemoval=true,cascade=CascadeType.ALL)
	private List<Urunler>urun=new ArrayList<>();
	
	public IsYerleri() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsYeri() {
		return isYeri;
	}

	public void setIsYeri(String isYeri) {
		this.isYeri = isYeri;
	}

	
	public IsYerleri(int id, String isYeri) {
		
		this.id = id;
		this.isYeri = isYeri;

	}

	public List<Urunler> getUrun() {
		return urun;
	}

	public void setUrun(List<Urunler> urun) {
		this.urun = urun;
	}

	@Override
	public String toString() {
		return "IsYerleri [id=" + id + ", isYeri=" + isYeri + ", urun=" + urun + "]";
	}



	
	
}
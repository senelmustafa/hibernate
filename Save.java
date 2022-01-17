package Odev_Market;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import H05_caching.H1_Ogrenci;
import H05_caching.H2_Kitap;

public class Save {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(IsYerleri.class)
				.addAnnotatedClass(Urunler.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
   
		Urunler market1=new Urunler(10,"Kola");
		Urunler market2=new Urunler(11,"Cips");
		Urunler market3=new Urunler(12,"Ekmek");
		
		Urunler mobilya1=new Urunler(20,"Koltuk");
		Urunler mobilya2=new Urunler(21,"Masa");
		
		Urunler galeri1=new Urunler(30,"Mercedes");
		Urunler galeri2=new Urunler(31,"Bmw");
		
		IsYerleri mrk=new IsYerleri(100,"market");
		IsYerleri mbly=new IsYerleri(200,"mobilya");
		IsYerleri glr=new IsYerleri(300,"galeri");
		
		
//		IsYerleri is_market=new IsYerleri(100,"market") ;
//		IsYerleri is_marangoz=new IsYerleri(200,"mobilya") ;
//		IsYerleri is_galeri=new IsYerleri(100,"galeri") ;

		market1.setIsyeri(mrk);
		market2.setIsyeri(mrk);
		market3.setIsyeri(mrk);
		
		mobilya1.setIsyeri(mbly);
		mobilya2.setIsyeri(mbly);
		
		galeri1.setIsyeri(glr);
		galeri2.setIsyeri(glr);
		
		session.save(mrk);
		session.save(mbly);
		session.save(glr);
		
		session.save(market1);
		session.save(market2);
		session.save(market3);
		
		session.save(mobilya1);
		session.save(mobilya2);
		
		session.save(galeri1);
		session.save(galeri2);
		
		
		
	tx.commit();
	
	}
}
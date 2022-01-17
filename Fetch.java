package Odev_Market;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import H05_caching.H1_Ogrenci;
import H05_caching.H2_Kitap;

public class Fetch {

	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Urunler.class)
				.addAnnotatedClass(IsYerleri.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// 1-)x işyerinin bütün ürünlerini çekiniz,
		IsYerleri isyer = session.get(IsYerleri.class, 100);
		for (Urunler each : isyer.getUrun()) {
			System.out.println(each);
		}

//2-)işyerleri tablosunu hql ve sql ile gösteriniz ,
//3-)Aynı ürünü üstüste 2 session açarak console da görün,console u inceleyin . 

//4-)ürünler tablosunu çekiniz ve x işyerini (parent )siliniz
		tx.commit();
	}

}

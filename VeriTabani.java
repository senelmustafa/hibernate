package Senel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.SizeExpression;

public class VeriTabani {
	static Scanner scan = new Scanner(System.in);
	static SessionFactory sf = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(OgrenciKayit.class).buildSessionFactory();

	static Session session = sf.openSession();
	static Transaction tx = session.beginTransaction();

	public static void main(String[] args) {
//		System.out.println("╔══════════════════════════════════════════════════════════╗");
//		System.out.println("╚ ═ ═ ═ ═ ═ ═ ═ ═ ═ ÖĞRENCİ NOT GİRİŞ PROGRAMI ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n");
//		System.out.println(
//				"Lütfen Listeden Yapmak İstediğini İşlemi Seçiniz\n 1-Kayıt Gir 	 <\n 2-Kayıt Listele < \n 3-Kayıt Silme   <\n 4-Çıkış 	 	 <");

//		Dersler dersler=new Dersler("80","80","100");

//		OgrenciKayit ogKayit = new OgrenciKayit(101,"Mustafa ŞENEL","1A",dersler);
//		session.save(ogKayit);
//		
//		OgrenciKayit ogKayit2 = new OgrenciKayit(102,"Aysel ŞENEL","1A",new Dersler("70","80","70"));
//		session.save(ogKayit2);
//		

		menu();

	}

	private static void menu() {
		System.out.println(" ");
		System.out.print("╔══════════════════════════════════════════════════════════╗\n");
		System.out.print("╚ ═ ═ ═ ═ ═ ═ ═ ═ ═ ÖĞRENCİ NOT GİRİŞ PROGRAMI ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n");
		System.out.println(
				"Lütfen Listeden Yapmak İstediğini İşlemi Seçiniz\n 1-Kayıt Gir 	 <\n 2-Kayıt Listele < \n 3-Kayıt Silme   <\n 4-Çıkış 	 	 <");
		int gir = scan.nextInt();
					switch (gir) {
					case 1:
						session.save(	kayitGir());
							tx.commit();
							 menu();
					break;
					case 2:
					kayitListele();
						 
					break;
					case 3:
						kayitSil();
						 
					break;
					case 4:
							cikıs();
					break;
					default:
							System.out.println("Yanlış Bir İşlem Yaptınız");
							menu();
								break;
		}
		
	}

	private static void kayitListele() {
		System.out.println("Aramak İstediğiniz Öğrencinin Nosunu Giriniz  : ");
		int bul=scan.nextInt();
		OgrenciKayit listele=session.get(OgrenciKayit.class,bul);
		System.out.println(listele);
	 menu();

	}

	private static void cikıs() {
		System.out.println("Yeniden Bekleriz...");

	}

	private static int kayitSil() {
		System.out.println("Silinecek Öğrencinin No sunu giriniz : ");
		int no = scan.nextInt();
		session.delete(session.get(OgrenciKayit.class,no));
		System.out.println("\n═════Kayıt Silindi═════\n");
		return no;
		}

	private static OgrenciKayit kayitGir() {
		Scanner scan = new Scanner(System.in);
		System.out.print("öğrenci no	: ");
		int ogNo=scan.nextInt();
		

		System.out.print("Adı Soyadı		: ");
		
		String adSoyad = scan.next();
		
	
		System.out.print("Sınıf	: ");
		
		String sinif = scan.next();
		
		System.out.print("İngilizce Notu	:");
		int ing = scan.nextInt();

		System.out.print("Matematik Notu	:");
		int mat = scan.nextInt();

		System.out.print("Türkçe Notu	:");
		int trk = scan.nextInt();
		Dersler dersler = new Dersler(ing, mat, trk);

		System.out.println("\n═════Kayıt Tamamlandı═════\n");
		return new OgrenciKayit(ogNo,adSoyad, sinif, dersler);
		
	}

}

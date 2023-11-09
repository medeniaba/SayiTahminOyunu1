import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
	

		public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			Random med = new Random();
				System.out.println("Merhaba Hoş geldiniz , İsminiz ?");
	        String isim =  klavye.next();
	        System.out.println("Merhaba " + isim + " , sayı tahmin oyunumuza hoş geldin ; ");
			System.out.println("Lütfen 1-100 arasında bir sayı tahmin et : " );
			int tahmin = klavye.nextInt();
			int d = med.nextInt(100);
			while(d != tahmin ) {
			if ( d < 0 || d> 100) {
				System.out.println( "1 ile 99 arasında bir deger giriniz" );
				 tahmin = klavye.nextInt();}
			else if (d > tahmin) {
					System.out.println("Lütfen tahmininiz artırın");
					tahmin = klavye.nextInt();}
			else 
			{ System.out.println("Lütfen tahmnininizi azaltın");
				tahmin = klavye.nextInt();}
			
			
			}
			System.out.println(" Tebrikler doğru tahmin ettiniz ... ");}}


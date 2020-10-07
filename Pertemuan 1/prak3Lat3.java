/*
 Program berikut untuk mencoba operator relasional
 */

public class prak3Lat3 {	

	public static void main(String args[]) { 
		int a = 10;
		int b = 20;

		System.out.println("a == b = " + (a == b) ); /* operator untuk membandingkan nilai yang sama pada nilai a(10) dan b(20), karena tidak sama maka FALSE*/
		System.out.println("a != b = " + (a != b) ); /* operator untuk membandingkan nilai yang tidak sama pada nilai a(10) dan b(20), karena tidak sama maka TRUE*/
		System.out.println("a > b = " + (a > b) ); /* operator lebih besar pada nilai a(10) dan b(20), karena nilai a(10) lebih kecil dibanding nilai b(20) maka FALSE*/
		System.out.println("a < b = " + (a < b) ); /* operator lebih kecil pada nilai a(10) dan b(20), karena nilai a(10) lebih kecil dibanding nilai b(20) maka TRUE*/
		System.out.println("b >= a = " + (b >= a) ); /* operator lebih besar sama dengan pada nilai b(20) dan a(10), karena nilai b(20) lebih besar dibanding nilai a(10) maka TRUE*/
		System.out.println("b <= a = " + (b <= a) ); /* operator lebih kecil sama dengan pada nilai b(20) dan a(10), karena nilai b(20) lebih kecil dibanding nilai a(10) maka FALSE*/

	}

}
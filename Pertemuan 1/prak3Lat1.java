/*
 Program berikut untuk mencoba operator aritmetika
 */

public class prak3Lat1 {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b) );  /*nilai a(10) + nilai b(20) = 30*/
		System.out.println("a - b = " + (a - b) );  /*nilai a(10) - nilai b(20) = -10*/
		System.out.println("a * b = " + (a * b) );  /*nilai a(10) * nilai b(20) = 200*/
		System.out.println("b / a = " + (b / a) );  /*nilai b(20) / nilai a(10) = 2*/
		System.out.println("b % a = " + (b % a) );  /*sisa nilai b(20) dibagi nilai a(10) = 0*/
		System.out.println("c % a = " + (c % a) );  /*sisa nilai c(25) dibagi nilai a(10) = 5*/
		System.out.println("a++ = " + (a++) );      /*nilai a(10) di increment menjadi 11. Karena post-increment, nilai a(10) yang ditampilkan*/
		System.out.println("b-- = " + (a--) );      /*nilai b(20) di decrement menjadi 19. Karena post-decrement, nilai b(20) yang ditampilkan*/

		// Check the difference in d++ and ++d
		System.out.println("d++ = " + (d++) );      /*nilai d(25) di increment menjadi 26. Karena post-increment, nilai d(25) yang ditampilkan*/
		System.out.println("++d = " + (++d) );      /*nilai d(26) yang sebelumnya akan di pre-increment. Yang ditampilkan adalah nilai d(27)*/

	}
}
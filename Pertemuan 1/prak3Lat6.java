/*
 Program berikut untuk mencoba operator conditional
 */

public class prak3Lat6 {	

	public static void main(String args[]) { 
		int a, b;
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " +	b ); /* operator conditional jika nilai a adalah 1 maka TRUE dan jika bukan maka FALSE, karena a(10) maka FALSE dan nilai diambil di sebelah kanan, b(30)*/

		b = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + b ); /* operator conditional jika nilai a adalah 10 maka TRUE dan jika bukan maka FALSE, karena a(10) maka TRUE dan nilai diambil di sebelah kiri, b(20)*/

	}

}
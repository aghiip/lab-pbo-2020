/*
 Program berikut untuk mencoba operator instanceOF
 */

public class prak3Lat7 {

	public static void main(String args[]) {

		String name = "James";

// following will return true since name is type of String
		boolean result = name instanceof String; 
		System.out.println( result );

	}

}

/* operator (Instanceof) digunakan untuk mengecek apakah 
   suatu objek termasuk ke dalam class tertentu atau tidak. 
   Nilai yang dikembalikan adalah nilai boolean. Karena name bertipe string maka TRUE */
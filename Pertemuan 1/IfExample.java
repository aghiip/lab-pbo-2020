/*
 Program berikut untuk mencoba seleksi if
 */

import java.util.Scanner;

public class IfExample {	
	public static void main(String[] args) { 
		int age=0;
		Scanner Sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda:"); /* diminta memasukkan umur*/
		age = Sc.nextInt();

		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP"); /* operator if yang apa bila umur lebih besar sama dengan 17 maka akan menjalankan perintah tersebut*/

	}

}
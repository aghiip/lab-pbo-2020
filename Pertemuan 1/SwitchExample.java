/*
 Program berikut untuk mencoba seleksi switch-case
 */

public class SwitchExample
{

	public static void main(String[] args) { 
		int number=20;
		switch(number){ /*operator switch case, dimana jika number yang dimasukkan sesuai dengan salah satu case. maka perintah dapat dijalankan*/
		case 10: System.out.println("10");break; /*jika nilai number adalah 10 maka akan menampilkan 10 dan break*/
		case 20: System.out.println("20");break; /*jika nilai number adalah 20 maka akan menampilkan 20 dan break*/
		case 30: System.out.println("30");break; /*jika nilai number adalah 30 maka akan menampilkan 30 dan break*/
		default:System.out.println("Not in 10, 20 or 30"); /*jika nilai number tidak ada yang sesuai dengan yang tersedia, maka secara otomatis menjalankan default*/

		}

	}

}

 /*case 20 adalah nilai yang sama dengan nilai number(20) maka tampilan akan muncul 20 dan menjalankan break*/
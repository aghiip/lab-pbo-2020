/*
 Program berikut untuk mencoba switch-case pada String
 */

public class SwitchExample3 {

	public static void main(String[] args) { 
		String dayOfWeekArg = "Thursday"; 
		String typeOfDay = "";

		switch (dayOfWeekArg) { /*operator switch case, dimana jika dayOfWeekArg yang dimasukkan sesuai dengan salah satu case. maka akan menjalankan perintah*/
		    case "Monday": 
			    typeOfDay = "Start of work week";
			    break; /*jika dayOfWeekArg berisi Monday, maka akan menampilkan Start of work week dan break*/

		    case "Tuesday":   
		    case "Wednesday": 
		    case "Thursday":
			    typeOfDay = "Midweek";
			    break; /*jika dayOfWeekArg berisi Tuesday Wednesday, Thursday, maka akan menampilkan Midweek dan break*/

		    case "Friday": 
			    typeOfDay = "End of work week";
			    break; /*jika dayOfWeekArg berisi Friday, maka akan menampilkan End of work week dan break*/

		    case "Saturday":
		    case "Sunday":
			    typeOfDay = "Weekend";
			    break; /*jika dayOfWeekArg berisi Saturday,Sunday, maka akan menampilkan Weekend dan break*/

	

		    default:
			    System.out.println("Invalid day of the week: " + dayOfWeekArg);/*jika tidak ada satupun case yang cocok maka akan menjalankan default menampilkan Invalid day of the week dan isi dayOfWeekArg*/

		}

		System.out.println(typeOfDay); /*karena pada dayofweekArg = Thursday maka nilai output diambil dari typeOfDay adalah Midweek*/

	}

}
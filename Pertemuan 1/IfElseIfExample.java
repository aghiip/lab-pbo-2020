/*
 Program berikut untuk mencoba seleksi if-else if
 */

public class IfElseIfExample {

	public static void main(String[] args) { 
		int marks=65;

		if(marks<50){ 

			System.out.println("fail"); /*jika nilai marks lebih kecil dari 50 maka akan muncul fail*/
		}
		else if(marks>=50 && marks<60){ 
			System.out.println("D grade"); /*jika nilai marks lebih besar sama dengan 50 dan lebih kecil dari 60 maka akan mendapat D grade*/
		}
		else if(marks>=60 && marks<70){ 
			System.out.println("C grade"); /* jika nilai marks lebih besar sama dengan 60 dan lebih kecil dari 70 maka akan mendapat C grade*/
		}
		else if(marks>=70 && marks<80){ 
			System.out.println("B grade"); /*jika nilai marks lebih besar sama dengan 70 dan lebih kecil dari 80 maka akan mendapat B grade*/
		}
        else if(marks>=80 && marks<90){ 
			System.out.println("A grade"); /*jika nilai marks lebih besar sama dengan 80 dan lebih kecil dari 90 maka akan mendapat A grade*/
		}
		else if(marks>=90 && marks<100){ 
			System.out.println("A+ grade"); /*jika nilai marks lebih besar sama dengan 90 dan lebih kecil dari 100 maka akan mendapat A+ grade*/
		}else{
			System.out.println("Invalid!"); /*jika nilai marks tidak termasuk ke satu pun case, maka akan muncul Invalid!*/

		}

	}

}

/* karena marks bernilai 65 maka akan mendapatkan C grade*/
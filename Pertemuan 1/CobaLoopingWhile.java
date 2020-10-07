/*
 Program berikut untuk mencoba looping while
 */

public class CobaLoopingWhile{

	public static void main(String arg[])
	{
		int i=0;

		while (i<10) /*operator while untuk melakukan perulangan sebanyak kurang dari 11 kali dimana i = 0*/
		{
			int j=0;

			while (j<i+1) /*operator while untuk melakukan perulangan samapai batas maksimum dari while sebelumnya*/
			{
			    System.out.print('*'); /*pada setiap baris akan di tampilkan (*) sesuai jumlah yang di dapat*/
			    j++;
			}

			System.out.println();
			i++;

		}

	}

}
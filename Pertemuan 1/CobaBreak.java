/* 
 Program berikut untuk mencoba statemen break
 */

public class CobaBreak{

	public static void main(String arg[]){

		for (int i=0; i<10; i++) /* disini dilakukan looping*/
		{
			for (int j=0; j<i+1; j++) /* disini dilakukan looping di dalam looping*/
			{
			    if(j==5)
                	break; /*apabila nilai j sama dengan 5 maka akan break sampai looping pertama mencapai batas*/
			    System.out.print('*'); /*menampilkan * sebanyak jumlah yang di dapat*/
									   
			}

			System.out.println();

		}

    }

}


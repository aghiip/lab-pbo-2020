/*
 Program berikut untuk mencoba looping for
 */

public class CobaLoopingFor{

	public static void main(String arg[])
	{
		for (int i=0; i<10; i++) /* disini dilakukan looping*/
		{
			for (int j=0; j<i+1; j++) /* disini dilakukan looping di dalam looping*/
		    	System.out.print('*'); /*disini akan menampilkan (*) sesuai nilai yang di dapat*/

		    System.out.println();

		}

	}

}
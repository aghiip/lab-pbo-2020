/*
 Program berikut untuk mencoba pemakaian label pada break
 */

public class Smallest{

	public static void main(String arg[]){

		int a, b;

		Mulai:
		for(a=0; a<2; a++) /* disini dilakukan looping*/
		{
			for(b=0; b<3; b++) /* disini dilakukan looping di dalam looping*/
			{
				if(b==2)
					break Mulai; /*jika b sama dengan 2, maka break Mulai akan menghentikan looping*/
				System.out.println("a=" + a + " ; b=" + b);

			}

		}

	}

}
/*
 Program berikut untuk menyalin array ke array lain
 */

public class CopyArray {

    public static void main(String args[]) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        int[] array2 = new int[3];

        System.arraycopy(array1,0,array2,0,3); /* nilai Array1 dicopy ke nilai array2 sampai sebanyak 3 kali*/
        System.out.print("Array1 : ");
        for (int i=0; i<array1.length; i++)
            System.out.print(array1[i] + " "); /* nilai dari Array1*/
        System.out.println();

        System.out.print("Array2 : ");
        for (int i=0; i<array2.length; i++)
            System.out.print(array2[i] + " "); /* nilai dari Array2*/ 

    }

}
/*
 Program berikut untuk menguji awalan atau akhir suatu string berntebet
 */

public class CopyArray3 {

    public static void main(String args[]) {
        String str1 = "Informatika Universitas Syiah Kuala";
        System.out.println(str1.startsWith("Inf")); /*mengecek apakah data pada str1 dimulai dengan "Inf"*/
        System.out.println(str1.endsWith("kuala")); /*mengecek apakah data pada str1 diakhiri dengan "kuala"*/
        System.out.println(str1.startsWith("Inf",1)); /*mengecek apakah data pada [1] str1 dimulai dengan "Inf"*/
        System.out.println(str1.startsWith("Inf",2)); /*mengecek apakah data pada [2] str1 dimulai dengan "Inf"*/
        System.out.println(str1.startsWith("Inf",3)); /*mengecek apakah data pada [3] str1 dimulai dengan "Inf"*/

    }

}

/*data pada array str1 diawalai dari [0]*/
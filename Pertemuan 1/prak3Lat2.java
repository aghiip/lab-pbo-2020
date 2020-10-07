/*
 Program berikut untuk mencoba operator assignment
 */

public class prak3Lat2 {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b; 
        System.out.println("c = a + b = " + c ); /* nilai a(10) ditambah nilai b(20) akan disimpan di c(30)*/

        c += a ; 
        System.out.println("c += a = " + c ); /* nilai c(30) sebelumnya akan ditambah dengan nilai a(10), maka nilai c sekarang 40*/

        c -= a ; 
        System.out.println("c -= a = " + c ); /* nilai c(40) yang sebelumnya akan dikurangi dengan nilai a(10), maka nilai c sekarang 30*/

        c *= a ; 
        System.out.println("c *= a = " + c ); /* nilai c(30) yang sebelumnya dikalikan nilai a(10), maka nilai c sekarang 300*/

        a = 10; 
        c = 15; 
        c /= a ; 
        System.out.println("c /= a = " + c ); /* nilai c(15) dibagi nilai a(10) dengan angka dibelakang koma tidak dipakai, maka nilai c sekarang 1*/

        a = 10; 
        c = 15; 
        c %= a ; 
        System.out.println("c %= a = " + c ); /* sisa pembagian nilai c(15) dengan nilai a(10), maka nilai c sekarang 5*/

        c <<= 2 ; 
        System.out.println("c <<= 2 = " + c ); /* disini menggunakan shift left, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 20*/

        c >>= 2 ; 
        System.out.println("c >>= 2 = " + c ); /* disini menggunakan shift right, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 5*/

        c >>= 2 ; 
        System.out.println("c >>= 2 = " + c ); /* disini menggunakan shift right, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 1*/

        c &= a ; 
        System.out.println("c &= a = " + c ); /* disini menggunakan AND, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 0*/

        c ^= a ; 
        System.out.println("c ^= a = " + c ); /* disini menggunakan XOR, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 10*/

        c |= a ; 
        System.out.println("c |= a = " + c ); /* disini menggunakan OR, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 10*/

    }       

}
/*
 Program berikut untuk mencoba array dua dimensi
 */

public class Array2 {

    public static void main(String args[]) {
        //Array 2 dimensi
        int[][] arrx = new int[3][3]; /* Array 2 dimensi berisikan 3 baris dan 3 kolom*/
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3;
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6;
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9;
        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);

    }

}

/* Akan menampilkan nilai array pada arrx[0][0] sampai arrx[2][2] */
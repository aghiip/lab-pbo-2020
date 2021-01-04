
/**
 * Write a description of class Array1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array1{
     public static void main(String[] ar){
         /*Mendeklarasi dan inisialisasi array*/
         int[] bil_bulat = {3, 5, 7};
         String[] warna = {"merah", "hijau", "kuning"};
         
         for(int i=0;i<bil_bulat.length;i++){
             System.out.print(bil_bulat[i] +" ");
         }
         System.out.println();
        
         for(int i=0;i<warna.length;i++){
             System.out.print(warna[i] +" ");
         }
         System.out.println();
        
         /*Mendeklarasi dan inisialisasi array 2D*/
         int arr[][]={{1,2,3},{3,4,5},{5,6,7}};
        
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
     }
}

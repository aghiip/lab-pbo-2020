
/**
 * Write a description of class Testtrycatch2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testtrycatch2{
     public static void main(String args[]){
         try{
             int data=10/0;
         }catch(ArithmeticException e){System.out.println(e);}
        
         System.out.println("Rest of The Code...");
     }
}

/*Error pada kode program sudah dihandle dengan konsep exception handling sehingga saat di run 
 *seharusnya menghasilkan error namun karena sudah dihandle program tetap berjalan hingga selesai*/

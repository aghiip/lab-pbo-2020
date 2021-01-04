
/**
 * Write a description of class Manajer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manajer extends Pegawai {
    private String departemen;
    
    public Manajer(String nama, double gaji, String departemen)
    {
        super(nama, gaji);
        this.departemen = departemen;
    }
    
    /*method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }
    
    /* method ini digunakan untuk mengembalikan nilai dari departemen*/
    public String getDepartemen()
    {
        return departemen;
    }
}

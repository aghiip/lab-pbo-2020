
/**
 * Write a description of class Pegawai here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pegawai {
    private String nama;
    private double gaji;
    
    public Pegawai(String nama, double gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }
    
    /*method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /* method ini digunakan untuk mengembalikan nilai dari nama*/
    public String getNama()
    {
        return nama;
    }
    
    /*method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setGaji(double gaji)
    {
        this.gaji = gaji;
    }
    
    /* method ini digunakan untuk mengembalikan nilai dari gaji*/
    public double getGaji()
    {
        return gaji;
    }
}

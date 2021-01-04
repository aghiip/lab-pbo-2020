
/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa
{
    private int nrp;
    private String nama;
    

    public Siswa(int nrpx, String namax)
    {
        nrp = nrpx;
        nama = namax;
    }

    /* method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setNrp(int nrpx)
    {
        nrp = nrpx;
    }
    
    /* method yang digunakan untuk mengembalikan nilai dari nrp*/
    public int getNrp()
    {
        return nrp;
    }
    
    /* method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setNama(String namax)
    {
        nama = namax;
    }
    
    /*method accessor ini untuk mengembalikan string nama*/
    public String getNama()
    {
        return nama;
    }
}

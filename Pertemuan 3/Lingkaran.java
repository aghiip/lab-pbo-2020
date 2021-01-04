
/**
 * Write a description of class Lingkaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lingkaran
{
    private double jari_jari;

    public Lingkaran(double jari)
    {
        this.jari_jari = jari; 
    }

    /* method yang digunakan untuk mengubah nilai dari keadaan suatu objek dan memiliki parameter*/
    public void setJariJari(double jari)
    {
        this.jari_jari = jari;
    }
    
    /* method yang digunakan untuk mengembalikan nilai dari jari jari*/
    public double getJariJari()
    {
        return jari_jari;
    }
}

import java.util.ArrayList;
import java.util.*;

public class Bus{
    ArrayList<Penumpang> penumpangBiasa;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;    
    Scanner input = new Scanner(System.in);
   
    public Bus(){
       penumpangBiasa = new ArrayList<Penumpang>();
       penumpangPrioritas = new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      
    public ArrayList<Penumpang> getPenumpangBiasa(){         
        for(Penumpang penumpang:penumpangBiasa){
            penumpang.getNama();
        }
        return penumpangBiasa;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){    
        for(Penumpang penumpang : penumpangPrioritas){
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        int jumlahB = penumpangBiasa.size();
        System.out.println("Penumpang Biasa : " +jumlahB);
        return jumlahB;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahP = penumpangPrioritas.size();
        System.out.println("Penumpang Prioritas : " +jumlahP);
        return jumlahP;
    }
    
    public int getPenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int b=4, p=2;

        if((penumpangPrioritas.size() < p ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang BERHASIL ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        }else if((penumpangBiasa.size() < b ) && ((penumpang.getUmur()<10) || (penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang BERHASIL ditambahkan!");
            return penumpangBiasa.add(penumpang);
        }
        else if(penumpangBiasa.size() < b ){
            System.out.println("Penumpang biasa BERHASIL ditambahkan!");
            return penumpangBiasa.add(penumpang); 
        } else{
            System.out.print("Penumpang GAGAL ditambahkan!");
            System.out.println("Tidak ada kursi yang tersedia");
            return false;
        } 
    }
    
    public boolean turunkanPenumpang(String nama){
       
        for (int i = 0; i < penumpangBiasa.size(); i ++) {  
           if(nama.equals(penumpangBiasa.get(i).getNama())){
              penumpangBiasa.remove(i);
              System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
             return penumpangBiasa.equals(nama);
           }else{
              System.out.println("Penumpang Tidak Ditemukan"); 
               return false;
           }
        }
           
        for (int i = 0; i < penumpangPrioritas.size(); i ++) { 
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("penumpang bernama "+nama+" telah diturunkan!!");
             return penumpangPrioritas.equals(nama);
            }else{
              System.out.println("Penumpang Tidak Ditemukan"); 
               return false;
            }
        }return penumpangPrioritas.equals(nama);
    }
    
        public ArrayList<Penumpang> semuaPenumpang()
    { 
        semuaPenumpang = penumpangBiasa;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.print("Jumlah penumpang : ");
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }

        return semuaPenumpang;
    }

    public String toString(){
           String biasa = " ";
           String prioritas = " ";
           
           for(Penumpang penumpang : penumpangBiasa) {
                biasa+= penumpang.getNama().toString()+ " ";
            }
           for(Penumpang penumpang : penumpangPrioritas) {
               prioritas+= penumpang.getNama().toString()+ " ";
            }
            
          if(penumpangBiasa.isEmpty() == true ){  
              System.out.println("Penumpang Biasa = <kosong>") ;
          }else{
              System.out.println("Penumpang Biasa = " +biasa );
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("Penumpang Prioritas = <kosong>") ;
          }else{
              System.out.println("Penumpang Prioritas : " +prioritas);
          }
          System.out.println("jumlah Penumpang : " +getPenumpang());
          return "Penumpang biasa : "+biasa+"Penumpang prioritas : "+prioritas+"jumlah penumpang : " + getPenumpang();
    }
}
package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public abstract class Kendaraan {

     private int jumlahRoda;

     public Kendaraan(int jumlahRoda){
          this.jumlahRoda = jumlahRoda;
     }

     public void bergerak(){
          System.out.println("Kendaraan sedang bergerak");
     }

     public abstract void gantiMesin();

     public int getJumlahRoda(){
          return jumlahRoda;
     }
     
}

package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Tesla extends Mobil implements AI {

    public Tesla(int jumlahRoda, int jumlahKursi) {
        super(jumlahRoda, jumlahKursi);
    }

    @Override
    public void detectPotHole() {
        System.out.println("Mendeteksi menggunakan kamera dashboard");
    }

    @Override
    public void nyalakanAc() {
        System.out.println("Tesla menyalakan 2 AC");
    }

    @Override
    public void gantiMesin() {
        System.out.println("Tesla Ganti Mesin dengan Software");
    }
    
    @Override
    public String toString(){
        return "===== INFORMASI TESLA =====\n" +
               "Jumlah roda = " + super.getJumlahRoda() + "\n" + 
               "Jumlah kursi = " + super.getJumlahKursi() + "\n" ;
    }
}

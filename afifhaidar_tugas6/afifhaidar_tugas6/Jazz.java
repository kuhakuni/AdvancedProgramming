package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Jazz extends Mobil{

    public Jazz(int jumlahRoda, int jumlahKursi) {
        super(jumlahRoda, jumlahKursi);
    }

    @Override
    public void nyalakanAc() {
        System.out.println("Jazz menyalakan 1 AC");
    }

    @Override
    public void gantiMesin() {
        System.out.println("Tesla Ganti Mesin dengan Software");
    }
    
    @Override
    public String toString(){
        return "===== INFORMASI JAZZ =====\n" +
               "Jumlah roda : " + super.getJumlahRoda() + "\n" + 
               "Jumlah kursi : " + super.getJumlahKursi() + "\n" ;
    }
}

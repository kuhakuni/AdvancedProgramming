package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public abstract class Mobil extends Kendaraan {

    private int jumlahKursi;   
    
    public Mobil(int jumlahRoda, int jumlahKursi) {
        super(jumlahRoda);
        this.jumlahKursi = jumlahKursi;
    }

    public abstract void nyalakanAc();
    
    public int getJumlahKursi(){
        return jumlahKursi;
    }
}

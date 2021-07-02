package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Yamaha extends Motor implements AI {

    public Yamaha(int jumlahRoda, int kecepatanMax) {
        super(jumlahRoda, kecepatanMax);
    }

    @Override
    public void detectPotHole() {
        System.out.println("Yamaha mendeteksi menggunakan sensor");
    }

    @Override
    public void gantiMesin() {
        System.out.println("Yamaha tidak ganti mesin");
    }

    @Override
    public void rem() {
        System.out.println("Yamaha menggunakan rem depan");
    }
    
    @Override
    public String toString(){
        return "===== INFORMASI YAMAHA =====\n" +
               "Jumlah roda : " + super.getJumlahRoda() + "\n" + 
               "Kecapatan maksimal : " + super.getKecepatanMax() + " km / jam \n" ;
    }
}

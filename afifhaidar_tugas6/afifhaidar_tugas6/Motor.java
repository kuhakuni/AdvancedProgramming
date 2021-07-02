package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public abstract class Motor extends Kendaraan{

    private int kecepatanMax;

    public Motor(int jumlahRoda, int kecepatanMax) {
        super(jumlahRoda);
        this.kecepatanMax = kecepatanMax;
    }

    public abstract void rem();

    public int getKecepatanMax(){
        return kecepatanMax;
    }
}

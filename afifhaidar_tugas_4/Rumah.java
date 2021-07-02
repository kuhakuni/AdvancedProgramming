/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Rumah {
    //Rumah memiliki atribut alamat lengkap, harga, dan tipe rumah (kecil, sedang, besar)
    public static final String TIPE_KECIL = "kecil";
    public static final String TIPE_SEDANG  = "sedang";
    public static final String TIPE_BESAR = "besar";
    private String tipe;
    private String alamat;
    private int harga;

    public Rumah(String alamat, int harga, String tipe ){
        this.alamat = alamat;
        this.harga = harga;
        this.tipe = tipe;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return this.harga;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public String getTipe(){
        return this.tipe;
    }
}

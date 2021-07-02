package afifhaidar_tugas_3;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Ponsel {
    public static final String MERK_NAKIO = "Nakio";
    public static final String MERK_SUMSANG = "Samsung";
    public static final String MERK_SYNO = "Syno";
    public static final String MERK_XAIOMI = "Xaiomi";
    private static int nomorSeri = 1;
    private static int hurufSeri = 65;
    private final String MERK;
    private String seri;

    public Ponsel(String merk){
        this.MERK = merk;
        seri = "" + nomorSeri + (char)hurufSeri;
        nomorSeri+=2;
        hurufSeri++;
        if (hurufSeri > 69){
            hurufSeri = 65;
        }
    }

    public String getMerk(){
        return this.MERK;
    }

    public void setSeriAgen(String seriAgen){
        this.seri += seriAgen;
    }

    public String getSeri(){
        return this.seri;
    }

    public void cetakInfo(){
        System.out.printf("Merk: %s%n", getMerk());
        System.out.printf("Nomor Seri: %s%n", getSeri());
        System.out.printf("========================%n");
    }


}

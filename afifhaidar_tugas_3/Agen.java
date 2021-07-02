package afifhaidar_tugas_3;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Agen {
    private static int seriAgen = 100;

    public static Ponsel[] prosesPonsel(Ponsel[] daftarPonsel){
        for (int i = 0; i < daftarPonsel.length; i++) {
            daftarPonsel[i].setSeriAgen( "" + seriAgen);
            seriAgen+=3;
        }
        return daftarPonsel;
    }

}

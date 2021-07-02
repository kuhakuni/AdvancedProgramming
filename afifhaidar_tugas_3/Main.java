package afifhaidar_tugas_3;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Main {
    public static void main(String[] args) {
        Ponsel ponsel1 = new Ponsel(Ponsel.MERK_NAKIO);
        Ponsel ponsel2 = new Ponsel(Ponsel.MERK_SUMSANG);
        Ponsel ponsel3 = new Ponsel(Ponsel.MERK_SYNO);
        Ponsel ponsel4 = new Ponsel(Ponsel.MERK_XAIOMI);
        Ponsel ponsel5 = new Ponsel(Ponsel.MERK_SYNO);
        Ponsel ponsel6 = new Ponsel(Ponsel.MERK_SUMSANG);
        Ponsel[] daftarPonsel = {ponsel1, ponsel2, ponsel3, ponsel4, ponsel5, ponsel6};

        System.out.println("Sebelum ke Agen");
        for (Ponsel ponsel : daftarPonsel) {
            ponsel.cetakInfo();
        }

        System.out.println("\nSesudah ke Agen");
        Ponsel[] ponselSiapJual = Agen.prosesPonsel(daftarPonsel);
        for (Ponsel ponsel : ponselSiapJual) {
            ponsel.cetakInfo();
        }

    }
}

package afifhaidar_tugas5;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("1", "Sam", 2010, "Laki laki");
        pegawai.bekerja();
        pegawai.istirahat();
        System.out.println(pegawai);
        
        Sekretaris sekretaris = new Sekretaris(200, "2", "Annie", 2019, "Perempuan");
        sekretaris.bekerja();
        sekretaris.istirahat();
        sekretaris.istirahat("Bakso mercon");
        System.out.println(sekretaris);

        Teknisi teknisi = new Teknisi(5,"3", "Her", 2001, "Perempuan");
        teknisi.bekerja();
        teknisi.istirahat();
        System.out.println(teknisi);
    }
    
}

package afifhaidar_tugas5;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Teknisi extends Pegawai {
    // Teknisi memiliki atribut tambahan yaitu pengalamanKerja.
    private int pengalamanKerja;        
    
    public Teknisi(int pengalamanKerja, String NIP, String nama, int tahunMasuk, String kelamin) {
        super(NIP, nama, tahunMasuk, kelamin);
        this.pengalamanKerja = pengalamanKerja;
    }
    
    // Kemampuan bekerja pada role ini akan mencetak "Teknisi <nama> sedang bekerja".
    @Override
    public void bekerja() {
        System.out.println("Teknisi " + super.getNama() + " sedang bekerja");
    }     
    
    // Mencetak data pegawai dengan menambahkan informasi dari teknisi
    @Override
    public String toString() {
        return super.toString() + "Pengalaman kerja: " + this.pengalamanKerja + " tahun \n";
    }
}

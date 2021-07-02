package afifhaidar_tugas5;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Pegawai {
    // Pegawai memiliki atribut NIP, nama, tahunMasuk, dan kelamin.
    private String NIP;
    private String nama;
    private int tahunMasuk;
    private String kelamin;

    public Pegawai(String NIP, String nama, int tahunMasuk, String kelamin) {
        this.NIP = NIP;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.kelamin = kelamin;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }
    
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getKelamin() {
        return kelamin;
    }
    
    // Pekerja memiliki kemampuan untuk bekerja yang mana 
    // ketika dipanggil akan mencetak "Pekerja sedang bekerja".
    public void bekerja(){
        System.out.println("Pekerja sedang bekerja");
    }
    
    // Pekerja juga memiliki kemampuan untuk istirahat 
    // yang akan mencetak "Pekerja sedang istirahat"
    public void istirahat(){
        System.out.println("Pekerja sedang istirahat");
    }
    
    // Mencetak data pegawai 
    public String toString(){
        return "NIP: " + this.NIP + "\n" 
             + "Nama: " + this.nama + "\n" 
             + "Tahun masuk: " + this.tahunMasuk + "\n" 
             + "Kelamin: " + this.kelamin + "\n";
    }
}

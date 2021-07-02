package afifhaidar_tugas5;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Sekretaris extends Pegawai {
    // Sekretaris memiliki atribut tambahan yaitu kecepatanKetik. 
    private int kecepatanKetik;
   
    public Sekretaris(int kecepatanKetik, String NIP, String nama, int tahunMasuk, String kelamin) {
        super(NIP, nama, tahunMasuk, kelamin);
        this.kecepatanKetik = kecepatanKetik;
    }

    // Ketika istirahat, akan mencetak "Sekretaris sedang istirahat"
    @Override
    public void istirahat() {
        System.out.println("Sekretaris sedang istirahat");
    }

    // ketika istirahat dipanggil menggunakan 1 parameter bertipe String 
    // maka akan mencantumkan makanan yang sedang di makan.
    public void istirahat(String makanan){
        System.out.println("Sekretaris sedang makan siang dengan " + makanan );
    }

    // Kemampuan bekerja pada sekretaris akan mencetak 
    // "Sekretaris mengurus administrasi dengan kecepatan ketik <kecepatanTulis> kpm". 
    @Override
    public void bekerja() {
        System.out.println("Sekretaris mengurus administrasi dengan kecepatan ketik " + this.kecepatanKetik + " kpm");   
    }
    
    // Mencetak data pegawai dengan menambahkan informasi dari sekretaris
    @Override
    public String toString() {
        return super.toString() + "Kecepatan ketik: " + this.kecepatanKetik + "\n"; 
    }
}

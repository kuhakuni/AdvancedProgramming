/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Bank {
    //Bank memiliki nama, dan saldo. 
    private String nama;
    private double saldo;

    public Bank(String nama, double saldo){
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    // Fungsi setSaldo dipanggil ketika karyawan memasukkan gaji ke dalam bank 
    // yang secara otomatis memotong nominal uang sebesar 0.5%
    public void setSaldo(double saldo){    
        this.saldo = 0.995 *saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

}

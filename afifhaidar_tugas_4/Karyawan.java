/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Karyawan {
    //Karyawan memiliki bank, pekerjaan, rumah, nama, dan umur. 
    private Bank bank;
    private Pekerjaan pekerjaan;
    private Rumah rumah;
    private String nama;
    private int umur; 
            
    public Karyawan(Bank bank, Pekerjaan pekerjaan, Rumah rumah, String nama, int umur){
        this.bank = bank;   
        this.pekerjaan = pekerjaan;   
        this.rumah = rumah;
        this.nama = nama;   
        this.umur = umur;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Pekerjaan getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(Pekerjaan pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Rumah getRumah() {
        return rumah;
    }

    public void setRumah(Rumah rumah) {
        this.rumah = rumah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }   

    // Fungsi kerja dengan parameter lama bekerja, jika bekerja > 8 jam maka akan mendapat tambahan 100000*kelebihan jam.
    // Jika bekerja <= 8 jam maka akan mendapat gaji standard, gaji akan langsung masuk ke dalam saldo bank.
    public void kerja(int lamaKerja){
        double gaji = pekerjaan.getGaji();

        if(lamaKerja > 8){
             gaji += 100000 * (lamaKerja - 8);   
        }

        pekerjaan.setGaji(gaji);
        bank.setSaldo(gaji);
    }

    // class Karyawan memiliki kemampuan promosi, yaitu menaikkan gaji karyawan yang di inputkan kedalam parameternya menjadi 1.5% dari gaji awalnya.
    public static void promosi(Karyawan karyawan, Pekerjaan pekerjaan){
        double gajiPromosi = (int) 1.015 * karyawan.pekerjaan.getGaji();
        karyawan.pekerjaan.setGaji(gajiPromosi);
    }

    // class Karyawan memiliki fungsi untuk menghitung pajak yang menerima karyawan dan lama bulan sebagai parameter
    // serta mengembalikan nilai berupa pajak yang harus dibayarkan.
    // Uang di bank akan terkena pajak 1.2% perbulan
    // Pajak rumah diambil dari harga rumah * persentase pajak dengan tipe kecil 0.25%, tipe sedang 0.5%, tipe besar 0.75%
    public static double hitungPajak(Karyawan karyawan, int lamaBulan){
        double pajak = karyawan.bank.getSaldo() * 0.012 * lamaBulan ;
        String tipeRumah = karyawan.rumah.getTipe();
        int hargaRumah = karyawan.rumah.getHarga();

        if(tipeRumah.equals(Rumah.TIPE_KECIL)){
            pajak += 0.0025 * hargaRumah;
        }
        else if(tipeRumah.equals(Rumah.TIPE_SEDANG)){
            pajak += 0.0050 * hargaRumah;
        }
        else{
            pajak += 0.0075 * hargaRumah;
        }
        
        return pajak;
    }
    
    //Terdapat juga fungsi cetak bagi setiap karyawan untuk mencetak informasi mengenai nama, alamat, pekerjaan, gaji, saldo, dan umur
    public void cetak(){
        System.out.println("Nama karyawan \t\t: " + getNama() + "\n" 
                         + "Umur karyawan \t\t: " + getUmur() + "\n" 
                         + "Alamat karyawan \t: " + rumah.getAlamat() + "\n" 
                         + "Pekerjaan karyawan \t: " + pekerjaan.getRole() + "\n" 
                         + "Gaji karyawan \t\t: " + pekerjaan.getGaji() + "\n" 
                         + "Saldo karyawan \t\t: " + bank.getSaldo() + "\n" );

    }

}
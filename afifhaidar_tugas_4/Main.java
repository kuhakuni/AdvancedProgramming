/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Main {
   public static void main(String[] args) {
        Bank bank = new Bank("BCA", 0);
        Pekerjaan pekerjaan = new Pekerjaan("Kuli", 100000);
        Rumah rumah = new Rumah("Malang", 200000, Rumah.TIPE_BESAR);
        Karyawan karyawan1 = new Karyawan(bank, pekerjaan, rumah, "Sam", 30);
        karyawan1.cetak();
        System.out.println("=======");
        System.out.println("Setelah bekerja 10 jam: ");
        karyawan1.kerja(10);
        karyawan1.cetak();

        System.out.println("=======");
        System.out.println("Jumlah pajak yang harus dibayarkan per bulan adalah : " + Karyawan.hitungPajak(karyawan1, 1));
   }  
}

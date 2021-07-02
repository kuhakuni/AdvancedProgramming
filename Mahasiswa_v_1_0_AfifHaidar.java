/*
Tugas Mahasiswa_v_1_0
Nama    : Afif Haidar Prajaputra
NIM     : 205150400111049
*/

import java.util.Scanner;

class DemoMahasiswa{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("=============\n"
                         + "Mahasiswa v1.0\n"
                         + "=============\n");

        //===INPUT===
        System.out.println("Masukkan data mahasiswa berikut:");

        System.out.print("Nama: ");
        mhs.nama = scan.nextLine();

        System.out.print("NIM: ");
        mhs.nim = scan.nextLong();

        System.out.print("Tahun masuk: ");
        mhs.tahunMasuk = scan.nextInt();

        scan.nextLine();

        System.out.print("Program Studi: ");
        mhs.prodi = scan.nextLine();

        //===OUTPUT===
        System.out.println("\nData mahasiswa:");
        System.out.println("Nama: " +mhs.nama
                         + "\nNIM: " +mhs.nim
                         + "\nTahun masuk: " + mhs.tahunMasuk
                         + "\nProgram Studi: " +mhs.prodi);
        scan.close();
    }
}

class Mahasiswa{
    String nama, prodi;
    long nim;
    int tahunMasuk;
}
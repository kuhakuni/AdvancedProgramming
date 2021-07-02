/*
Tugas MainLingkaran_v_0_1
Nama    : Afif Haidar Prajaputra
NIM     : 205150400111049
*/

import java.util.Scanner;

class MainLingkaran_v_0_1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double pi = Math.PI;

        //==JUDUL==
        System.out.println("*********************\n"
                         + "Main Lingkaran v0.1\n"
                         + "*********************\n");

        //==INPUT==
        System.out.print("Masukkan radius lingkaran (m): ");
        double radius = scan.nextDouble();

        //==PROSES==
        double luasLingkaran = pi * Math.pow(radius, 2);
        double kelilingLingkaran = 2 * pi * radius ;

        //==OUTPUT==
        System.out.printf("Luas lingkaran tersebut (m2): %.2f %n", luasLingkaran);
        System.out.printf("Keliling lingkaran tersebut (m): %.2f %n", kelilingLingkaran);

        scan.close();
    }
}
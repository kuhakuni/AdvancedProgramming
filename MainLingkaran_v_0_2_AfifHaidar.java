/*
Tugas MainLingkaran_v_0_2
Nama    : Afif Haidar Prajaputra
NIM     : 205150400111049
*/

import java.util.Scanner;
class MainLingkaran_v_0_2{
    static final double pi = Math.PI;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
	//==JUDUL==
        System.out.println("*********************\n"
                         + "Main Lingkaran v0.2\n"
                         + "*********************\n");

        //==INPUT==
        System.out.print("Masukkan radius lingkaran (m): ");
        double radius = scan.nextDouble();

        //==OUTPUT==
        System.out.printf("Luas lingkaran tersebut (m2): %.2f %n", hitungLuasLingkaran(radius));
        System.out.printf("Keliling lingkaran tersebut (m): %.2f %n", hitungKelilingLingkaran(radius));

        scan.close();
    }

    public static double hitungLuasLingkaran(double radius){
        double luasLingkaran = pi * Math.pow(radius, 2);
        return luasLingkaran;
    }

    public static double hitungKelilingLingkaran(double radius){
        double kelilingLingkaran = 2 * pi * radius;
        return kelilingLingkaran;
    }
}
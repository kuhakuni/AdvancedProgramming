/*
Tugas MainLingkaran_v_0_3
Nama    : Afif Haidar Prajaputra
NIM     : 205150400111049
*/

import java.util.Scanner;

class MainLingkaran_v_0_3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lingkaran circle = new Lingkaran();
        
        //==JUDUL==
        System.out.println("*********************\n"
                         + "Main Lingkaran v0.3\n"
                         + "*********************\n");

        //==INPUT==
        System.out.print("Masukkan radius lingkaran (m): ");
        double radius = scan.nextDouble();

        //SET RADIUS
        circle.setRadius(radius);

        //==OUTPUT==
        System.out.printf("Luas lingkaran tersebut (m2) : %.2f %n", circle.getLuasLingkaran());
        System.out.printf("Keliling lingkaran tersebut (m) : %.2f %n", circle.getKelilingLingkaran());

        scan.close();
    }

}
class Lingkaran{
    private double radius;
    private final double pi = Math.PI;

    void setRadius(double r){
        radius = r;      
    }

    double getLuasLingkaran(){
        double luasLingkaran = pi * Math.pow(radius, 2);
        return luasLingkaran;
    }

    double getKelilingLingkaran(){
        double kelilingLingkaran =  2 * pi * radius;
        return kelilingLingkaran;
    }
}
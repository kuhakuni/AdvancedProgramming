package AfifHaidar_Tugas_2;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */

public class Mesin {
    private int bil1;
    private double bil2;
    
    //==CONSTRUCTOR 1==
    public Mesin(){
        bil1 = 10;
        bil2 = 9.5;
        System.out.println("Mesin dibuat dengan constructor 1");
    }

    //==CONSTRUCTOR 2==
    public Mesin(int bil1){
        this.bil1 = bil1;
        bil2 = 5.5;
        System.out.println("Mesin dibuat dengan constructor 2");
    }

    //==CONSTRUCTOR 3==
    public Mesin(double bil2){
        bil1 = 10;
        this.bil2 = bil2;
        System.out.println("Mesin dibuat dengan constructor 3");
    }

    //==CONSTRUCTOR 4==
    public Mesin(int bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
        System.out.println("Mesin dibuat dengan constructor 4");
    }

    //==CONSTRUCTOR 5==
    public Mesin(int bil1, int bil2, double bil3){
        this.bil1 = bil1 + bil2;
        this.bil2 = bil2;
        System.out.println("Mesin dibuat dengan constructor 5");
    }

    //==METHOD JUMLAH BIL1 DENGAN INPUT==
    public int hitung(int input){
        return bil1 + input;
    }

    //==METHOD JUMLAH PERKALIAN BIL1 DENGAN BIL2==
    public double hitung(){
        return bil1 * bil2;
    }

    //==METHOD JUMLAH DARI ARRAY DENGAN BIL1==
    public int hitung(int[] array){
        int sumOfArray = 0;

        //==MENGGUNAKAN FOR LOOP UNTUK MENENTUKAN JUMLAH DARI SELURUH ELEMEN ARRAY==
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }

        return sumOfArray + bil1;
    }

    public void getAllData(){
        System.out.println("Bil 1   : " + bil1
                         +" Bil 2   : " + bil2 );
    }

    public int getBil1(){
        return bil1;
    }

    public double getBil2(){
        return bil2;
    }
}

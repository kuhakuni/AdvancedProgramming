package AfifHaidar_Tugas_2;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */

public class Main {
    public static void main(String[] args) {
        Mesin mesin1 = new Mesin();
        Mesin mesin2 = new Mesin(1);
        Mesin mesin3 = new Mesin(2.5);
        Mesin mesin4 = new Mesin(2, 5.5);
        Mesin mesin5 = new Mesin(1, 2, 3.4);

        int input1 = 20;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(mesin3.hitung(input1));
        System.out.println(mesin4.hitung());
        System.out.println(mesin5.hitung(array));
    }
}

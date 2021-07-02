package afifhaidar_tugas6;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Main {
    public static void main(String[] args) {
       Yamaha yamaha1 = new Yamaha(2, 120);
       System.out.println(yamaha1);
       yamaha1.bergerak();
       yamaha1.gantiMesin();
       yamaha1.detectPotHole();

       Tesla tesla1 = new Tesla(4, 6);
       System.out.println("\n"+tesla1);
       tesla1.bergerak();
       tesla1.gantiMesin();
       tesla1.detectPotHole();

       Jazz jazz1 = new Jazz(4, 4);
       System.out.println("\n"+jazz1);
       jazz1.bergerak();
       jazz1.gantiMesin();
    }
}

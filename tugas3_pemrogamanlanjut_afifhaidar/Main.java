package tugas3_pemrogamanlanjut_afifhaidar;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("===========\n" 
                        +  "PROGRAM TELEVISI v0.1\n" 
                        +  "BY AFIF HAIDAR\n" 
                        +  "===========\n");

        System.out.print("Silahkan tulis merk tv anda : ");
        String merkTv = scan.next();

        Televisi televisi = new Televisi(merkTv);

        System.out.print("\nBerikut merupakan channel yang tersedia :\n" 
                        +  "1. Disnep+ \n" 
                        +  "2. Netglix \n" 
                        +  "3. MNP \n" + "4. SCTI \n" 
                        +  "5. RCTV \n" 
                        +  "====================== \n" 
                        +  "Silahkan pilih channel favorit anda : ");
        Televisi.setChannel(scan.nextInt());
        
        System.out.println("\nBaik, anda memilih channel " + Televisi.getChannel() + " pada tv bermerk " + televisi.getBrand());

        
        ubahVolume();

        System.out.println("\nBaik, berikut deskripsi televisi anda : \n" 
                        +  "Merk \t\t: " + televisi.getBrand() + "\n" 
                        +  "Channel \t: " + Televisi.getChannel() + "\n" 
                        +  "Volume \t\t: " + Televisi.getVolume() +"\n" 
                        +  "=======================================\n" 
                        + "Selamat menyaksikan!" );
    }
    
    public static void ubahVolume(){
        boolean kondisi = true;
        while (kondisi) {
           System.out.println("Saat ini volume sedang di-set pada angka " + Televisi.getVolume() +"\n"
                            + "Apakah anda nyaman dengan volume tv saat ini? (Y/N)");
           char ubahVolume = scan.next().charAt(0);

           switch (ubahVolume) {
               
                case 'Y':
                    kondisi = false;
                    break;

                case 'N' :
                    System.out.println("Tekan 1 untuk menambah volume atau tekan 2 untuk mengurangi volume.");
                    char pilihanVolume = scan.next().charAt(0);

                    switch (pilihanVolume) {

                        case '1' :
                            Televisi.turnUpVolume();
                            break;

                        case '2' : 
                            Televisi.turnDownVolume();
                            break;
                    }
                    break;
           } 
        }
    }
}
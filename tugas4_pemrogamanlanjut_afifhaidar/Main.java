package tugas4_pemrogamanlanjut_afifhaidar;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //==CETAK JUDUL==
        System.out.println("**********************\n"
        +  "Cellphone Demo v2.0\n" 
        +  "**********************\n");
        
        //==INPUT JUMLAH PONSEL==
        System.out.print("Berapakah jumlah ponsel yang akan diproduksi? ");
        int jumlahPonsel = scan.nextInt();
        
        //==ARRAY UNTUK MENYIMPAN TIPE PONSEL==
        String[] arrayOfType = new String[jumlahPonsel];
        

        System.out.print("Isian data\n" 
                      +  "----------------\n" );
        
        //==MENGGUNAKAN FOR LOOP UNTUK INPUT TIPE SESUAI JULAH ARRAY==
        for (int i = 0; i < jumlahPonsel; i++) {
            System.out.print("Ponsel ke-" + (i+1) + ":\n" 
                          +  "Tipe: ");
            arrayOfType[i] = scan.next();
        }

        //==MENGESET TIPE CELLPHONE DENGAN ARRAY YANG TELAH DIBUAT==
        Cellphone.setType(arrayOfType);

        System.out.println("\nLaporan" 
                        +  "\n-------------"); 

        //==MENGGUNAKAN FOR LOOP UNTUK MENCETAK DATA PONSEL==
        for (int j = 0; j < jumlahPonsel; j++) {
            System.out.println("Ponsel ke-" + (j+1) + ":\n" 
                            +  "ID: " + Cellphone.getId() + "\n"
                            +  "Tipe: " + Cellphone.getType()[j]);

            //==MENAMBAH NILAI ID SETELAH MEMBUAT PONSEL BARU==
            Cellphone.setId();
        }

        scan.close();
    }

}

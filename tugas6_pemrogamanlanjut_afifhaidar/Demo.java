package tugas6_pemrogamanlanjut_afifhaidar;

import java.util.Scanner;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone[] phones;
        int numberOfPhones;
        String type;

        System.out.println("*******************\n"
                        +  "CellPhone Demo v3.0\n"
                        +  "*******************\n");

        System.out.print("Berapakah jumlah ponsel yang akan diproduksi? ");
        numberOfPhones = Integer.parseInt(input.nextLine());

        phones = new CellPhone[numberOfPhones];

        for (int i = 0; i < phones.length; i++) {
            
            System.out.print("Ponsel ke-" + (i+1) + ":\n" 
                          +  "Tipe: ");
            
            type = input.nextLine();
            
            phones[i] = new CellPhone(type, 0);
        }

        System.out.println("\nLaporan" 
                        +  "\n-------------"); 
                        
        for (int j = 0; j < numberOfPhones; j++) {
            System.out.println("Ponsel ke-" + (j+1) + ":\n" 
                            +  "ID: " + phones[j].getId() + "\n"
                            +  "Tipe: " + phones[j].getType());
        }

    }

}

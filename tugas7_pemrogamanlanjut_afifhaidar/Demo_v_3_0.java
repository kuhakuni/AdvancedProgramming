package tugas7_pemrogamanlanjut_afifhaidar;

import java.util.Scanner;

public class Demo_v_3_0 {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      CellPhone[] phones;
      int numberOfPhones;
      String inputString;
      Employee emp1;

      System.out.println("*******************\n"
              + "CellPhone Demo v3.0\n"
              + "*******************\n");
      
      // Pemasukan data banyaknya ponsel yang akan dibeli oleh perusahaan
      // dan pembuatan objek kontainer yang nanti akan diisi oleh 
      // sejumlah referensi objek ponsel yang akan dibeli
      System.out.print("How many cellphones will our company buy? ");

      numberOfPhones = Integer.parseInt(input.nextLine());
      phones = new CellPhone[numberOfPhones];
      
      // Pemasukan data deskripsi setiap ponsel yang akan dibeli
      System.out.println("\nOrder list\n==========");
      for (int i = 0; i < phones.length; i++) {
         System.out.printf("Cellphone no: %d %n   Type: ", (i+1) );
         phones[i] = new CellPhone(input.nextLine());
      }

      // Pencetakan ke layar monitor deskripsi setiap ponsel yang dipesan 
      System.out.println("\nOrdered cellphones\n================");
      for (int i = 0; i < phones.length; i++) {
         System.out.printf("Cellphone no %d: %n%s %n" ,(i+1), phones[i].getDescription());

      }

      // Pemasukan data deskripsi seorang karyawan baru yang 
      // akan diberi sebuah ponsel
      System.out.println("Please enter the details of a new employee:");

      emp1 = new Employee();
      System.out.print(" Name: ");
      emp1.setName(input.nextLine());

      
      // Pencetakan ke layar monitor deskripsi karyawan baru tersebut
      System.out.println("Description of the new employee:");
      System.out.println(emp1.getDescription());
     
      // Pemberian sebuah ponsel kepada karyawan baru dilakukan dengan cara 
      // mengambilnya dari daftar ponsel yang sudah dibeli. 
      // Ponsel yang akan diberikan itu dapat dipilih dengan mencarinya dari 
      // daftar ponsel berdasarkan ID-nya. 
      // Setelah ID ponsel yang dicari telah dimasukkan, 
      // pencarian ponsel telah dilakukan, dan ponsel yang dicari sudah ditemukan, 
      // deskripsi karyawan terkait ponsel itu harus diperbarui dan 
      // deskripsi ponsel terkait karyawan tersebut juga harus diperbarui.
      System.out.print("Please enter an ID of a cellphone for the new employee: ");

      inputString = input.nextLine();
      
      for (int i = 0; i < phones.length; i++) {
         if(inputString.equals(phones[i].getId())){
            phones[i].setOwner(emp1);
            emp1.addPhone(phones[i]);
            break;
         }
      }

      // Pencetakan ke layar monitor deskripsi karyawan baru tersebut
      System.out.println("Description of the new employee:");
      System.out.println(emp1.getDescription());

   }

}

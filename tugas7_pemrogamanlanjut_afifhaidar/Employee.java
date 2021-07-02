package tugas7_pemrogamanlanjut_afifhaidar;

public class Employee {

   private String id;
   private String name;
   private CellPhone[] phones;
   private static int counter = 1;

   public Employee() {
      this.id = "EM" + Employee.counter;
      this.phones = new CellPhone[5];
      Employee.counter++;
   }

   public void addPhone(CellPhone phone) {
      for (int i = 0; i < phones.length; i++) {
         if (phones[i] == null) {
            phones[i] = phone;
            break;
         }
      }
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public CellPhone[] getPhones() {
      return phones;
   }

   public void setPhones(CellPhone[] phones) {
      this.phones = phones;
   }

   public String getDescription() {
      String fullDescription, phoneDescription;
      if (phones == null || phones[0] == null) {
         phoneDescription = "Not available";
      } else {
         phoneDescription = "\n";
         for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
               phoneDescription += "   Phone no " + (i + 1)
                       + "\n" + phones[i].getDescription();
            }
         }
      }
      fullDescription = " ID: " + this.id
                     + "\n Name: " + this.name
                     + "\n Owned cellphones: " + phoneDescription + "\n";
      return fullDescription;
   }
}

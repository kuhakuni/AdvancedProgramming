package tugas7_pemrogamanlanjut_afifhaidar;

public class CellPhone {

   private String id;
   private String type;
   private int volumeLevel;
   private Employee owner;
   static private int counter = 1;

   public CellPhone() {
      this.id = "CP" + CellPhone.counter;
      CellPhone.counter++;
   }

   public CellPhone(String type) {
      this.id = "CP" + CellPhone.counter;
      this.type = type;
      CellPhone.counter++;
   }

   public CellPhone(String type, int volume) {
      this.id = "CP" + CellPhone.counter;
      this.type = type;
      volumeLevel = volume;
      CellPhone.counter++;
   }

   public CellPhone(String type, int volume, Employee owner) {
      this.id = "CP" + CellPhone.counter;
      this.type = type;
      this.owner = owner;
      volumeLevel = volume;
      CellPhone.counter++;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   static int getCounter() {
      return counter;
   }

   // getter or accesor
   public String getType() {
      return type;
   }

   // getter or accesor
   public int getVolumeLevel() {
      return volumeLevel;
   }

   public void turnUpVolume(int vol) {
      volumeLevel += vol;
   }

   public void turnDownVolume(int vol) {
      volumeLevel -= vol;
   }

   public void setType(String tp) {
      type = tp;
   }

   public Employee getOwner() {
      return owner;
   }

   public void setOwner(Employee owner) {
      this.owner = owner;
   }

   public String getDescription() {
      String description, ownersName;
      if (owner != null) {
         ownersName = owner.getName();
      } else {
         ownersName = "Not available";
      }
      description = "   ID: " + id
              + "\n   Type: " + type
              + "\n   Volume level: " + volumeLevel
              + "\n   Owner name: " + ownersName + "\n";
      return description;
   }

}

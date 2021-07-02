package tugas6_pemrogamanlanjut_afifhaidar;

/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class CellPhone {
    private int id;
    private String type;
    private int volumeLevel;
    private static int newId = 100;
    
    public CellPhone() {
        this.id = newId++;
        this.type = null;
        this.volumeLevel = 0;
    }
 
    public CellPhone(String type, int volumeLevel) {
        this.id = newId++;
        this.type = type;
        this.volumeLevel = volumeLevel;
    }
 
    // getter or accesor
    public int getId() {
       return id;
    }
 
    // getter or accesor
    public String getType() {
       return type;
    }
 
    // getter or accesor
    public int getVolumeLevel() {
       return volumeLevel;
    }
 
    public void turnUpVolume(int volumeIncrease) {
       this.volumeLevel += volumeIncrease;
    }
 
    public void turnDownVolume(int volumeDecrease) {
       volumeLevel -= volumeDecrease;
    }
 
    public void setType(String type) {
       this.type = type;
    }
}

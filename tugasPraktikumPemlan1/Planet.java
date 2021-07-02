
public class Planet {
    private String nama;
    private double jarak;

    public Planet(String nama, double jarak){
        this.nama = nama;
        this.jarak = jarak;
    }

    public void setNama(String namaBaru){
        nama = namaBaru;
    }
    
    public String getNama(){
        return nama;
    }

    public void setJarak(double jarakBaru){
        jarak = jarakBaru;
    }

    public double getJarak(){
        return jarak;
    }
} 

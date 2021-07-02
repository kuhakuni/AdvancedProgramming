
public class Rocket {
    private String nama;
    private int tinggi;
    private int berat;
    private int harga;
    private Planet planetTujuan;

    public Rocket(String nama, int tinggi, int berat, int harga){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
        this.harga = harga;
    }
    
    public String getNama(){
        return nama;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int getBerat(){
        return berat;
    }

    public void setHargaRoket(double jarak, int harga){
        
        if (jarak<= 4) {
            this.harga = harga;
        } 

        else if (jarak>4 && jarak<=10) {
            this.harga*=1.5;
        }
        
        else{
            this.harga*=3;
        }
    }

    public int getHarga(){
        return harga;
    }

    public void setPlanet(Planet planetTujuan){
        this.planetTujuan = planetTujuan;
    }

    public Planet getPlanet(){
        return planetTujuan;
    }

    

}

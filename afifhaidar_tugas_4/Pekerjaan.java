/**
 * 
 *  Nama    : Afif Haidar Prajaputra
 *  NIM     : 205150400111049
 */
public class Pekerjaan {
    // Pekerjaan memiliki role dan gaji
    private String role;
    private double gaji;

    public Pekerjaan(String role, double gaji){
        this.role = role;
        this.gaji = gaji;
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }

    public double getGaji(){
        return this.gaji;
    }

}

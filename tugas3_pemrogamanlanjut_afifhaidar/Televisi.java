package tugas3_pemrogamanlanjut_afifhaidar;

public class Televisi {
    private String brand;
    private static int volume;
    private static int channel;

    public Televisi(String brand){
        this.brand = brand;
        Televisi.volume = 5;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public static void setChannel(int channel){
        Televisi.channel = channel;
    }

    public static String getChannel(){
        switch (Televisi.channel) {
            case 1:
                return "Disnep+";

            case 2:
                return "Netglix";

            case 3:
                return "MNP";

            case 4:
                return "SCTI";

            case 5:
                return "RCTV";

            default:
                return "==Channel Tidak Tersedia==";
        }
    }

    public static void turnUpVolume(){
        Televisi.volume++;
    }

    public static void turnDownVolume(){
        if(Televisi.volume <= 0){
            Televisi.volume = 0;
        }

        else{
            Televisi.volume--;
        }
    }

    public static int getVolume(){
        return Televisi.volume;
    }
}

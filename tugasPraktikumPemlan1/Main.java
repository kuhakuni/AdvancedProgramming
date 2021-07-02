
public class Main {
    public static void main(String[] args) {

        //==SET DATA AWAL ROKET
        Rocket rocket = new Rocket("Fulcan 9", 50, 20, 20000000);
        
        //==DEKLARASI NAMA PLANET MENGGUNAKAN ARRAY==
        Planet[] arrayOfPlanet = new Planet[3];

        arrayOfPlanet[0] = new Planet("nibiru", 4);
        arrayOfPlanet[1] = new Planet("murag", 7.5);
        arrayOfPlanet[2] = new Planet("nemak", 12);

        //==CETAK DATA ROKET
        System.out.println("SpaceY Mission\n"
                         + "Roket bernama " + rocket.getNama() + " "
                         + "telah dibuat dengan tinggi " + rocket.getTinggi() + " meter, "
                         + "berat " + rocket.getBerat() + " ton, "
                         + "dan harga " + rocket.getHarga());

        //==MENGGUNAKAN FOR UNTUK MENCETAK SESUAI JUMLAH ARRAY==
        for (int i = 0; i < arrayOfPlanet.length; i++) {

            //==SET HARGA ROKET YANG BARU==
            rocket.setHargaRoket(arrayOfPlanet[i].getJarak(), rocket.getHarga());
            
            //==CETAK DATA PLANET==
            System.out.println("Planet bernama " + arrayOfPlanet[i].getNama() + " "
                             + "ditemukan dengan jarak " + arrayOfPlanet[i].getJarak() + " dari bumi" );
            
            //==CETAK DATA ROKET SERTA HARGA YANG BARU== 
            System.out.println("Roket " + rocket.getNama() + " " 
                             + "memiliki harga " + rocket.getHarga());
        }
    }
}

package tugas4_pemrogamanlanjut_afifhaidar;

public class Cellphone {
    private static int id = 100;
    private static String[] type;

    public static void setId(){
        Cellphone.id++;
    }

    public static int getId(){
        return Cellphone.id;
    }

    public static void setType(String[] type){
        Cellphone.type = type;
    }

    public static String[] getType(){
        return Cellphone.type;
    }
}

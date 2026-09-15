import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("East Blue");
        lista.add("Alabasta");
        lista.add("Water 7");

        for(String s : lista){
            System.out.println(s);
        }

    }
}
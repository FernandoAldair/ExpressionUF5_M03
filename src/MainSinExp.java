import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;

public class MainSinExp {
    public static void main(String[] args) throws IOException {

        String l1;

        FileReader fr = new FileReader("santako.txt");

        BufferedReader br = new BufferedReader(fr);

        l1= br.readLine();

        String santa = "*<]:-DOo";
        String renos = ">:o)";
        String elfo = "<]:-D";


        int contadorS = 0;
        int contadorR = 0;
        int contadorA = 0;
        int conLinea = 1;

        while (l1 != null){
            String linea ="Linea("+conLinea+")";
            System.out.println(linea);

            if (l1.indexOf(santa) != -1){
                contadorS++;
                System.out.println("Santa:"+contadorS);
            }

            if (l1.indexOf(renos) != -1){
                contadorR++;
                System.out.println("Renos:"+contadorR);
            }


            if (l1.indexOf(elfo) != -1){
                contadorA++;
                System.out.println("Esclavos:"+contadorA);
            }

            l1= br.readLine();
            conLinea++;
            System.out.println("-----------------------");
        }
    }
}

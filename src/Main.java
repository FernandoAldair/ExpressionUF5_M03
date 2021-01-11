import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

//        String linea = "El blau (del germànic 'blau') es un del tres color primaris additius. Es considera un color fred";
//
//        Pattern pattern = Pattern.compile("blau");
//        Matcher matcher = pattern.matcher(linea);
//
//        int contador = 0;
//
//        while (matcher.find()){
//            contador++;
//        }
//        System.out.println(contador);

        //----------

        Scanner scanner = new Scanner(System.in);
        String l1;
        String l2;

        FileReader fr = new FileReader("santako.txt");

        BufferedReader br = new BufferedReader(fr);

        l1= br.readLine();

        Pattern psanta = Pattern.compile("[*]<]:-DOo");
        Pattern prenos = Pattern.compile(">:o[)]");
        Pattern payuda = Pattern.compile(">:o*[)]");

















    }
}

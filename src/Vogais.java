import java.text.Normalizer;
import java.util.Scanner;

public class Vogais {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a frase ou palavra para ser verificar a quantidade de vogais e consoantes:");
        String texto = scanner.nextLine();

        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        String textoLimpo = semAcento.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for(char c : textoLimpo.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                vogais++;
            }else{
                consoantes++;
            }
        };

        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de consoantes: " + consoantes);

    }
}

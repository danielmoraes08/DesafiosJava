import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a frase ou palavra para ser verificada: ");
        String texto = scanner.nextLine();

        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
        String textoLimpo = semAcento.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertido = new StringBuilder(textoLimpo).reverse().toString();

        String resultado = textoLimpo.equals(invertido) ? "É um palíndromo" : "Não é um palíndromo";
        System.out.println(resultado);

        scanner.close();
    }
}
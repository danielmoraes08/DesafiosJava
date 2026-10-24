public class ImparParArray {
    static void main() {
        int[] numeros = {2,39,95,5,64,75,24,57,83,28,38};
        int par = 0;
        int impar = 0;
        for(int i : numeros){
            if (i % 2 == 0){
                par++;
            } else{
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
    }
}

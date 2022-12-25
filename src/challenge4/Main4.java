package challenge4;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd_iteracoes = sc.nextInt();

        for (int i = 0; i <= qtd_iteracoes; i++) {
            String texto = sc.nextLine();
            //System.out.println("Texto Original = " + texto);
            String textoCorreto = "";
            for (int j = (texto.length()/2) - 1; j >= 0 ; j--) {
                textoCorreto += texto.charAt(j);
            }

            for (int t = texto.length() - 1; t >= (texto.length()/2); t--) {
                textoCorreto += texto.charAt(t);
            }
            System.out.println(textoCorreto);
        }
    }
}

package challenge3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ArraySizes = sc.nextInt();
        int valorAlvo = sc.nextInt();

        int[] values = new int[ArraySizes];
        int paresCertos = 0;

        for (int i = 0; i < ArraySizes; i++) {
            values[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < ArraySizes; i++) {
            for (int j = 0; j < ArraySizes; j++) {
                if (values[j] - values[i] == valorAlvo) {
                    paresCertos++;
                }
            }
        }

        System.out.println(paresCertos);
    }
}
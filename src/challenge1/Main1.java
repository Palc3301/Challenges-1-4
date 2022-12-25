package challenge1;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> par 	= new ArrayList<>();

        System.out.println("Digite quantos números serão informados: ");

        int n = sc.nextInt();
        for (int i=0 ; i<n ; i++)
            lista.add(sc.nextInt());

        for (Integer x: lista){
            if (x % 2==0)
                par.add(x);
            else
                impar.add(x);
        }

        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);

        //System.out.println("Os número pares em ordem crescente são: ");
        for (Integer y : par)
            System.out.println(y);

        //System.out.println("Os número impares em ordem decrescente são: ");
        for (Integer z: impar)
            System.out.println(z);

        System.out.println("Finish!");

        sc.close();
    }
}

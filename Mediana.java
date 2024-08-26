import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> nMediana = new ArrayList<>();
        String again;
        

        do {
            System.out.print("digite um numero: ");
            double num = teclado.nextDouble();
            nMediana.add(num);

            System.out.print("deseja inserir outro numero? (S/N): ");
            again = teclado.next().trim();
        } while (again.equalsIgnoreCase("S"));


        Collections.sort(nMediana);


        double mediana;
        int size = nMediana.size();
        
        if (size % 2 == 1) {
            mediana = nMediana.get(size / 2);
        } else {
            mediana = (nMediana.get(size / 2 - 1) + nMediana.get(size / 2)) / 2.0;
        }

        System.out.println("a mediana é: " + mediana);
    }
}

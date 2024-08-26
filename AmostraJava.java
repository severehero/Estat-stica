import java.util.ArrayList;
import java.util.Scanner;

public class AmostraJava {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> amostra = new ArrayList<>();
        double itensAmostra;
        String again;
        String correct;
        
        do {
            System.out.println("digite o numero da amostra:");
            itensAmostra = teclado.nextDouble();
            System.out.println("você digitou: " + itensAmostra);
            System.out.println("você digitou um numero errado? (S/N)");
            correct = teclado.next().trim();
            if (correct.equalsIgnoreCase("N")) {
                System.out.println("joia");
            } else {
                System.out.println("corrija o numero.");
                itensAmostra = teclado.nextDouble();
            }
            amostra.add( itensAmostra);
            System.out.println("tem mais algum numero da amostra? (S/N)");
            again = teclado.next().trim();
        } while (again.equalsIgnoreCase("S"));

        double sum = 0.0; 
        for (Double num : amostra) {
            sum += num;
        }
        double valorAmostra = amostra.size() > 0.0 ? sum / amostra.size() : 0.0;

        System.out.println("o valor da amostra é: " + valorAmostra);
    }
}

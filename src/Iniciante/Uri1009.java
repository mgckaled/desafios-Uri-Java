package Iniciante;

import java.util.Locale;
import java.util.Scanner;

  // Salário com Bônus

public class Uri1009 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        String name = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double totalSalario = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$%.2f%n",totalSalario );

        input.close();

    }
}

package Iniciante;

import java.util.Locale;
import java.util.Scanner;

 // Area do Circulo

public class Uri1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double area = pi * Math.pow(raio, 2);

        // printf mostra o valor formatado
        // %n -> quebra de linha
        System.out.printf("A=%.4f%n",  area );

        input.close();
    }
}

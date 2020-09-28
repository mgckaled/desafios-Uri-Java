package Iniciante;

// URL: https://www.urionlinejudge.com.br/judge/pt/problems/view/1020
import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dias = input.nextInt();

        int ano = dias / 365;
        int sobraAno = dias % 365;
        int mes = sobraAno / 30;
        int sobraMes = sobraAno % 30;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(sobraMes + " dia(s)");

    }
}

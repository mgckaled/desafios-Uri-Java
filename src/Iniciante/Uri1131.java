package Iniciante;

// URL: https://www.urionlinejudge.com.br/judge/pt/problems/view/1131
import java.util.Scanner;

public class Uri1131 {
    public static void main(String[] args) {

        int golsInter, golsGremio;
        int resposta;
        int vitInter = 0, vitGremio = 0 , empates = 0;

        Scanner input = new Scanner(System.in);

        do {
            golsInter = input.nextInt();
            golsGremio = input.nextInt();
            resposta = input.nextInt();

            // Se o Inter Ganhar
            if (golsInter > golsGremio) {
                vitInter++;
            // Se o Grêmio Ganhar
            } else if ( golsGremio > golsInter ) {
                vitGremio++;
            // Caso de Empate
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");

        } while (resposta !=2);
        // impressão das imformações
        System.out.println(vitInter + vitGremio + empates + " grenais");
        System.out.println("Inter: " + vitInter);
        System.out.println("Grêmio: " + vitGremio);
        System.out.println("Empates: " + empates);

        if (vitInter > vitGremio)
            System.out.println("Inter venceu mais");
        else if (vitGremio > vitInter)
            System.out.println("Grêmio venceu mais");
        else
            System.out.println("Nao houve vencedor");
    }
}

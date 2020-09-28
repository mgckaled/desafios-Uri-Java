package Iniciante;

// Sequência S
// Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
// S = 1 + 1/2 + 1/3 + … + 1/100

public class Uri1155 {
    public static void main(String[] args) {

        // chamada da função
        // formatar impressão para 2 casas decimais depois da virgula
        System.out.printf("%.2f\n",sequanciaRecursiva(1));
    }

    public static float sequanciaRecursiva(float n) {
        // enquanto for menor que 100
        if (n < 100) {
            // retorno da soma das sequencias
            return 1/n + sequanciaRecursiva(n+1);
        } else {
            return 1/n;
        }
    }
}

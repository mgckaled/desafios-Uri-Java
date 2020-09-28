package Iniciante;

// URL: https://www.urionlinejudge.com.br/judge/pt/problems/view/1155
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

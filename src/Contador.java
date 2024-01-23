import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Criando objeto scanner
        Scanner scanner = new Scanner(System.in);

        // Loop para caso ocorra uma Exception o usuário deverá inserir novamente os entradas até que atenda os requisitos
        while (true) {
            System.out.println("Digite o Primeiro parâmetro:");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);
                break;
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!");

            }
        }

    }

    // Método para validação dos parâmetros e imprimir os números da contagem
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
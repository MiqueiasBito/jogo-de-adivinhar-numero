import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao Jogo de Adivinhar!!");
        System.out.println("===================REGRAS===================");
        System.out.println("O jogo funciona assim, o computador pensou\nem um número de 1 a 100, e o jogador tem um\nnúmero limitado de chances, conforme a dificuldade.");

        Scanner leitor = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("1. Fácil (10 chances)");
        System.out.println("2. Médio (5 chances)");
        System.out.println("3. Difícil (3 chances");
        System.out.println("0. Sair");

        System.out.println("==============================================");

        System.out.println("Digite um número para selecionar a dificuldade desejada: ");

        int numDificuldade = leitor.nextInt();

        int chances;

        switch (numDificuldade) {
            case 1 -> {
                chances = 10;
                System.out.println("Nível fácil escolhido.");
            }
            case 2 -> {
                chances = 5;
                System.out.println("Nível médio escolhido.");
            }
            case 3 -> {
                chances = 3;
                System.out.println("Nível difícil escolhido.");
            }
            case 0 -> {
                System.out.println("Até a próxima!");
                return;
            }
            default -> {
                chances = 5;
                System.out.println("Nível inválido. Escolha do nível médio como padrão.");
            }
        }

        System.out.println("Você tem " + chances + " chances");
    }
}
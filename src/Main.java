import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        do {
            mostrarBoasVindas();                          // regras e menu
            int chances = escolherDificuldade(leitor);    // devolve 10, 5, 3 ou 0

            if (chances == 0) {                           // 0 = jogador escolheu sair
                leitor.close();
                return;                                   // encerra o programa
            }

            jogar(leitor, chances);                       // a partida inteira
        } while (querJogarDeNovo(leitor));

        System.out.println(" Obrigado por jogar! Até a próxima. ");
        leitor.close();
    }

    static void mostrarBoasVindas() {
        System.out.println("+------------------------------------------+");
        System.out.println("|         JOGO DE ADIVINHAR NÚMERO         |");
        System.out.println("+------------------------------------------+");
        System.out.println();                                          // linha em branco
        System.out.println("  Pensei em um número de 1 a 100.");
        System.out.println("  Você terá um número limitado de chances,");
        System.out.println("  conforme a dificuldade escolhida.");
        System.out.println();
        System.out.println("  Escolha a dificuldade:");
        System.out.println();
        System.out.println("    [1] Fácil    - 10 chances");
        System.out.println("    [2] Médio    -  5 chances");
        System.out.println("    [3] Difícil  -  3 chances");
        System.out.println("    [0] Sair");
        System.out.println();

        System.out.print("Escolha um número para dificuldade desejada -> ");
    }

    static int escolherDificuldade(Scanner leitor) {
        int numDificuldade = leitor.nextInt();

        int chances;

        switch (numDificuldade) {
            case 1 -> {
                chances = 10;
                System.out.println();
                System.out.println("  Nível Fácil: você tem " + chances + " chances. ");
                return chances;
            }
            case 2 -> {
                chances = 5;
                System.out.println();
                System.out.println("  Nível Médio: você tem " + chances + " chances. ");
                return chances;
            }
            case 3 -> {
                chances = 3;
                System.out.println();
                System.out.println("  Nível Difícil: você tem " + chances + " chances. ");
                return chances;
            }
            case 0 -> {
                System.out.println();
                System.out.println(" Até a próxima! ");
                return 0;
            }
            default -> {
                chances = 5;
                System.out.println();
                System.out.println(" Nível inválido. Escolha do nível médio definido como padrão. ");
                return chances;
            }
        }
    }

    static int sortearNumero() {
        return (int) (Math.random() * 100) + 1;       // de 1 a 100
    }

    static void jogar(Scanner leitor, int chances) {
        int numAleatorio = sortearNumero();
        int numUsuario;
        int contadorTentativas = 0;

        System.out.println();
        System.out.println("  Pensei em um número entre 1 e 100. ");
        System.out.println("  Tente adivinhar! ");

        do {
            System.out.println();                  // separa cada rodada da anterior
            System.out.print("  Seu palpite -> ");
            numUsuario = leitor.nextInt();
            contadorTentativas++;

            if (numUsuario < numAleatorio) {
                System.out.println("↑ O número é maior. Restam " + (chances - contadorTentativas) + " chances! ");
            } else if (numUsuario > numAleatorio) {
                System.out.println("↓ O número é menor. Restam " + (chances - contadorTentativas) + " chances! ");
            }
        } while (numUsuario != numAleatorio && contadorTentativas < chances);

        if (numUsuario == numAleatorio) {
            System.out.println();
            System.out.println("  ★ Parabéns! Você acertou em " + contadorTentativas + " tentativas! ");
        } else {
            System.out.println();
            System.out.println(" Infelizmente você não acertou!! Mais sorte na próxima vez. ");
            System.out.println(" O número era " + numAleatorio + " ");
        }
    }

    static boolean querJogarDeNovo(Scanner leitor) {
        System.out.print(" Jogar de novo? (s/n) -> ");
        String resposta = leitor.next();
        return resposta.equalsIgnoreCase("s");
    }
}
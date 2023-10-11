import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        int vitPC = 0;
        int vitVC = 0;

        System.out.println("=================");
        System.out.println("Vamos jogar jokenpô?");
        System.out.println("Quantas partidas você quer jogar?");

        int partidas = entrada.nextInt();

        Random aleatorio = new Random();

        System.out.println("=================");
        while (partidas != contador) {
            System.out.println("PARTIDA " + (contador + 1));

            int valor = aleatorio.nextInt(3) + 1;
            System.out.println("PC já escolheu o que jogar!");
            System.out.println("Sua vez! (1 Pedra || 2 Papel || 3 Tesoura)");

            int jogador = entrada.nextInt();

            if (jogador == 1) {
                System.out.println("Você jogou Pedra!");
            }
            else if (jogador == 2) {
                System.out.println("Você jogou Papel!");
            }
            else if (jogador == 3) {
                System.out.println("Você jogou Tesoura!");
            }
            else {
                System.out.println("Valor inválido!");
                break;
            }


            if (valor == 1) {
                System.out.println("PC jogou Pedra!");
            }
            else if (valor == 2) {
                System.out.println("PC jogou Papel!");
            }
            else {
                System.out.println("PC jogou Tesoura!");
            }

            System.out.println("-----------------");

            if (valor == jogador) {
                System.out.println("Deu empate!");
            }
            else if ((valor == 1) && (jogador == 2)) {
                System.out.println("Você Venceu!");
                vitVC++;
            }
            else if ((valor == 1) && (jogador == 3)) {
                System.out.println("PC Venceu!");
                vitPC++;
            }

            else if ((valor == 2) && (jogador == 1)) {
                System.out.println("PC Venceu!");
                vitPC++;
            }
            else if ((valor == 2) && (jogador == 3)) {
                System.out.println("Você Venceu!");
                vitVC++;
            }

            else if ((valor == 3) && (jogador == 2)) {
                System.out.println("PC Venceu!");
                vitPC++;
            }
            else if ((valor == 3) && (jogador == 1)) {
                System.out.println("Você Venceu!");
                vitVC++;
            }

            contador = contador + 1;
            System.out.println("");
            System.out.println("=================");
        }
        System.out.println("E o placar é: ");
        System.out.println("Você teve "+vitVC+" vitórias");
        System.out.println("PC teve "+vitPC+" vitórias");
        System.out.println("=================");
        System.out.println("Fim de jogo!");
    }
}
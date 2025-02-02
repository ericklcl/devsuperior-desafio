package session08.application;

import session08.entities.Champion;
import java.util.Scanner;

public class DesafioCombate {

    // Constantes para os prompts de entrada
    private static final String PROMPT_NAME = "Nome: ";
    private static final String PROMPT_LIFE = "Vida Inicial: ";
    private static final String PROMPT_ATTACK = "Ataque: ";
    private static final String PROMPT_ARMOR = "Armadura: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuario

        // Le os dados do primeiro campeao
        Champion champion1 = readChampionData(sc, "primeiro");
        // Le os dados do segundo campeao
        Champion champion2 = readChampionData(sc, "segundo");

        // Solicita o número de turnos para o combate
        System.out.print("Quantos turnos você deseja executar o combate? ");
        int n = sc.nextInt();
        System.out.println();

        // Executa o combate pelo número de turnos especificado
        for (int i = 1; i <= n; i++) {
            champion1.takeDamage(champion2); // O primeiro campeao ataca o segundo
            champion2.takeDamage(champion1); // O segundo campeao ataca o primeiro

            // Verifica se algum campeao morreu
            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                // Exibe o resultado do turno
                System.out.printf("Resultado do turno %d:\n", i);

                if (champion1.getLife() == 0) {
                    System.out.println(champion1.status() + " (morreu)");
                } else {
                    System.out.println(champion1.status());
                }

                if (champion2.getLife() == 0) {
                    System.out.println(champion2.status() + " (morreu)");
                } else {
                    System.out.println(champion2.status());
                }
                System.out.println();
                break; // Encerra o combate se algum campeao morreu
            }

            // Exibe o resultado do turno
            System.out.printf("Resultado do turno %d:\n", i);
            System.out.println(champion1.status());
            System.out.println(champion2.status());
            System.out.println();
        }

        System.out.println("FIM DO COMBATE"); // Indica o fim do combate
        sc.close(); // Fecha o objeto Scanner
    }

    // Metodo para ler os dados de um campeao
    private static Champion readChampionData(Scanner sc, String championOrder) {
        System.out.printf("Digite os dados do %s campeão: \n", championOrder);
        System.out.print(PROMPT_NAME);
        String name = sc.nextLine();
        System.out.print(PROMPT_LIFE);
        int life = sc.nextInt();
        System.out.print(PROMPT_ATTACK);
        int attack = sc.nextInt();
        System.out.print(PROMPT_ARMOR);
        int armor = sc.nextInt();
        sc.nextLine(); // Consome a nova linha restante
        System.out.println();

        return new Champion(name, life, attack, armor); // Retorna um novo objeto Champion
    }
}
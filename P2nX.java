import java.util.Scanner;

public class P2nX {
    public static void main(String[] args) {
        MinhaListaOrdenavel minhaLista = new MinhaListaOrdenavel();

        minhaLista.add(new Homem("Carlos Eduardo Silva", "12/04/1988", "482.910.384-52", 78.5f, 1.78f));
        minhaLista.add(new Homem("Lucas Gabriel Santos", "22/09/1995", "193.820.491-73", 68.0f, 1.70f));
        minhaLista.add(new Homem("Matheus Henrique Oliveira", "05/11/1990", "849.201.385-19", 85.2f, 1.82f));
        minhaLista.add(new Homem("Rafael Souza Costa", "14/02/1982", "301.492.810-94", 90.4f, 1.75f));
        minhaLista.add(new Homem("Gabriel Martins Pereira", "30/07/1998", "729.104.832-61", 74.0f, 1.76f));

        minhaLista.add(new Mulher("Mariana Beatriz Lima", "19/03/1992", "512.390.481-28", 58.0f, 1.65f));
        minhaLista.add(new Mulher("Ana Carolina Rocha", "08/07/1996", "931.402.815-43", 52.5f, 1.60f));
        minhaLista.add(new Mulher("Juliana Cristina Ferreira", "25/12/1989", "284.193.502-87", 65.4f, 1.68f));
        minhaLista.add(new Mulher("Beatriz Fernanda Alves", "03/06/1994", "603.921.485-92", 61.2f, 1.63f));
        minhaLista.add(new Mulher("Larissa Ribeiro Dias", "11/10/1991", "418.520.391-65", 55.8f, 1.58f));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("       SISTEMA DE GESTAO - P2n          ");
            System.out.println("========================================");
            System.out.println("1. Listar por Peso Crescente");
            System.out.println("2. Listar por Peso Decrescente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        minhaLista.ordena(MinhaListaOrdenavel.PESO_CRESCENTE);
                        System.out.println("\n--- LISTA ORDENADA POR PESO CRESCENTE ---");

                        for (int i = 0; i < minhaLista.size(); i++) {
                            System.out.println(minhaLista.get(i).toString());
                            System.out.println("----------------------------------------");
                        }
                        break;

                    case 2:
                        minhaLista.ordena(MinhaListaOrdenavel.PESO_DECRESCENTE);
                        System.out.println("\n--- LISTA ORDENADA POR PESO DECRESCENTE ---");

                        for (int i = 0; i < minhaLista.size(); i++) {
                            System.out.println(minhaLista.get(i).toString());
                            System.out.println("----------------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("\nEncerrando o programa. Até logo!");
                        break;

                    default:
                        System.out.println("\n[Erro] Opcao invalida! Escolha entre 1 e 3.");
                }
            } else {
                System.out.println("\n[Erro] Entrada invalida! Por favor, digite um numero inteiro.");
                scanner.next();
            }

        } while (opcao != 3);

        scanner.close();
    }
}
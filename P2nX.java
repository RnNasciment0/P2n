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
            System.out.println("\n==================================================");
            System.out.println("          SISTEMA DE GESTAO - P2n (COMPLETO)      ");
            System.out.println("==================================================");
            System.out.println(" 1. Listar por Peso Crescente");
            System.out.println(" 2. Listar por Peso Decrescente");
            System.out.println(" 3. Listar por Nome (A-Z)");
            System.out.println(" 4. Listar por Nome (Z-A)");
            System.out.println(" 5. Listar por IMC Crescente");
            System.out.println(" 6. Listar por IMC Decrescente");
            System.out.println(" 7. Listar por Data de Nascimento (Crescente)");
            System.out.println(" 8. Listar por Data de Nascimento (Decrescente)");
            System.out.println(" 9. Listar por CPF (Crescente)");
            System.out.println("10. Listar por CPF (Decrescente)");
            System.out.println("11. Sair");
            System.out.print("Escolha uma opcao: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                if (opcao >= 1 && opcao <= 10) {
                    executarOrdenacao(minhaLista, opcao);
                } else if (opcao == 11) {
                    System.out.println("\nEncerrando o programa. Bom trabalho e bons estudos!");
                } else {
                    System.out.println("\n[Erro] Opcao invalida! Escolha entre 1 e 11.");
                }
            } else {
                System.out.println("\n[Erro] Entrada invalida! Por favor, digite um numero inteiro.");
                scanner.next();
            }

        } while (opcao != 11);

        scanner.close();
    }

    private static void executarOrdenacao(MinhaListaOrdenavel lista, int opcao) {
        String titulo = "";
        int criterio = 0;

        switch (opcao) {
            case 1: criterio = MinhaListaOrdenavel.PESO_CRESCENTE; titulo = "PESO CRESCENTE"; break;
            case 2: criterio = MinhaListaOrdenavel.PESO_DECRESCENTE; titulo = "PESO DECRESCENTE"; break;
            case 3: criterio = MinhaListaOrdenavel.NOME_AZ; titulo = "NOME (A-Z)"; break;
            case 4: criterio = MinhaListaOrdenavel.NOME_ZA; titulo = "NOME (Z-A)"; break;
            case 5: criterio = MinhaListaOrdenavel.IMC_CRESCENTE; titulo = "IMC CRESCENTE"; break;
            case 6: criterio = MinhaListaOrdenavel.IMC_DECRESCENTE; titulo = "IMC DECRESCENTE"; break;
            case 7: criterio = MinhaListaOrdenavel.DATA_CRESCENTE; titulo = "DATA DE NASCIMENTO CRESCENTE"; break;
            case 8: criterio = MinhaListaOrdenavel.DATA_DECRESCENTE; titulo = "DATA DE NASCIMENTO DECRESCENTE"; break;
            case 9: criterio = MinhaListaOrdenavel.CPF_CRESCENTE; titulo = "CPF CRESCENTE"; break;
            case 10: criterio = MinhaListaOrdenavel.CPF_DECRESCENTE; titulo = "CPF DECRESCENTE"; break;
        }

        lista.ordena(criterio);
        System.out.println("\n--- LISTA ORDENADA POR: " + titulo + " ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            System.out.println("--------------------------------------------------");
        }
    }
}

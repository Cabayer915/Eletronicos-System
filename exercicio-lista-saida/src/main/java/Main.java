import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaObj<Eletronico> lista = new ListaObj<>(5);
        int opcao;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Adicionar um eletrônico");
            System.out.println("2 - Exibir eletrônicos cadastrados");
            System.out.println("3 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (lista.getTamanho() < 5) {
                        System.out.print("Digite o ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Digite o ano de garantia: ");
                        int anoGarantia = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Digite o preço: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("O eletrônico está ativo? (true/false): ");
                        boolean ativo = scanner.nextBoolean();
                        System.out.print("Digite o ano de fabricação: ");
                        int anoFabricacao = scanner.nextInt();

                        Eletronico eletronico = new Eletronico(id, anoGarantia, nome, preco, marca, ativo, anoFabricacao);
                        lista.adiciona(eletronico);
                        System.out.println("Eletrônico adicionado com sucesso!");
                    } else {
                        System.out.println("A lista de eletrônicos está cheia!");
                    }
                    break;

                case 2:
                    if (lista.getTamanho() > 0) {
                        System.out.println("\n=== Eletrônicos Cadastrados ===");
                        System.out.printf("%-3s | %-20s | %-4s | %-10s | %-20s | %-8s | %-4s\n",
                                "ID", "Nome", "Ano Garantia", "Preço", "Marca", "Ativo", "Ano Fabricação");
                        for (int i = 0; i < lista.getTamanho(); i++) {
                            Eletronico eletronico = lista.getElemento(i);
                            System.out.println(eletronico);
                        }
                    } else {
                        System.out.println("A lista de eletrônicos está vazia!");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }
}

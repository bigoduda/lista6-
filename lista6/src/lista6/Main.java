/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista6;

/**
 *
 * @author Bigodudak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        // Produtos cadastrados
        produtos.add(new Produto("Caneta", 1, 2.50));
        produtos.add(new Produto("Caderno", 2, 15.00));
        produtos.add(new Produto("Lápis", 3, 1.50));

        Fatura fatura = new Fatura();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\nProdutos Disponíveis:");

                    for (Produto p : produtos) {
                        p.exibirProduto();
                    }

                    System.out.print("\nDigite o código do produto: ");
                    int codigo = sc.nextInt();

                    Produto produtoEscolhido = null;

                    for (Produto p : produtos) {
                        if (p.getCodigo() == codigo) {
                            produtoEscolhido = p;
                            break;
                        }
                    }

                    if (produtoEscolhido == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.print("Quantidade: ");
                        int quantidade = sc.nextInt();

                        Item item = new Item(produtoEscolhido, quantidade);
                        fatura.adicionarItem(item);

                        System.out.println("Item adicionado com sucesso!");
                    }

                    break;

                case 2:
                    fatura.exibirFatura();
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
    
}

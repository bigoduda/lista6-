/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista6;

/**
 *
 * @author Bigodudak
 */
public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return produto.getPreco() * quantidade;
    }

    public void exibirItem() {
        System.out.println(
                produto.getNome() +
                " | Quantidade: " + quantidade +
                " | Valor Total: R$ " + getValorTotal()
        );
    }
}

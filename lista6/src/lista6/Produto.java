/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista6;

/**
 *
 * @author Bigodudak
 */
public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    
    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirProduto() {
        System.out.println("Código: " + codigo +
                " | Nome: " + nome +
                " | Preço: R$ " + preco);
    }
}

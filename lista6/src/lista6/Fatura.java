/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista6;

/**
 *
 * @author Bigodudak
 */
import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;

    public Fatura() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.getValorTotal();
        }

        return total;
    }

    public void exibirFatura() {
        if (itens.size() == 0) {
            System.out.println("Nenhum item comprado.");
            return;
        }

        System.out.println("\n===== FATURA =====");

        for (Item item : itens) {
            item.exibirItem();
        }

        System.out.println("------------------");
        System.out.printf("Valor Final: R$ %.2f%n", getValorTotal());
    }
}
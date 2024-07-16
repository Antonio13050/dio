package org.example.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item t : itens ){
            if(t.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(t);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item t : itens ){
            total += t.getPreco() * t.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Item 1", 2.5, 1);

        carrinho.adicionarItem("Item 2", 3.5, 1);
        carrinho.exibirItens();

        carrinho.adicionarItem("Item 3", 3.5, 1);
        carrinho.exibirItens();

        carrinho.removerItem("Item 2");
        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());
    }
}

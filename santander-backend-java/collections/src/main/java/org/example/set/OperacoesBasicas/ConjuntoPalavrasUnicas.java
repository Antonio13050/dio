package org.example.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;

        for(String p : palavras){
            if(p == palavra){
                palavraParaRemover = p;
                break;
            }
        }

        palavras.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        for(String p : palavras){
            if(p.equalsIgnoreCase(palavra)){
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);

    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();
        palavrasUnicas.adicionarPalavra("Palavra 1");
        palavrasUnicas.adicionarPalavra("Palavra 2");
        palavrasUnicas.adicionarPalavra("Palavra 3");

        System.out.println(palavrasUnicas.verificarPalavra("Palavra 1"));
        palavrasUnicas.removerPalavra("Palavra 1");

        System.out.println(palavrasUnicas.verificarPalavra("Palavra 1"));

        palavrasUnicas.exibirPalavrasUnicas();
    }
}

package org.example.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidados;

    public ConjuntoConvidado() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado){

        Convidado convidadoParaRemover = null;

        for(Convidado c : convidados) {
            if(c.getCodigoConvite() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Qtd convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Qtd convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Qtd convidados: " + conjuntoConvidado.contarConvidados());

        conjuntoConvidado.exibirConvidados();
    }
}

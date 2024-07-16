package org.example.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        for(Integer n : numeros){
            total += n;
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for(Integer n : numeros){
            if(n > maior){
                maior = n;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(Integer n : numeros){
            if(menor > n){
                menor = n;
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
    }

}

package org.example.javadoc;
/**
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Gleyson Sampaio
 * @version 1.0
 * @since   01/01/2022
 */
public class Calculadora {

    /**
     * Construtor padrão da calculadora.
     * Este construtor não recebe parâmetros e inicializa uma calculadora com configurações padrão.
     */
    public Calculadora() {
        // Inicializa a calculadora com configurações padrão, se necessário
    }

    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
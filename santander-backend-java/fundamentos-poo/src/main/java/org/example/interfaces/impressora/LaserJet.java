package org.example.interfaces.impressora;

public class LaserJet implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("LaserJet imprimindo");
    }
}

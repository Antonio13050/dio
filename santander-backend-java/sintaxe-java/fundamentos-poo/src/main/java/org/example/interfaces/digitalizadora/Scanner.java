package org.example.interfaces.digitalizadora;

public class Scanner implements Digitalizadora{
    @Override
    public void digitalizar() {
        System.out.println("Scanner Digitalizando");
    }
}

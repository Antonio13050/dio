package org.example.interfaces.mulitifuncional;

import org.example.interfaces.copiadora.Copiadora;
import org.example.interfaces.digitalizadora.Digitalizadora;
import org.example.interfaces.impressora.Impressora;

public class EquipamentoMultifunional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Equipamento multifuncional copiando");
    }

    @Override
    public void digitalizar() {
        System.out.println("Equipamento multifuncional digitalizando");
    }

    @Override
    public void imprimir() {
        System.out.println("Equipamento multifuncional imprimindo");
    }
}

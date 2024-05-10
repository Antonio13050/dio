package org.example.interfaces;

import org.example.interfaces.digitalizadora.Digitalizadora;
import org.example.interfaces.digitalizadora.Scanner;
import org.example.interfaces.impressora.DeskJet;
import org.example.interfaces.impressora.Impressora;
import org.example.interfaces.mulitifuncional.EquipamentoMultifunional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifunional();
        impressora.imprimir();

        Digitalizadora scanner = new Scanner();
        scanner.digitalizar();

        Digitalizadora equipamentoMultifuncioanl = new EquipamentoMultifunional();
        equipamentoMultifuncioanl.digitalizar();
    }
}

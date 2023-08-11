package oo.encapsulamento.CasaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();
    void testeDeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        System.out.println(mae.segredo); // PRIVADO: não consegue acessar
        System.out.println(mae.facoDentroDeCasa); // Só acessado por pacote
        System.out.println(this.formaDeFalar); // Acessado por herança
        System.out.println(mae.todosSabem);
        System.out.println(new Ana().todosSabem);
    }
}

package oo.encapsulamento.CasaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void testeDeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

        System.out.println(sogra.segredo); // PRIVADO: não consegue acessar
        System.out.println(sogra.facoDentroDeCasa);
        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }
}

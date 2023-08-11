package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeDeAcessos() {
        // segredo
        // facoDentroDeCasa
        // formaDeFalar
        // todosSabem

//        System.out.println(esposa.segredo); // PRIVADO: não consegue acessar
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}

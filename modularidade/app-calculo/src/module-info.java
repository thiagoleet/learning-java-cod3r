module app.calculo {
    requires app.loggin;


    requires app.api;
    provides me.thiagoleite.app.Calculadora
            with me.thiagoleite.app.calculo.CalculadoraImpl;


    exports me.thiagoleite.app.calculo;

}
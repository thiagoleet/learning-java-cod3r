module app.calculo {
    requires app.loggin;
    exports me.thiagoleite.app.calculo;

    exports me.thiagoleite.app.calculo.interno
            to app.financeiro;

}
package Expressao;

import Variavel.*;

public class ExpVariavel extends Expressao{

    char variavel;

    public ExpVariavel(char nomevar) {
        variavel= nomevar;
    }

    public double avalia() {
        String s = "";
        s += this.variavel;
        return Variaveis.var[Variaveis.PosicaoDaVariavel(s)];
    }

}
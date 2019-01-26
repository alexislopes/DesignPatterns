package contextos;

import estrategias.StrategyMath;

public class ContextMath {
    private StrategyMath strategy;

    public ContextMath(StrategyMath strategy) {
        this.strategy = strategy;
    }

    public int calcular(int numero1, int numero2){
        return strategy.operacao(numero1, numero2);
    }
}

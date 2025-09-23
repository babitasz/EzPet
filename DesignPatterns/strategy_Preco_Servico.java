package EzPet.DesignPatterns;

/**
 * Strategy para cálculo de preço de serviço.
 * Simples e no mesmo "jeitão" dos seus outros patterns.
 */
public interface strategy_Preco_Servico {
    double calcular(double precoBase, Double horas, boolean recorrente);
}

/** Contexto que aplica a estratégia selecionada. */
class preco_Context {
    private strategy_Preco_Servico estrategia;

    public preco_Context(strategy_Preco_Servico estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(strategy_Preco_Servico estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double precoBase, Double horas, boolean recorrente) {
        return estrategia.calcular(precoBase, horas, recorrente);
    }
}

/** Estratégia: Preço Fixo (retorna o próprio preço base). */
class preco_fixo_Strategy implements strategy_Preco_Servico {
    @Override
    public double calcular(double precoBase, Double horas, boolean recorrente) {
        return arred2(precoBase);
    }

    private double arred2(double v) { return Math.round(v * 100.0) / 100.0; }
}

/** Estratégia: Preço por Hora (precoBase * horas; se horas==null, assume 1). */
class preco_por_hora_Strategy implements strategy_Preco_Servico {
    @Override
    public double calcular(double precoBase, Double horas, boolean recorrente) {
        double h = (horas == null ? 1.0 : horas.doubleValue());
        return arred2(precoBase * h);
    }

    private double arred2(double v) { return Math.round(v * 100.0) / 100.0; }
}

/** Estratégia: Desconto para Recorrência (10% se recorrente=true, sobre preço fixo). */
class preco_recorrencia_Strategy implements strategy_Preco_Servico {
    private final double desconto; // ex.: 0.10 = 10%

    public preco_recorrencia_Strategy() { this(0.10); }
    public preco_recorrencia_Strategy(double desconto) { this.desconto = desconto; }

    @Override
    public double calcular(double precoBase, Double horas, boolean recorrente) {
        double valor = precoBase;
        if (recorrente) valor = precoBase * (1.0 - desconto);
        return arred2(valor);
    }

    private double arred2(double v) { return Math.round(v * 100.0) / 100.0; }
}

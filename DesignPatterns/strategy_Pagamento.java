package EzPet.DesignPatterns;

/**
 * Strategy para metodo de pagamento.
 * Implementações simples: cartão de crédito, boleto, pix.
 */
public interface strategy_Pagamento {
    /**
     * Processa o pagamento e retorna um status simples.
     */
    String pagar(double valor);
}

/** Contexto que aplica a estratégia de pagamento. */
class pagamento_Context {
    private strategy_Pagamento estrategia;

    public pagamento_Context(strategy_Pagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(strategy_Pagamento estrategia) {
        this.estrategia = estrategia;
    }

    public String pagar(double valor) {
        return estrategia.pagar(valor);
    }
}

/** Estratégia: Cartão de Crédito (simples/aprovado). */
class pagamento_cartao_credito_Strategy implements strategy_Pagamento {
    @Override
    public String pagar(double valor) {
        return "CARTAO_APROVADO valor=" + arred2(valor);
    }

    private String arred2(double v) { return String.format(java.util.Locale.US, "%.2f", Math.round(v*100.0)/100.0); }
}

/** Estratégia: Boleto (gera boleto). */
class pagamento_boleto_Strategy implements strategy_Pagamento {
    @Override
    public String pagar(double valor) {
        return "BOLETO_GERADO valor=" + arred2(valor);
    }

    private String arred2(double v) { return String.format(java.util.Locale.US, "%.2f", Math.round(v*100.0)/100.0); }
}

/** Estratégia: Pix (gera cobrança Pix). */
class pagamento_pix_Strategy implements strategy_Pagamento {
    @Override
    public String pagar(double valor) {
        return "PIX_GERADO valor=" + arred2(valor);
    }

    private String arred2(double v) { return String.format(java.util.Locale.US, "%.2f", Math.round(v*100.0)/100.0); }
}

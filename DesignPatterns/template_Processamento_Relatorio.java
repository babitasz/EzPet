package EzPet.DesignPatterns;

public abstract class template_Processamento_Relatorio {

    // Template Method
    public final void gerarRelatorio() {
        coletarDados();      // Passo 1
        formatar();          // Passo 2
        exibirRelatorio();
    }

    // Passo 1 – Coletar dados
    protected abstract void coletarDados();

    // Passo 2 – Formatar dados
    protected abstract void formatar();

    // Passo 3 - Exibir o relatório
    protected abstract void exibirRelatorio();
}

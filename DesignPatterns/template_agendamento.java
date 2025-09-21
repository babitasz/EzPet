package EzPet.DesignPatterns;

public abstract class template_agendamento {

    // Template Method
    public final void processoAgendamento() {
        if(verificarDisponibilidade()) {     // Passo 1
            double valor = calcularValor();  // Passo 2
        } else {
            System.out.println("Horário indisponível.");
        }
    }

    // Passo 1 – Verificar disponibilidade
    protected abstract boolean verificarDisponibilidade();

    // Passo 2 – Calcular valor
    protected abstract double calcularValor();
}

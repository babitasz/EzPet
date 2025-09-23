package EzPet.DesignPatterns.template_notificacao;

// Classe abstrata (Template Method)
public abstract class Notificacao {

    // Método Template
    public final void executar(String destino) {
        String mensagem = gerarMensagem();
        enviar(destino, mensagem);
        registrarEnvio(destino, mensagem);
    }

    protected abstract String gerarMensagem();
    protected abstract void enviar(String destino, String mensagem);

    // Hook method (pode ser sobrescrito ou não)
    protected void registrarEnvio(String destino, String mensagem) {
        System.out.println("✅ Registro: mensagem enviada para " + destino + " -> " + mensagem);
    }
}


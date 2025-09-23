package EzPet.DesignPatterns.strategyNotificao;

public class Notificacao {
    private NotificacaoStrategy estrategia;

    public Notificacao(NotificacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(NotificacaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void notificar(String destino, String mensagem) {
        estrategia.enviar(destino, mensagem);
    }
}


package EzPet.DesignPatterns.strategyNotificao;

public interface NotificacaoStrategy {
    void enviar(String destino, String mensagem);
}

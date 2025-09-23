package EzPet.DesignPatterns.strategyNotificao;

public class PushNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("📲 Enviando PUSH para " + destino + ": " + mensagem);
    }
}
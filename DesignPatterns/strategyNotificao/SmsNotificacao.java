package EzPet.DesignPatterns.strategyNotificao;

public class SmsNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("📱 Enviando SMS para " + destino + ": " + mensagem);
    }
}
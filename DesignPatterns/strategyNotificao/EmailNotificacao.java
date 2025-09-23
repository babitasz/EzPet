package EzPet.DesignPatterns.strategyNotificao;

public class EmailNotificacao implements NotificacaoStrategy {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("📧 Enviando EMAIL para " + destino + ": " + mensagem);
    }
}
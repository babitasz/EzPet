package EzPet.DesignPatterns.template_notificacao;

public class SmsNotificacao extends Notificacao {
    @Override
    protected String gerarMensagem() {
        return "Mensagem de notificação via SMS";
    }

    @Override
    protected void enviar(String destino, String mensagem) {
        System.out.println("📱 Enviando SMS para " + destino + ": " + mensagem);
    }
}

package EzPet.DesignPatterns.template_notificacao;

public class PushNotificacao extends Notificacao {
    @Override
    protected String gerarMensagem() {
        return "Mensagem de notificação via PUSH";
    }

    @Override
    protected void enviar(String destino, String mensagem) {
        System.out.println("📲 Enviando PUSH para " + destino + ": " + mensagem);
    }
}


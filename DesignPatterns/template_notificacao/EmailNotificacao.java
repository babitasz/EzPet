package EzPet.DesignPatterns.template_notificacao;

public class EmailNotificacao extends Notificacao {
    @Override
    protected String gerarMensagem() {
        return "Mensagem de notificação via EMAIL";
    }

    @Override
    protected void enviar(String destino, String mensagem) {
        System.out.println("📧 Enviando EMAIL para " + destino + ": " + mensagem);
    }
}

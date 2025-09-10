package EzPet.Entidades;

import java.util.Date;

public class Notificacao {

    private int id_notificacao;
    private int id_tutor;
    private int id_prestador;
    private String mensagem;
    private Date data_envio;
    private boolean lida;

    // Getters e Setters
    public int getIdNotificacao() {
        return id_notificacao;
    }

    public void setIdNotificacao(int id_notificacao) {
        this.id_notificacao = id_notificacao;
    }

    public int getIdTutor() {
        return id_tutor;
    }

    public void setIdTutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public int getIdPrestador() {
        return id_prestador;
    }

    public void setIdPrestador(int id_prestador) {
        this.id_prestador = id_prestador;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataEnvio() {
        return data_envio;
    }

    public void setDataEnvio(Date data_envio) {
        this.data_envio = data_envio;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }
}

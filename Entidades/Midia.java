package EzPet.Entidades;

import java.util.Date;

public class Midia {

    private int id_midia;
    private int id_reserva;
    private String tipo;
    private String caminho_arquivo;
    private Date data_envio;

    // Getters e Setters
    public int getIdMidia() {
        return id_midia;
    }

    public void setIdMidia(int id_midia) {
        this.id_midia = id_midia;
    }

    public int getIdReserva() {
        return id_reserva;
    }

    public void setIdReserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaminhoArquivo() {
        return caminho_arquivo;
    }

    public void setCaminhoArquivo(String caminho_arquivo) {
        this.caminho_arquivo = caminho_arquivo;
    }

    public Date getDataEnvio() {
        return data_envio;
    }

    public void setDataEnvio(Date data_envio) {
        this.data_envio = data_envio;
    }
}

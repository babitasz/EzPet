package Entidades;

import java.util.Date;

public class Agendamento {
    private int id_agendamento;
    private int id_prestador;
    private Date data_inicio;
    private Date data_fim;
    private boolean disponivel;

    // Getters e Setters
    public int getIdAgendamento() {
        return id_agendamento;
    }

    public void setIdAgendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public int getIdPrestador() {
        return id_prestador;
    }

    public void setIdPrestador(int id_prestador) {
        this.id_prestador = id_prestador;
    }

    public Date getDataInicio() {
        return data_inicio;
    }

    public void setDataInicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getDataFim() {
        return data_fim;
    }

    public void setDataFim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

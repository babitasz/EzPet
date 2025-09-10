package EzPet.Entidades;

import java.util.Date;

public class Reserva {

    private int id_tutor;
    private int id_pet;
    private int id_servico;
    private int id_agendamento;
    private String status;
    private Date data_reserva;
    private double valor;

    // Getters e Setters

    public int getIdTutor() {
        return id_tutor;
    }

    public void setIdTutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    public int getIdPet() {
        return id_pet;
    }

    public void setIdPet(int id_pet) {
        this.id_pet = id_pet;
    }

    public int getIdServico() {
        return id_servico;
    }

    public void setIdServico(int id_servico) {
        this.id_servico = id_servico;
    }

    public int getIdAgendamento() {
        return id_agendamento;
    }

    public void setIdAgendamento(int id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataReserva() {
        return data_reserva;
    }

    public void setDataReserva(Date data_reserva) {
        this.data_reserva = data_reserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

package EzPet.Entidades;

public class Avaliacao {
    private String id;
    private String tutorId;
    private String prestadorId;
    private String reservaId;
    private int nota;
    private String comentario;
    private String data;

    public Avaliacao(String id, String tutorId, String prestadorId, String reservaId, int nota, String comentario, String data) {
        this.id = id;
        this.tutorId = tutorId;
        this.prestadorId = prestadorId;
        this.reservaId = reservaId;
        setNota(nota); // valida no setter
        this.comentario = comentario;
        this.data = data;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getTutorId() {
        return tutorId;
    }
    public String getPrestadorId() {
        return prestadorId;
    }
    public String getReservaId() {
        return reservaId;
    }
    public int getNota() {
        return nota;
    }
    public String getComentario() {
        return comentario;
    }
    public String getData() {
        return data;
    }

    //Setters
    public void setNota(int nota) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }
        this.nota = nota;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setData(String data) {
        this.data = data;
    }

    //Metodos adicionais
    public String resumo() {
        return "Avaliação: nota=" + nota +
                ", comentário='" + comentario + "', data=" + data;
    }
}

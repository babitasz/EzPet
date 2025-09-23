package EzPet.Entidades;

public class Servico {
    private String id;
    private String prestadorId;
    private String descricao;
    private double preco;
    private boolean disponibilidade;
    private String fotoUrl; // opcional

    public Servico(String id, String prestadorId, String descricao, double preco, boolean disponibilidade, String fotoUrl) {
        this.id = id;
        this.prestadorId = prestadorId;
        this.descricao = descricao;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
        this.fotoUrl = fotoUrl;
    }

    // Getters
    public String getId() { return id; }
    public String getPrestadorId() { return prestadorId; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public boolean isDisponibilidade() { return disponibilidade; }
    public String getFotoUrl() { return fotoUrl; }

    // Setters
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setDisponibilidade(boolean disponibilidade) { this.disponibilidade = disponibilidade; }
    public void setFotoUrl(String fotoUrl) { this.fotoUrl = fotoUrl; }

    // Outros métodos
    public String resumo() {
        return "Serviço: " + descricao + " - Preço: R$ " + preco + " - Disponível: " + (disponibilidade ? "Sim" : "Não");
    }
}

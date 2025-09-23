package EzPet.Entidades;

public class Prestador {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String tipoServico;
    private String senha;

    public Prestador(String id, String nome, String email, String telefone, String endereco, String tipoServico, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipoServico = tipoServico;
        this.senha = senha;
    }

    // Getters
    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public String getTipoServico() { return tipoServico; }
    public String getSenha() { return senha; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTipoServico(String tipoServico) { this.tipoServico = tipoServico; }
    public void setSenha(String senha) { this.senha = senha; }

    // Outros métodos
    public String resumo() {
        return "Prestador: " + nome + " - Serviço: " + tipoServico + " (" + email + ")";
    }
}

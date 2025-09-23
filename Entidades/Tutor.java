package EzPet.Entidades;

public class Tutor {
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String senha;

    public Tutor(String id, String nome, String email, String telefone, String endereco, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senha = senha;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public String getSenha() { return senha; }


    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setSenha(String senha) { this.senha = senha; }


    public String resumo() {
        return "Tutor: " + nome + " (" + email + "), telefone: " + telefone;
    }
}

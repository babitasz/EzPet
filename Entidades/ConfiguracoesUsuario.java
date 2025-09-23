package EzPet.Entidades;

public class ConfiguracoesUsuario {

    // 🔹 Atributos escolhidos pelo usuário
    private String nomeEmpresa;
    private String horarioFuncionamento;
    private String temaSistema;
    private String endereco;
    private String telefoneSuporte;

    //Construtor
    public ConfiguracoesUsuario(String nomeEmpresa, String horarioFuncionamento,
                                String temaSistema, String endereco, String telefoneSuporte) {
        this.nomeEmpresa = nomeEmpresa;
        this.horarioFuncionamento = horarioFuncionamento;
        this.temaSistema = temaSistema;
        this.endereco = endereco;
        this.telefoneSuporte = telefoneSuporte;
    }

    // Métodos Getters e Setters
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getTemaSistema() {
        return temaSistema;
    }

    public void setTemaSistema(String temaSistema) {
        this.temaSistema = temaSistema;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneSuporte() {
        return telefoneSuporte;
    }

    public void setTelefoneSuporte(String telefoneSuporte) {
        this.telefoneSuporte = telefoneSuporte;
    }

    public void exibirConfiguracoesUsuario() {
        System.out.println("=== Configurações do Usuário ===");
        System.out.println("Nome da Empresa: " + nomeEmpresa);
        System.out.println("Horário de Funcionamento: " + horarioFuncionamento);
        System.out.println("Tema do Sistema: " + temaSistema);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone de Suporte: " + telefoneSuporte);
    }
}

package EzPet.Entidades;

public class Pet {
    private String id;
    private String tutorId;
    private String raca;
    private int idadeMeses;
    private double pesoKg;
    private String temperamento;
    private String restricoes;
    private String fotoUrl;

    public Pet(String id, String tutorId, String raca, int idadeMeses, double pesoKg, String temperamento, String restricoes, String fotoUrl) {
        this.id = id;
        this.tutorId = tutorId;
        this.raca = raca;
        this.idadeMeses = idadeMeses;
        this.pesoKg = pesoKg;
        this.temperamento = temperamento;
        this.restricoes = restricoes;
        this.fotoUrl = fotoUrl;
    }

    // Getters
    public String getId() {
        return id;
    }
    public String getTutorId() {
        return tutorId;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdadeMeses() {
        return idadeMeses;
    }
    public double getPesoKg() {
        return pesoKg;
    }
    public String getTemperamento() {
        return temperamento;
    }
    public String getRestricoes() {
        return restricoes;
    }
    public String getFotoUrl() {
        return fotoUrl;
    }

    // Setters
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setIdadeMeses(int idadeMeses) {
        this.idadeMeses = idadeMeses;
    }
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }
    public void setRestricoes(String restricoes) {
        this.restricoes = restricoes;
    }
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    // Outros métodos
    public String resumo() {
        return "Pet: " + raca + " , idade: " + idadeMeses + " meses, peso: " + pesoKg + " kg, temperamento:" + temperamento;
    }

}


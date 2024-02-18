package br.edu.infnet.entities;

public class PacienteEntity {
    private Integer idPaciente;
    private Integer convenioId;
    private String nome;
    private String email;

    public PacienteEntity(Integer idPaciente, Integer convenioId, String nome, String email) {
        this.idPaciente = idPaciente;
        this.convenioId = convenioId;
        this.nome = nome;
        this.email = email;
    }
    public boolean validarEmail(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }
    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getConvenioId() {
        return convenioId;
    }

    public void setConvenioId(Integer convenioId) {
        this.convenioId = convenioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

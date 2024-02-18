package br.edu.infnet.entities;

public class Medico {
    private Hospital hospitalAtendido;
    private Integer idMedico;
    private String nome;
    private String email;
    private String telefone;
    private Integer convenioAceito;

    public Medico(Hospital hospitalAtendido, Integer idMedico, String nome, String email, String telefone, Integer convenioAceito) {
        this.hospitalAtendido = hospitalAtendido;
        this.idMedico = idMedico;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.convenioAceito = convenioAceito;
    }

    public Hospital getHospitalAtendido() {
        return hospitalAtendido;
    }

    public void setHospitalAtendido(Hospital hospitalAtendido) {
        this.hospitalAtendido = hospitalAtendido;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getConvenioAceito() {
        return convenioAceito;
    }

    public void setConvenioAceito(Integer convenioAceito) {
        this.convenioAceito = convenioAceito;
    }
}

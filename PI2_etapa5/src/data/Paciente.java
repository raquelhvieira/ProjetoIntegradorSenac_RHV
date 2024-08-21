package data;

import java.util.Date;

public class Paciente {

    private String nomePct;
    private String cpf;
    private Date dataNasc;

    public Paciente() {
    }

    public String getNomePct() {
        return nomePct;
    }

    public void setNomePct(String nomePct) {
        this.nomePct = nomePct;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

}

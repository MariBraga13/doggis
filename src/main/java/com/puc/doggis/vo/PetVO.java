package com.puc.doggis.vo;

public class PetVO {

    private String nome;
    private Long idTipoPet;
    private Long IdRaca;
    private String porte;
    private String alergias;
    private String habitos;
    private Long idCliente;
    private Boolean publicacaoFotos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdTipoPet() {
        return idTipoPet;
    }

    public void setIdTipoPet(Long idTipoPet) {
        this.idTipoPet = idTipoPet;
    }

    public Long getIdRaca() {
        return IdRaca;
    }

    public void setIdRaca(Long idRaca) {
        IdRaca = idRaca;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public Boolean getPublicacaoFotos() {
        return publicacaoFotos;
    }

    public void setPublicacaoFotos(Boolean publicacaoFotos) {
        this.publicacaoFotos = publicacaoFotos;
    }
}

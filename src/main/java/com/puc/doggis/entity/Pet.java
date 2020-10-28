package com.puc.doggis.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "raca", nullable = false)
    private Raca raca;

    @ManyToOne
    @JoinColumn(name = "cliente", nullable = false)
    private Cliente cliente;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="porte", nullable=false, length = 1)
    private String porte;

    @Column(name="observacoes", nullable=false)
    private String observacoes;

    @Column(name="alergias", nullable=false)
    private String alergias;

    @Column(name="permite_divulgacao", nullable=false)
    private Boolean permiteDivulgacao;

    public Pet() {}

    public Pet(Raca raca, Cliente cliente, String nome, String porte, String observacoes,
               String alergias, Boolean permiteDivulgacao) {
        this.raca = raca;
        this.alergias = alergias;
        this.cliente = cliente;
        this.nome = nome;
        this.observacoes = observacoes;
        this.porte = porte;
        this.permiteDivulgacao = permiteDivulgacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Boolean getPermiteDivulgacao() {
        return permiteDivulgacao;
    }

    public void setPermiteDivulgacao(Boolean permiteDivulgacao) {
        this.permiteDivulgacao = permiteDivulgacao;
    }
}

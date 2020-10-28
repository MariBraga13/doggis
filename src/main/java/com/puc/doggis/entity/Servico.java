package com.puc.doggis.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="duracao_minima", nullable=false)
    private Integer duracaoMinima;

    @Column(name="preco", nullable=false)
    private Double preco;

    @Column(name="data_alteracao", nullable=true)
    private Date dataAlteracao;

    @Column(name="ativo", nullable=false)
    private Boolean ativo;

    @Column(name="porntos_realizacao", nullable=false)
    private Integer pontosRealizacap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoMinima() {
        return duracaoMinima;
    }

    public void setDuracaoMinima(Integer duracaoMinima) {
        this.duracaoMinima = duracaoMinima;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getPontosRealizacap() {
        return pontosRealizacap;
    }

    public void setPontosRealizacap(Integer pontosRealizacap) {
        this.pontosRealizacap = pontosRealizacap;
    }
}

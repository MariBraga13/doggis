package com.puc.doggis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fabricante", nullable = false)
    private Fabricante fabricante;

    @Column(name="nome", nullable=false)
    private String nome;

    @Column(name="especificacoes", nullable=false)
    private String especificacoes;

    @Column(name="preco", nullable=false)
    private Double preco;

    @Column(name="para_venda", nullable=false)
    private Boolean paraVenda;

    @Column(name="quantidade", nullable=false)
    private Integer quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public Boolean getParaVenda() {
        return paraVenda;
    }

    public void setParaVenda(Boolean paraVenda) {
        this.paraVenda = paraVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}

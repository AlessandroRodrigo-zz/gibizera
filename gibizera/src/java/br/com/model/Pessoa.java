/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.model;

/**
 *
 * @author Flavio Prado
 */
public class Pessoa {
    
    private Integer idPessoa;
    private String nomePessoa;
    private String cpfPessoa;
    private String enderecoPessoa;
    private String situacaoPessoa;

    public Pessoa() {
    
    }
    
    public Pessoa(Integer idPessoa, String nomePessoa, String cpfPessoa, String enderecoPessoa, String situacaoPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.situacaoPessoa = situacaoPessoa;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getSituacaoPessoa() {
        return situacaoPessoa;
    }

    public void setSituacaoPessoa(String situacaoPessoa) {
        this.situacaoPessoa = situacaoPessoa;
    }
    
}

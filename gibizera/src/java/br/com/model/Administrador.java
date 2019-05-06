/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author Admin
 */
public class Administrador extends Pessoa{
    
    private Integer seqPessoa;

    public Administrador(Integer seqPessoa, String nomePessoa, String ufPessoa, String cidadePessoa, String telefonePessoa, String loginPessoa, String senhaPessoa, String tipoPessoa, String emailPessoa) {
        super(seqPessoa, nomePessoa, ufPessoa, cidadePessoa, telefonePessoa, loginPessoa, senhaPessoa, tipoPessoa, emailPessoa);
        this.seqPessoa = seqPessoa;
    }

    

    public Integer getseqPessoa() {
        return seqPessoa;
    }

    public void setseqPessoa(Integer seqPessoa) {
        this.seqPessoa = seqPessoa;
    }
    
    
    
}

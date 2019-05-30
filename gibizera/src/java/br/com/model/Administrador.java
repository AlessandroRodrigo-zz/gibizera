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

    public Administrador(Integer seqPessoa) {
        this.seqPessoa = seqPessoa;
    }

    public Administrador(Integer seqPessoa, Integer idPessoa, String nomePessoa, String cpfPessoa, String enderecoPessoa, String situacaoPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, enderecoPessoa, situacaoPessoa);
        this.seqPessoa = seqPessoa;
    }

    public Integer getseqPessoa() {
        return seqPessoa;
    }

    public void setseqPessoa(Integer seqPessoa) {
        this.seqPessoa = seqPessoa;
    }  
    
}

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
public class Usuario extends Pessoa{
    
    private Integer seqUsuario;
    private Integer cpfUsuario;
    private Integer pontuacaoUsuario;
    private Integer conquistaUsuario;
    private Integer tempoUsuario;

    public Usuario(Integer seqUsuario, Integer cpfUsuario, Integer conquistaUsuario, Integer tempoUsuario) {
        this.seqUsuario = seqUsuario;
        this.cpfUsuario = cpfUsuario;
        this.conquistaUsuario = conquistaUsuario;
        this.tempoUsuario = tempoUsuario;
    }

    public Usuario(Integer seqUsuario, Integer cpfUsuario, Integer conquistaUsuario, Integer tempoUsuario, Integer idPessoa, String nomePessoa, String cpfPessoa, String enderecoPessoa, String situacaoPessoa) {
        super(idPessoa, nomePessoa, cpfPessoa, enderecoPessoa, situacaoPessoa);
        this.seqUsuario = seqUsuario;
        this.cpfUsuario = cpfUsuario;
        this.conquistaUsuario = conquistaUsuario;
        this.tempoUsuario = tempoUsuario;
    }



    public Integer getSeqUsuario() {
        return seqUsuario;
    }

    public void setSeqUsuario(Integer seqUsuario) {
        this.seqUsuario = seqUsuario;
    }

    public Integer getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(Integer cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public Integer getPontuacaoUsuario() {
        return pontuacaoUsuario;
    }

    public void setPontuacaoUsuario(Integer pontuacaoUsuario) {
        this.pontuacaoUsuario = pontuacaoUsuario;
    }

    public Integer getConquistaUsuario() {
        return conquistaUsuario;
    }

    public void setConquistaUsuario(Integer conquistaUsuario) {
        this.conquistaUsuario = conquistaUsuario;
    }

    public Integer getTempoUsuario() {
        return tempoUsuario;
    }

    public void setTempoUsuario(Integer tempoUsuario) {
        this.tempoUsuario = tempoUsuario;
    }
    
    
}

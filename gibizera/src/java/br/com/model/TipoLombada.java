/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model;

/**
 *
 * @author Aluno
 */
public class TipoLombada {
    
    private int iSeqTipoLombada;
    private String iDescricao;
    private String situacao;

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public TipoLombada() {
    }

    public int getiSeqTipoLombada() {
        return iSeqTipoLombada;
    }

    public void setiSeqTipoLombada(int iSeqTipoLombada) {
        this.iSeqTipoLombada = iSeqTipoLombada;
    }

    public String getiDescricao() {
        return iDescricao;
    }

    public void setiDescricao(String iDescricao) {
        this.iDescricao = iDescricao;
    }
    
    
}

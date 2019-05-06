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
public class TipoPapel {
    
    private int iSeqTipoPapel;
    private String iDescricao;

    public TipoPapel() {
    }

    public int getiSeqTipoPapel() {
        return iSeqTipoPapel;
    }

    public void setiSeqTipoPapel(int iSeqTipoPapel) {
        this.iSeqTipoPapel = iSeqTipoPapel;
    }

    public String getiDescricao() {
        return iDescricao;
    }

    public void setiDescricao(String iDescricao) {
        this.iDescricao = iDescricao;
    }
    
    
    
}

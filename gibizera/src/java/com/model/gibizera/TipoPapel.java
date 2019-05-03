/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.gibizera;

/**
 *
 * @author alessandro
 */
public class TipoPapel {
    private int idTipoPapel;
    private String descricao;

    public TipoPapel() {
    }

    public TipoPapel(int idTipoPapel, String descricao) {
        this.idTipoPapel = idTipoPapel;
        this.descricao = descricao;
    }

    public int getIdTipoPapel() {
        return idTipoPapel;
    }

    public void setIdTipoPapel(int idTipoPapel) {
        this.idTipoPapel = idTipoPapel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}

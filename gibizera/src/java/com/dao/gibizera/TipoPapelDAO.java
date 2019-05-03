/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.gibizera;

import com.model.gibizera.TipoLombada;
import com.utils.gibizera.ConnectionFactory;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author alessandro
 */
public class TipoPapelDAO implements GenericDAO {

    private Connection conexao;

    public TipoPapelDAO() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conectado com sucesso");
        } catch (Exception e) {
            throw new Exception("Problema ao conectar no " + "BD!" + "Erro: " + e.getMessage());
        }
    }

    @Override
    public Boolean cadastrar(Object objeto) {
        TipoLombada oTipoLombada = (TipoLombada) objeto;
        Boolean retorno = false;

        if (oTipoLombada.getIdTipoPapel() == 0) {
            retorno = this.inserir(oTipoLombada);
        } else {
            retorno = this.alterar(oTipoLombada);
        }
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean excluir(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object carregar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

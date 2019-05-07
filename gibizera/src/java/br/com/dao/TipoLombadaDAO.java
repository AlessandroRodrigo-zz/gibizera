/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.connectionFactory.ConnectionFactory;
import br.com.model.TipoLombada;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class TipoLombadaDAO implements GenericDAO{
    
    private Connection Conexao;

    public TipoLombadaDAO() throws Exception{
        try{
            this.Conexao = ConnectionFactory.getConnection();
            System.out.println("Conexão bem sucedida!");
        }catch (Exception ex){
            throw new Exception("Problemas com a conexão. Verifique" + "Erro:" + ex.getMessage());
        }
    }

    @Override
    public Boolean Cadastrar(Object objeto) {
    
    TipoLombada cTipoLombada = (TipoLombada) objeto;
        Boolean bRetorno = false;
        
        if (cTipoLombada.getiSeqTipoLombada() == 0) {
            bRetorno = this.Inserir(cTipoLombada);
        }
        else{
            bRetorno = this.Alterar(cTipoLombada);
        }
        return bRetorno;
    }

    @Override
    public Boolean Inserir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean Alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean Excluir(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Carregar(int Numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import java.sql.Connection;
import br.com.connectionFactory.ConnectionFactory;
import br.com.model.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class PessoaDAO{
    
    private Connection Connection;

        public PessoaDAO() throws Exception {
        try {
            this.Connection = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    public Integer Cadastrar(Pessoa pessoa) {
        
        PreparedStatement Stmt = null;
        ResultSet rs = null;
        Integer nSeqPessoa = null;

        String strSQL = "Insert Into Pessoa (nomePessoa, tipoPessoa, ufPessoa, cidadePessoa, telefonePessoa, loginPessoa, senhaPessoa, emailPessoa) "
                   + "values (?, ?, ?, ?, ?, ?, ?, ?) Returning (seqPessoa);";
        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setString(1, pessoa.getNomePessoa());
            Stmt.setString(2, pessoa.getTipoPessoa());
            Stmt.setString(3, pessoa.getUfPessoa());
            Stmt.setString(4, pessoa.getTelefonePessoa());
            Stmt.setString(5, pessoa.getLoginPessoa());
            Stmt.setString(6, pessoa.getSenhaPessoa());
            Stmt.setString(7, pessoa.getCidadePessoa());
            Stmt.setString(8, pessoa.getEmailPessoa());
            rs = Stmt.executeQuery();

            if (rs.next()) {
                nSeqPessoa = rs.getInt("seqPessoa");

            }
        } catch (SQLException ex) {
            System.out.println("Problema ao cadastrar Pessoa! Erro:" + ex.getMessage());
            ex.printStackTrace();
            
        } finally {
            try {
                ConnectionFactory.CloseConnection(Connection, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }

        }
        return nSeqPessoa;
    }

    public Boolean alterar(Pessoa pessoa) {
        PreparedStatement Stmt = null;
        /*PreparedStatement = prepara a intrução SQL*/

        String strSQL = "Update Pessoa Set nomePessoa = ?, loginPessoa = ?, senhaPessoa = ?, cidadePessoa = ?, telefonePessoa = ?, ufPessoa = ?, tipoPessoa = ?, emailPessoa = ? Where SeqPessoa = ?";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setString(1, pessoa.getNomePessoa());
            Stmt.setString(2, pessoa.getLoginPessoa());
            Stmt.setString(3, pessoa.getSenhaPessoa());
            Stmt.setString(4, pessoa.getCidadePessoa());
            Stmt.setString(5, pessoa.getTelefonePessoa());
            Stmt.setString(6, pessoa.getUfPessoa());
            Stmt.setString(7, pessoa.getTipoPessoa());
            Stmt.setString(8, pessoa.getEmailPessoa());
            
            Stmt.setInt(9, pessoa.getSeqPessoa());
            
            Stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Pessoa! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally {

            try {
                ConnectionFactory.CloseConnection(Connection, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    public Pessoa logarPessoa(String login, String senha) throws Exception{
        
        PreparedStatement Stmt = null;
        ResultSet rs = null;
        Pessoa cPessoa = null;

        String sql = "select * from pessoa where login=? and senha=?";             
        
        try {
            Stmt = Connection.prepareStatement(sql);
            Stmt.setString(1, login);
            Stmt.setString(2, senha);

            rs = Stmt.executeQuery();
            if (rs.next()) {
                cPessoa = new Pessoa();
                cPessoa.setSeqPessoa(rs.getInt("seqPessoa"));               
                cPessoa.setUfPessoa(rs.getString("ufPessoa"));
                cPessoa.setTipoPessoa(rs.getString("tipoPessoa"));
                cPessoa.setCidadePessoa(rs.getString("cidadePessoa"));
                cPessoa.setNomePessoa(rs.getString("nomePessoa"));
                cPessoa.setTelefonePessoa(rs.getString("telefonePessoa"));
                cPessoa.setLoginPessoa(rs.getString("loginPessoa"));
                cPessoa.setSenhaPessoa(rs.getString("senhaPessoa"));
                cPessoa.setEmailPessoa(rs.getString("emailPessoa"));
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao logar Pessoa! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.CloseConnection(Connection, Stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:"
                        + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return cPessoa;
    }
        
}

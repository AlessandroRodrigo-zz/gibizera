/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.connectionFactory.ConnectionFactory;
import br.com.model.TipoPapel;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class TipoPapelDAO implements GenericDAO {
    
    private Connection conexao;
    
    public TipoPapelDAO() throws Exception {
        try {
            this.conexao = ConnectionFactory.getConnection();
            System.out.println("Conexão bem sucedida!");
        } catch (Exception ex) {
            throw new Exception("Problemas com a conexão. Verifique." + " Erro:" + ex.getMessage());
        }
    }
    
    @Override
    public Boolean Cadastrar(Object objeto) {
        
        TipoPapel cTipoPapel = (TipoPapel) objeto;
        Boolean bRetorno = false;
        
        if (cTipoPapel.getiSeqTipoPapel() == 0) {
            bRetorno = this.Inserir(cTipoPapel);
        } else {
            bRetorno = this.Alterar(cTipoPapel);
        }
        return bRetorno;
    }
    
    @Override
    public Boolean Inserir(Object objeto) {
        
        TipoPapel cTipoPapel = (TipoPapel) objeto;
        PreparedStatement Stmt = null;

        //Prepara comando SQL
        String strSQL = "Insert Into TipoPapel (SeqTipoPapel, Descricao) Values (?, ?);";
        
        try {
            Stmt = conexao.prepareStatement(strSQL);
            
            try {
                Stmt.setInt(1, new TipoPapel().getiSeqTipoPapel());
                Stmt.setString(2, new TipoPapel().getiDescricao());
                
            } catch (Exception ex) {
                System.out.println("Problemas ao cadastrar Tipo do Papel! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
            Stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Tipo do Papel! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally {
            try {
                ConnectionFactory.CloseConnection(conexao, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
            
        }
    }
    
    @Override
    public Boolean Alterar(Object objeto) {
        
        TipoPapel cTipoPapel = (TipoPapel) objeto;
        PreparedStatement Stmt = null;

        /*PreparedStatement = prepara a intrução SQL*/
        String strSQL = " Update TipoPapel set Descricao = ? Where SeqTipoPapel = ?;";
        
        try {
            Stmt = conexao.prepareStatement(strSQL);
            Stmt.setString(1, new TipoPapel().getiDescricao());
            
            Stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Tipo do Papel! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;
            
        } finally {
            
            try {
                ConnectionFactory.CloseConnection(conexao, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
    
    @Override
    public Boolean Excluir(Object objeto) {
        TipoPapel oTipoPapel = (TipoPapel) objeto;
        int idTipoPapel = oTipoPapel.getiSeqTipoPapel();
        PreparedStatement stmt = null;
        String situacao = "";
        if (oTipoPapel.getSituacaoPapel().equals(situacao)) {
            situacao = "I";
        } else {
            situacao = "A";
        }
        String sql = "update tipolombada set situacao=? where idtipolombada=?";
        
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, situacao);
            stmt.setInt(2, idTipoPapel);
            stmt.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Problemas ao excluir Tipo Papel! Erro: " + e.getMessage());
            return false;
        }
    }
    
    @Override
    public Object Carregar(int numero) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoPapel cTipoPapel = null;
        
        String strSQL = "Select T.* From TipoPapel P Where T.SeqTipoPapel = ?;";
        try {
            stmt = conexao.prepareStatement(strSQL);
            stmt.setInt(1, numero);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                cTipoPapel = new TipoPapel();
                cTipoPapel.setiSeqTipoPapel(rs.getInt("SeqTipoPapel"));
                cTipoPapel.setiDescricao(rs.getString("Descricao"));
                cTipoPapel.setSituacaoPapel(rs.getString("situacao"));
            }
            return cTipoPapel;
        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Tipo do Papel! Erro: " + ex.getMessage());
            ex.printStackTrace();
            
        } finally {
            try {
                ConnectionFactory.CloseConnection(conexao, stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return cTipoPapel;
    }
    
    @Override
    public List<Object> Listar() {
        
        List<Object> listaResultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        String strSQL = "Select T.* from TipoPapel T Where T.SeqTipoPapel = ? Order By T.Descricao;";
        
        try {
            stmt = conexao.prepareStatement(strSQL);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                TipoPapel cTipoPapel = new TipoPapel();
                cTipoPapel.setiSeqTipoPapel(rs.getInt("SeqTipoPapel"));
                cTipoPapel.setiDescricao(rs.getString("Descricao"));
                cTipoPapel.setSituacaoPapel("situacao");
                listaResultado.add(cTipoPapel);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Tipo do Papel! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.CloseConnection(conexao, stmt, rs);
                
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return listaResultado;
    }
    
}

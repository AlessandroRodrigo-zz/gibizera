/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.connectionFactory.ConnectionFactory;
import br.com.model.TipoLombada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class TipoLombadaDAO implements GenericDAO {

    private Connection Conn;

    public TipoLombadaDAO() throws Exception {
        try {
            this.Conn = ConnectionFactory.getConnection();
            System.out.println("Conexão bem sucedida!");
        } catch (Exception ex) {
            throw new Exception("Problemas com a conexão. Verifique" + "Erro:" + ex.getMessage());
        }
    }

    @Override
    public Boolean Cadastrar(Object objeto) {

        TipoLombada cTipoLombada = (TipoLombada) objeto;
        Boolean bRetorno = false;

        if (cTipoLombada.getiSeqTipoLombada() == 0) {
            bRetorno = this.Inserir(cTipoLombada);
        } else {
            bRetorno = this.Alterar(cTipoLombada);
        }
        return bRetorno;
    }

    @Override
    public Boolean Inserir(Object objeto) {
        TipoLombada cTipoPapel = (TipoLombada) objeto;
        PreparedStatement Stmt = null;

        //Prepara comando SQL
        String strSQL = "Insert Into TipoLombada (Descricao) Values (?);";

        try {
            Stmt = Conn.prepareStatement(strSQL);

            try {
                Stmt.setString(1, new TipoLombada().getiDescricao());

            } catch (Exception ex) {
                System.out.println("Problemas ao cadastrar Tipo Lombada! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
            Stmt.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Tipo Lombada! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;

        } finally {
            try {
                ConnectionFactory.CloseConnection(Conn, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }

        }
    }

    @Override
    public Boolean Alterar(Object objeto) {
        TipoLombada cTipoLombada = (TipoLombada) objeto;
        PreparedStatement Stmt = null;

        /*PreparedStatement = prepara a intrução SQL*/
        String strSQL = " Update TipoLombada set Descricao = ? Where SeqTipoLombada = ?;";

        try {
            Stmt = Conn.prepareStatement(strSQL);
            Stmt.setString(1, new TipoLombada().getiDescricao());
            Stmt.setInt(2, new TipoLombada().getiSeqTipoLombada());

            Stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Tipo Lombada! Erro:" + ex.getMessage());
            ex.printStackTrace();
            return false;

        } finally {

            try {
                ConnectionFactory.CloseConnection(Conn, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Object Carregar(int Numero) {

        PreparedStatement Stmt = null;
        ResultSet rs = null;
        TipoLombada cTipoLombada = null;

        String strSQL = "Select T.* From TipoLombada T Where T.SeqTipoLombada = ?";

        try {
            Stmt = Conn.prepareStatement(strSQL);
            Stmt.setInt(1, Numero);
            rs = Stmt.executeQuery();

            while (rs.next()) {
                cTipoLombada = new TipoLombada();
                cTipoLombada.setiSeqTipoLombada(rs.getInt("SeqTipoLombada"));
                cTipoLombada.setiDescricao(rs.getString("Descricao"));
                cTipoLombada.setSituacao(rs.getString("Situacao"));
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Tipo Lombada! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.CloseConnection(Conn, Stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar parâmetro de conexão! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return cTipoLombada;
    }

    @Override
    public List<Object> Listar() {
        List<Object> Lista = new ArrayList<>();
        PreparedStatement Stmt = null;
        ResultSet rs = null;

        String strSQL = "Select T.* from TipoPapel T Where T.SeqTipoPapel = ? Order By T.Descricao;";

        try {
            Stmt = Conn.prepareStatement(strSQL);
            rs = Stmt.executeQuery();

            while (rs.next()) {
                TipoLombada cTipoLombada = new TipoLombada();
                cTipoLombada.setiSeqTipoLombada(rs.getInt("SeqTipoLombada"));
                cTipoLombada.setiDescricao(rs.getString("Descricao"));
                cTipoLombada.setSituacao(rs.getString("Situacao"));
                Lista.add(cTipoLombada);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Tipo Lombada! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.CloseConnection(Conn, Stmt, rs);

            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return Lista;
    }

    @Override
    public Boolean Excluir(Object objeto) {
        TipoLombada cTipoLombada = (TipoLombada) objeto;
        int idTipoLombada = cTipoLombada.getiSeqTipoLombada();

        PreparedStatement Stmt = null;
        String situacao = "A";

        if (cTipoLombada.getSituacao().equals(situacao)) {
            situacao = "I";
        } else {
            situacao = "A";
        }
        String strSQL = "Update TipoLombada Set Situacao = ? Where idTipoLombada = ?";

        try {
            Stmt = Conn.prepareStatement(strSQL);
            Stmt.setString(1, situacao);
            Stmt.setInt(2, idTipoLombada);
            Stmt.execute();
            
            return true;
        } catch (SQLException ex) {
            System.out.println("Problema ao excluir Tipo Lombada! Erro:" + ex.getMessage());
            ex.printStackTrace();

            return false;

        } finally {
            try {
                ConnectionFactory.CloseConnection(Conn, Stmt);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}

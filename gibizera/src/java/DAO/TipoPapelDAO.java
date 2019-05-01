/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectionBD.ConnectionFactory;
import Model.TipoPapel;
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

    private Connection Connection;

    public TipoPapelDAO() throws Exception {
        try {
            this.Connection = ConnectionFactory.getConnection();
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
            Stmt = Connection.prepareStatement(strSQL);

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
                ConnectionFactory.CloseConnection(Connection, Stmt);
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
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setString(1, new TipoPapel().getiDescricao());

            Stmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao alterar Tipo do Papel! Erro:" + ex.getMessage());
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

    @Override
    public Boolean Excluir(int Numero) {

        PreparedStatement Stmt = null;

        String strSQL = "Delete From TipoPapel Where SeqPapel = ?;"
                + "commit;";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setInt(1, Numero);
            Stmt.executeUpdate();

            return true;

        } catch (SQLException ex) {
            System.out.println("Problema ao excluir Tipo do papel! Erro:" + ex.getMessage());
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

    @Override
    public Object Carregar(int Numero) {

        PreparedStatement Stmt = null;
        ResultSet rs = null;
        TipoPapel cTipoPapel = null;

        String strSQL = "Select T.* From TipoPapel P Where T.SeqTipoPapel = ?;";
        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setInt(1, Numero);
            rs = Stmt.executeQuery();

            if (rs.next()) {
                cTipoPapel = new TipoPapel();
                cTipoPapel.setiSeqTipoPapel(rs.getInt("SeqTipoPapel"));
                cTipoPapel.setiDescricao(rs.getString("Descricao"));
            }

        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Tipo do Papel! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.CloseConnection(Connection, Stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return cTipoPapel;
    }

    @Override
    public List<Object> Listar() {
        
        List<Object> Lista = new ArrayList<>();
        PreparedStatement Stmt = null;
        ResultSet rs = null;

        String strSQL = "Select T.* from TipoPapel T Where T.SeqTipoPapel = ? Order By T.Descricao;";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            rs = Stmt.executeQuery();

            while (rs.next()) {
                TipoPapel cTipoPapel = new TipoPapel();
                cTipoPapel.setiSeqTipoPapel(rs.getInt("SeqTipoPapel"));
                cTipoPapel.setiDescricao(rs.getString("Descricao"));
                Lista.add(cTipoPapel);
            }
        } catch (SQLException ex) {
            System.out.println("Problemas ao listar Tipo do Papel! Erro: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                ConnectionFactory.CloseConnection(Connection, Stmt, rs);

            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return Lista;
    }

}

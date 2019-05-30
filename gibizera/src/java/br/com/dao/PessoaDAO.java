/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.connectionFactory.ConnectionFactory;
import static br.com.connectionFactory.ConnectionFactory.getConnection;
import br.com.model.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Flavio Prado
 */
public class PessoaDAO implements GenericDAO {

    private Connection Connection;

    public PessoaDAO() throws Exception {
        try {
            this.Connection = ConnectionFactory.getConnection();
            System.out.println("Conectado com Sucesso!");
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    @Override
    public Boolean Cadastrar(Object objeto) {

        Pessoa cPessoa = (Pessoa) objeto;
        Boolean bRetorno = false;

        if (cPessoa.getIdPessoa()== 0 || cPessoa.getIdPessoa() == null) {
            bRetorno = this.Inserir(cPessoa);
        } else {
            bRetorno = this.Alterar(cPessoa);
        }
        return bRetorno;
    }

    @Override
    public Boolean Inserir(Object objeto) {

        Pessoa cPessoa = (Pessoa) objeto;
        PreparedStatement Stmt = null;

        //Prepara comando SQL
        String strSQL = "Insert Into Pessoa (IdPessoa, NomePessoa, CPFPessoa, EnderecoPessoa, SituacaoPessoa) Values (?, ?, ?, ? , ?);";

        try {
            Stmt = Connection.prepareStatement(strSQL);

            try {
                Stmt.setInt(1, NewSequence());
                Stmt.setString(2, cPessoa.getNomePessoa());
                Stmt.setString(3, cPessoa.getCpfPessoa());
                Stmt.setString(4, cPessoa.getEnderecoPessoa());
                Stmt.setString(5, cPessoa.getSituacaoPessoa());

            } catch (Exception ex) {
                System.out.println("Problemas ao cadastrar Pessoa! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
            Stmt.execute();
            return true;

        } catch (SQLException ex) {
            System.out.println("Problemas ao cadastrar Pessoa! Erro:" + ex.getMessage());
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

        Pessoa cPessoa = (Pessoa) objeto;
        PreparedStatement Stmt = null;

        /*PreparedStatement = prepara a intrução SQL*/
        String strSQL = " Update Pessoa set NomePessoa = ?, CPFPessoa = ?, EnderecoPessoa = ?, SituacaoPessoa = ? Where IdPessoa = ?;";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setString(1, cPessoa.getNomePessoa());
            Stmt.setString(2, cPessoa.getCpfPessoa());
            Stmt.setString(3, cPessoa.getEnderecoPessoa());
            Stmt.setString(4, cPessoa.getSituacaoPessoa());
            Stmt.setInt(5, cPessoa.getIdPessoa());

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

    @Override
    public Boolean Excluir(Object objeto) {

        Pessoa cPessoa = (Pessoa) objeto;
        int idPessoa = cPessoa.getIdPessoa();
        PreparedStatement stmt = null;
        String situacao = "";

        if (cPessoa.getSituacaoPessoa().equals(situacao)) {
            situacao = "I";
        } else {
            situacao = "A";
        }

        String strSQL = "Update Pessoa set SituacaoPessoa = ? where idPessoa = ?";

        try {
            stmt = Connection.prepareStatement(strSQL);
            stmt.setString(1, situacao);
            stmt.setInt(2, idPessoa);
            stmt.execute();
            return true;

        } catch (Exception e) {
            System.out.println("Problemas ao inativar Pessoa! Erro: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Object Carregar(int Numero) {

        PreparedStatement Stmt = null;
        ResultSet rs = null;
        Pessoa cPessoa = null;

        String strSQL = "Select P.* From Pessoa P Where P.idPessoa = ?;";
        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setInt(1, Numero);
            rs = Stmt.executeQuery();

            while (rs.next()) {
                cPessoa = new Pessoa();
                cPessoa.setIdPessoa(rs.getInt("IdPessoa"));
                cPessoa.setNomePessoa(rs.getString("NomePessoa"));
                cPessoa.setCpfPessoa(rs.getString("CPFPessoa"));
                cPessoa.setEnderecoPessoa(rs.getString("EnderecoPessoa"));
                cPessoa.setSituacaoPessoa(rs.getString("SituacaoPessoa"));
            }
            return cPessoa;

        } catch (SQLException ex) {
            System.out.println("Problemas ao carregar Pessoa! Erro: " + ex.getMessage());
            ex.printStackTrace();

        } finally {
            try {
                ConnectionFactory.CloseConnection(Connection, Stmt, rs);
            } catch (Exception ex) {
                System.out.println("Problemas ao fechar os parâmetros de conexão! Erro:" + ex.getMessage());
                ex.printStackTrace();
            }
        }
        return cPessoa;
    }

    @Override
    public List<Object> Listar() {

        List<Object> listaPessoa = new ArrayList<>();
        PreparedStatement Stmt = null;
        ResultSet rs = null;

        String strSQL = "Select P.* from Pessoa P Where P.IdPessoa = ? Order By P.Nome;";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            Stmt.setInt(1, new Pessoa().getIdPessoa());
            rs = Stmt.executeQuery();

            while (rs.next()) {
                Pessoa cPessoa = new Pessoa();
                cPessoa.setIdPessoa(rs.getInt("IdPessoa"));
                cPessoa.setNomePessoa(rs.getString("NomePessoa"));
                cPessoa.setCpfPessoa(rs.getString("CPFPessoa"));
                cPessoa.setEnderecoPessoa(rs.getString("EnderecoPessoa"));
                cPessoa.setSituacaoPessoa(rs.getString("SituacaoPessoa"));
                listaPessoa.add(cPessoa);
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
        return listaPessoa;
    }

    public int NewSequence() {
        PreparedStatement Stmt = null;
        ResultSet rs;
        int NewSequence = 0;

        String strSQL = "Select Max(idPessoa) + 1 as NewSequence From Pessoa;";

        try {
            Stmt = Connection.prepareStatement(strSQL);
            rs = Stmt.executeQuery();
            if (rs.next()) {
                NewSequence = rs.getInt("NewSequence");
            }
            Stmt.close();
        } catch (Exception ex) {
            System.out.println("Problemas ao crica um sequence para Pessoa! Erro:" + ex.getMessage());
            ex.printStackTrace();
        }
        return NewSequence;
    }
}

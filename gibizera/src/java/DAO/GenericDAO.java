/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TipoPapel;
import Model.TipoLombada;
import java.util.List;

/**
 *
 * @author Aluno
 */
public interface GenericDAO {
    
    public Boolean Cadastrar(Object objeto);
    public Boolean Inserir(Object objeto);
    public Boolean Alterar(Object objeto);
    public Boolean Excluir(int Numero);    
    public Object Carregar(int Numero);
    public List<Object> Listar();
    
    
}

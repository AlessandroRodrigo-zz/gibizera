/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.controller.Pessoa;

import br.com.dao.GenericDAO;
import br.com.dao.PessoaDAO;
import br.com.model.Pessoa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Flavio Prado
 */
@WebServlet(name = "SalvarPessoa", urlPatterns = {"/SalvarPessoa"})
public class SalvarPessoa extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /*Pega da Tela*/
        String mensagem = null;
        Integer idPessoa = Integer.parseInt(request.getParameter("IdPessoa"));
        String nomePessoa = request.getParameter("NomePessoa");
        String cpfPessoa = request.getParameter("CPFPessoa");
        String enderecoPessoa = request.getParameter("EnderecoPessoa");
        String situacaoPessoa = request.getParameter("SituacaoPessoa");
        
        /*Manda pra classe*/
        Pessoa cPessoa = new Pessoa();
        cPessoa.setNomePessoa(nomePessoa);
        cPessoa.setCpfPessoa(cpfPessoa);
        cPessoa.setEnderecoPessoa(enderecoPessoa);
        cPessoa.setSituacaoPessoa(situacaoPessoa);
        
        
        /*Se ja tiver ID, manda pra classe*/
        if (idPessoa != null || idPessoa != 0) {            
            cPessoa.setIdPessoa(idPessoa);
        }

        try {
            GenericDAO daoPessoa = new PessoaDAO();
            if (cPessoa.getIdPessoa() == 0 || cPessoa.getIdPessoa() == null){
                if (daoPessoa.Cadastrar(cPessoa)) {
                    mensagem = "Pessoa cadastrada com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Pessoa!";
                }
            } else if (daoPessoa.Alterar(cPessoa)) {
                mensagem = "Pessoa alterado com sucesso!";
            } else {
                mensagem = "Problema ao alterar Pessoa!";
            }
            request.setAttribute("Sucesso", mensagem);
            request.getRequestDispatcher("Pessoa/index.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("Sucesso", ex.getMessage());
            request.getRequestDispatcher("Pessoa/index.jsp").forward(request, response);
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.controller;

import br.com.dao.GenericDAO;
import br.com.dao.TipoPapelDAO;
import br.com.model.TipoPapel;
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
@WebServlet(name = "SalvarTipoPapel", urlPatterns = {"/SalvarTipoPapel"})
public class SalvarTipoPapel extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        /*Pega da Tela*/
        String mensagem = null;
        Integer idTipoPapel = Integer.parseInt(request.getParameter("idTipoPapel"));
        String descricaoTipoPapel = request.getParameter("descricaoTipoPapel");
        String situacaoTipoPapel = request.getParameter("situacaoTipoPapel");
        
        /*Manda pra classe*/
        TipoPapel cTipoPapel = new TipoPapel();
        cTipoPapel.setiDescricao(descricaoTipoPapel);
        cTipoPapel.setSituacaoPapel(situacaoTipoPapel);
        
        /*Se ja tiver ID, manda pra classe*/
        if (request.getParameter("idTipoPapel") != null) {            
            cTipoPapel.setiSeqTipoPapel(idTipoPapel);
        }

        try {
            GenericDAO daoTipoPapel = new TipoPapelDAO();
            if (cTipoPapel.getiSeqTipoPapel() == 0){
                if (daoTipoPapel.Cadastrar(cTipoPapel)) {
                    mensagem = "Tipo do Papel cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar Tipo do Papel!";
                }
            } else if (daoTipoPapel.Alterar(cTipoPapel)) {
                mensagem = "Tipo do Papel alterado com sucesso!";
            } else {
                mensagem = "Problema ao alterar Tipo do Papel!";
            }
            request.setAttribute("Sucesso", mensagem);
            request.getRequestDispatcher("TipoPapel/CadastrarTipoPapel.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Problemas ao cadastrar Tipo do Papel! Erro:" + ex.getMessage());
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

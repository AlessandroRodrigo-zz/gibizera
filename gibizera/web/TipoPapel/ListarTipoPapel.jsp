<%-- 
    Document   : ListarTipoPapel
    Created on : 14/05/2019, 10:17:55
    Author     : Flavio Prado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipos de Papéis</title>
    </head>
    <body>
        <div class="container">
            <h3>Tipos de Papéis</h3>
        </div>
        <table class="table table-hover">
            <thead>
                <tr>                                    
                    <th>ID</th>
                    <th class="text-left">Descricão</th>
                    <th class="text-left">Situação</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="TipoPapel" items="${TipoPapeis}">
                    <tr> 
                        <td>${TipoPapel.iSeqTipoPapel}</td>
                        <td>${TipoPapel.iDescricao}</td>
                        <td>${TipoPapel.situacaoPapel}</td>                                                                                             
                        <td><a href="${pageContext.request.contextPath}/ExcluirTipoPapel?idpessoa=${TipoPapel.iSeqTipoPapel}">Excluir</a></td>
                        <td><a href="${pageContext.request.contextPath}/CarregarTipoPapel?idpessoa=${TipoPapel.iSeqTipoPapel}">Alterar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

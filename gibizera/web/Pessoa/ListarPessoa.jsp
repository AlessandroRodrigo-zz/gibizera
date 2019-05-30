<%-- 
    Document   : ListarPessoa
    Created on : 29/05/2019, 10:08:12
    Author     : Flavio Prado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Pessoas</title>
    </head>
    <body>
        <div class="container">
            <h3>Pessoas</h3>
        </div>
        <br><br>
    <center><a href="index.jsp" class="btn">Voltar</a></center>

    <center>
        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">CPF</th>
                    <th scope="col">Endereço</th>
                    <th scope="col">Situação</th>                    
                </tr>
            </thead>
            <tbody>
            <c:forEach var="Pessoa" items="${Pessoas}">
                <tr> 
                    <td>${Pessoa.idPessoa}</td>
                    <td>${Pessoa.nomePessoa}</td>
                    <td>${Pessoa.cfpPessoa}</td>                                                                                             
                    <td>${Pessoa.enderecoPessoa}</td>                                                                                             
                    <td>${Pessoa.situacaoPessoa}</td>                                                                                             
                    <td><a href="${pageContext.request.contextPath}/ExcluirPessoa?idPessoa=${Pessoa.idPessoa}">Excluir</a></td>
                    <td><a href="${pageContext.request.contextPath}/CarregarPessoa?idPessoa=${Pessoa.idPessoa}">Alterar</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </center>
</body>
</html>

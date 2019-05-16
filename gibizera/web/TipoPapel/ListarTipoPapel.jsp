<%-- 
    Document   : ListarTipoPapel
    Created on : 14/05/2019, 10:17:55
    Author     : Flavio Prado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Favicons -->
        <link href="../img/favicon.png" rel="icon">
        <!--<link href="img/apple-touch-icon.png" rel="apple-touch-icon">-->

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800" rel="stylesheet">

        <!-- Bootstrap CSS File -->
        <link href="../Admininastrô/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- Libraries CSS Files -->
        <link href="../Admininastrô/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="../Admininastrô/lib/animate/animate.min.css" rel="stylesheet">
        <link href="../Admininastrô/lib/venobox/venobox.css" rel="stylesheet">
        <link href="../Admininastrô/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!--CSS-->
        <link href="../Admininastrô/css/style.css" rel="stylesheet" type="text/css"/>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tipos de Papéis</title>
    </head>
    <body>
        <div class="container">
            <h3>Tipos de Papéis</h3>
        </div>
        <br><br>
    <center><a href="../Admininastrô/index.jsp" class="btn">Voltar para a página do Admininastrô</a></center>
    <center><table class="table table-hover">
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
        </table></center>F
</body>
</html>

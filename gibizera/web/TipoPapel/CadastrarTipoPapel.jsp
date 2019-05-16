<%-- 
    Document   : Alterar
    Created on : 14/05/2019, 10:11:22
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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="modal-logar">
            <div id="Cadastro">
                <form name="SalvarTipoPapel" action="${pageContext.request.contextPath}/SalvarTipoPapel" method="POST">
                    <center>
                        <h1><span>Cadastro do </span>Tipo do Papel</h1>

                        <input placeholder="Id" type="number" name="idTipoPapel" value="${TipoPapel.iSeqTipoPapel}" tabindex="1" required autofocus/>
                        <br>
                        <br>
                        <input placeholder="Descrição" type="text" name="descricaoTipoPapel" value="${TipoPapel.iDescricao}" tabindex="2" required autofocus>
                        <br>
                        <br>
                        <input placeholder="Situacao" type="text" name="situacaoTipoPapel" value="${TipoPapel.iDescricao}" tabindex="3" required autofocus>
                        <br>
                        <br>
                        <button name="submit" type="submit" id="contact-submit" data-submit="...Enviando">Cadastrar</button>

                        <br><br>
                        <a href="../Admininastrô/index.jsp" class="btn">Voltar para a página do Admininastrô</a>
                    </center>
                </form>
            </div>
        </div>
    </body>
</html>

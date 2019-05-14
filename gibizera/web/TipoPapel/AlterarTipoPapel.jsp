<%-- 
    Document   : Alterar
    Created on : 14/05/2019, 10:11:22
    Author     : Flavio Prado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form id="Cadastro" name="SalvarTipoPapel" action="${pageContext.request.contextPath}/SalvarTipoPapel" method="POST">
                <h3>Cadastro Usuário</h3>

                <fieldset>
                    <input placeholder="Id" type="text" name="idpessoa" value="${jogador.idPessoa}" tabindex="1" readonly autofocus/>
                </fieldset>
                <fieldset>
                    <input placeholder="Nome" type="text" name="nomepessoa" value="${jogador.nomePessoa}" tabindex="1" required autofocus>
                </fieldset>
                <fieldset>
                    <select name="ufpessoa">
                        <option ${jogador.ufPessoa == 'E' ? 'selected' : ''} value="E">Estado</option>
                        <option ${jogador.ufPessoa == 'AC' ? 'selected' : ''} value="AC">Acre</option>
                        <option ${jogador.ufPessoa == 'AL' ? 'selected' : ''} value="AL">Alagoas</option>
                        <option ${jogador.ufPessoa == 'AP' ? 'selected' : ''} value="AP">Amapá</option>
                        <option ${jogador.ufPessoa == 'AM' ? 'selected' : ''} value="AM">Amazonas</option>
                        <option ${jogador.ufPessoa == 'BA' ? 'selected' : ''} value="BA">Bahia</option>
                        <option ${jogador.ufPessoa == 'CE' ? 'selected' : ''} value="CE">Ceará</option>
                        <option ${jogador.ufPessoa == 'DF' ? 'selected' : ''} value="DF">Distrito Federal</option>
                        <option ${jogador.ufPessoa == 'ES' ? 'selected' : ''} value="ES">Espírito Santo</option>
                        <option ${jogador.ufPessoa == 'GO' ? 'selected' : ''} value="GO">Goiás</option>
                        <option ${jogador.ufPessoa == 'MA' ? 'selected' : ''} value="MA">Maranhão</option>
                        <option ${jogador.ufPessoa == 'MT' ? 'selected' : ''} value="MT">Mato Grosso</option>
                        <option ${jogador.ufPessoa == 'MS' ? 'selected' : ''} value="MS">Mato Grosso do Sul</option>
                        <option ${jogador.ufPessoa == 'MG' ? 'selected' : ''} value="MG">Minas Gerais</option>
                        <option ${jogador.ufPessoa == 'PA' ? 'selected' : ''} value="PA">Pará</option>
                        <option ${jogador.ufPessoa == 'PB' ? 'selected' : ''} value="PB">Paraíba</option>
                        <option ${jogador.ufPessoa == 'PR' ? 'selected' : ''} value="PR">Paraná</option>
                        <option ${jogador.ufPessoa == 'PE' ? 'selected' : ''} value="PE">Pernambuco</option>
                        <option ${jogador.ufPessoa == 'PI' ? 'selected' : ''} value="PI">Piauí</option>
                        <option ${jogador.ufPessoa == 'RJ' ? 'selected' : ''} value="RJ">Rio de Janeiro</option>
                        <option ${jogador.ufPessoa == 'RN' ? 'selected' : ''} value="RN">Rio Grande do Norte</option>
                        <option ${jogador.ufPessoa == 'RS' ? 'selected' : ''} value="RS">Rio Grande do Sul</option>
                        <option ${jogador.ufPessoa == 'RO' ? 'selected' : ''} value="RO">Rondônia</option>
                        <option ${jogador.ufPessoa == 'RR' ? 'selected' : ''} value="RR">Roraima</option>
                        <option ${jogador.ufPessoa == 'SC' ? 'selected' : ''} value="SC">Santa Catarina</option>
                        <option ${jogador.ufPessoa == 'SP' ? 'selected' : ''} value="SP">São Paulo</option>
                        <option ${jogador.ufPessoa == 'SE' ? 'selected' : ''} value="SE">Sergipe</option>
                        <option ${jogador.ufPessoa == 'TO' ? 'selected' : ''} value="TO">Tocantins</option>
                    </select>
                </fieldset>                
                <fieldset>
                    <select name="tipopessoa" required>                        
                        <option value="jogador" selected>Jogador</option>
                    </select>
                </fieldset>
                <fieldset>
                    <input placeholder="Telefone" type="tel" name="telefonepessoa" value="${jogador.telefonePessoa}" tabindex="3" required>
                </fieldset>
                <fieldset>
                    <input placeholder="Cidade" type="text" name="cidadepessoa" value="${jogador.cidadePessoa}" tabindex="4" required>
                </fieldset>
                <fieldset>
                    <input placeholder="Escola" type="text" name="escolajogador" value="${jogador.escolaJogador}" required>
                </fieldset>
                <fieldset>
                    <input placeholder="Data de Nascimento" type="date" name="datanascimentojogador" value="${jogador.dataNascimentoJogador}" required>
                </fieldset>
                <fieldset>
                    <input placeholder="Login" type="text" name="loginpessoa" value="${jogador.loginPessoa}"  required>
                </fieldset>
                <fieldset>
                    <input id="senha1" placeholder="Senha" type="password" name="senhapessoa" value="${jogador.senhaPessoa}"  required>
                </fieldset>
                <fieldset>
                    <input id="senha2" onblur="verificarSenha();" placeholder="Repita sua senha" type="password"  required>
                </fieldset>                
                <fieldset>
                    <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Cadastrar</button>
                </fieldset>

            </form>
    </body>
</html>

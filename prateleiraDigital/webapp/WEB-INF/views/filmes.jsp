<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Filmes | Prateleira Digital</title>
</head>
<body>
<main>
    <h1>Prateleira Digital</h1>

    <c:if test="${empty filmes}">
        <p>Nenhum filme cadastrado.</p>
    </c:if>

    <c:if test="${not empty filmes}">
        <table>
            <caption>Filmes cadastrados</caption>
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Título</th>
                    <th scope="col">Diretores</th>
                    <th scope="col">Nota</th>
                    <th scope="col">Ano</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="filme" items="${filmes}">
                    <tr>
                        <td>${filme.id}</td>
                        <td><c:out value="${filme.titulo}" /></td>
                        <td><c:out value="${filme.diretores}" /></td>
                        <td>${filme.nota}</td>
                        <td>${filme.ano}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</main>
</body>
</html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenido</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5 text-center">
    <h2>Bienvenido, ${pageContext.request.userPrincipal.name} 👋</h2>

    <p class="mt-3">Has iniciado sesión correctamente.</p>

    <c:if test="${pageContext.request.isUserInRole('ROLE_ADMINISTRADOR')}">
        <a href="/vehiculos/listar" class="btn btn-primary mt-3">Gestionar Vehículos</a>
    </c:if>

    <c:if test="${pageContext.request.isUserInRole('ROLE_ACOMODADOR')}">
        <a href="/vehiculos/listar" class="btn btn-warning mt-3">Actualizar ubicaciones</a>
    </c:if>

    <c:if test="${pageContext.request.isUserInRole('ROLE_CLIENTE')}">
        <a href="/vehiculos/listar" class="btn btn-success mt-3">Ver mis vehículos</a>
    </c:if>

    <div class="mt-4">
        <a href="/logout" class="btn btn-danger">Cerrar Sesión</a>
    </div>
</div>
</body>
</html>

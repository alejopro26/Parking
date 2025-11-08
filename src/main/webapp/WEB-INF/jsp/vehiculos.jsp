<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Listado de Vehículos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Vehículos registrados</h2>

    <c:if test="${pageContext.request.isUserInRole('ROLE_ADMINISTRADOR')}">
        <a href="/vehiculos/nuevo" class="btn btn-primary mb-3">Registrar nuevo vehículo</a>
    </c:if>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Placa</th>
            <th>Entrada</th>
            <th>Salida</th>
            <th>Ubicación</th>
            <th>Tipo</th>
            <c:if test="${!pageContext.request.isUserInRole('ROLE_CLIENTE')}">
                <th>Acciones</th>
            </c:if>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="v" items="${vehiculos}">
            <tr>
                <td>${v.id}</td>
                <td>${v.placa}</td>
                <td>${v.horaEntrada}</td>
                <td>${v.horaSalida}</td>
                <td>${v.ubicacion}</td>
                <td>${v.tipoVehiculo}</td>

                <c:if test="${pageContext.request.isUserInRole('ROLE_ADMINISTRADOR') || pageContext.request.isUserInRole('ROLE_ACOMODADOR')}">
                    <td>
                        <a href="/vehiculos/editar/${v.id}" class="btn btn-warning btn-sm">Editar</a>
                        <c:if test="${pageContext.request.isUserInRole('ROLE_ADMINISTRADOR')}">
                            <a href="/vehiculos/eliminar/${v.id}" class="btn btn-danger btn-sm">Eliminar</a>
                        </c:if>
                    </td>
                </c:if>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="/welcome" class="btn btn-secondary mt-3">Volver</a>
</div>
</body>
</html>

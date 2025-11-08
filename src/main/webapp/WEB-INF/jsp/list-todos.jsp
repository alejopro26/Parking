<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel='stylesheet' type='text/css' href='/webjars/bootstrap/3.3.6/css/bootstrap.min.css'>
    </head>
    <body>
        <div class="container">

            <div>
                <c:if test="${isAdmin}">
                    <form action="/add-todo">
                        <button type="submit" class="btn btn-primary">Adicionar Vehículo</button>
                    </form>
                </c:if>
            </div>

            <br>
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3>LISTA DE VEHÍCULOS</h3>
                    <p>ROL ${userRole}</p>
                </div>
                <div class="panel-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th width="20%">Número de usuario</th>
                                <th width="15%">Placa</th>
                                <th width="15%">Hora de entrada</th>
                                <th width="15%">Hora de salida</th>
                                <th width="20%">Ubicación</th>
                                <th width="15%">Tipo de vehículo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${todos}" var="todo" varStatus="status">
                                <tr>
                                    <td>${status.index + 1}</td>
                                    <td>${todo.plate}</td>
                                    <td>${todo.entryHour}</td>
                                    <td>${todo.exitHour}</td>
                                    <td>${todo.location}</td>
                                    <td>${todo.vehicleType}</td>
                                    <c:if test="${isAdmin}">
                                        <td>
                                            <a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Actualizar</a>
                                            <a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id}">Eliminar</a>
                                        </td>
                                    </c:if>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

<%@ include file="common/footer.jsp"%>

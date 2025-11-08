<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Inicio de sesión - Parqueadero</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="col-md-4 offset-md-4">
        <div class="card shadow-lg p-4">
            <h3 class="text-center mb-3">Acceso al Sistema</h3>
            <form action="<c:url value='/login'/>" method="post">
                <div class="mb-3">
                    <label for="username" class="form-label">Usuario</label>
                    <input type="text" id="username" name="username" class="form-control" required />
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Contraseña</label>
                    <input type="password" id="password" name="password" class="form-control" required />
                </div>

                <c:if test="${param.error != null}">
                    <div class="alert alert-danger">
                        Usuario o contraseña incorrectos.
                    </div>
                </c:if>

                <c:if test="${param.logout != null}">
                    <div class="alert alert-success">
                        Sesión cerrada correctamente.
                    </div>
                </c:if>

                <button type="submit" class="btn btn-primary w-100">Ingresar</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>



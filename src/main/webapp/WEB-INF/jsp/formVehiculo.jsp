<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Vehículo</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Registrar / Editar Vehículo</h2>

    <form action="/vehiculos/guardar" method="post">
        <input type="hidden" name="id" value="${vehiculo.id}" />

        <div class="mb-3">
            <label class="form-label">Placa</label>
            <input type="text" name="placa" value="${vehiculo.placa}" class="form-control" maxlength="6" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Hora de entrada</label>
            <input type="number" name="horaEntrada" value="${vehiculo.horaEntrada}" class="form-control" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Hora de salida</label>
            <input type="number" name="horaSalida" value="${vehiculo.horaSalida}" class="form-control" />
        </div>

        <div class="mb-3">
            <label class="form-label">Ubicación</label>
            <input type="text" name="ubicacion" value="${vehiculo.ubicacion}" class="form-control" required />
        </div>

        <div class="mb-3">
            <label class="form-label">Tipo de vehículo</label>
            <input type="text" name="tipoVehiculo" value="${vehiculo.tipoVehiculo}" class="form-control" required />
        </div>

        <button type="submit" class="btn btn-success">Guardar</button>
        <a href="/vehiculos/listar" class="btn btn-secondary">Cancelar</a>
    </form>
</div>
</body>
</html>

package co.edu.usco.pw.springboot_crud01.controller;

import co.edu.usco.pw.springboot_crud01.model.Todo;
import co.edu.usco.pw.springboot_crud01.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private TodoRepository todoRepository;

    // ✅ Página principal del administrador
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);
        return "admin-dashboard"; // JSP: /WEB-INF/jsp/admin-dashboard.jsp
    }

    // ✅ Mostrar formulario para registrar vehículo
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("todo", new Todo());
        return "admin-form"; // JSP: /WEB-INF/jsp/admin-form.jsp
    }

    // ✅ Guardar nuevo vehículo
    @PostMapping("/guardar")
    public String guardarVehiculo(@ModelAttribute("todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/admin/dashboard";
    }

    // ✅ Editar vehículo (hora salida o ubicación)
    @GetMapping("/editar/{id}")
    public String editarVehiculo(@PathVariable Long id, Model model) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if (optionalTodo.isPresent()) {
            model.addAttribute("todo", optionalTodo.get());
            return "admin-form";
        } else {
            return "redirect:/admin/dashboard";
        }
    }

    // ✅ Eliminar vehículo
    @GetMapping("/eliminar/{id}")
    public String eliminarVehiculo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/admin/dashboard";
    }
}

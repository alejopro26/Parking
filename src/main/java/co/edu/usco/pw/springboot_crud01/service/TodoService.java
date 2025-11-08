package co.edu.usco.pw.springboot_crud01.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Todo;
import co.edu.usco.pw.springboot_crud01.repository.TodoRepository;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
    }


    @Override
    public void addTodo(String userName, String plate, int entryHour, int exitHour, String location, String vehicleType){

    Todo todo = new Todo();
        todo.setUserName(userName);
        todo.setPlate(plate);
        todo.setEntryHour(entryHour);
        todo.setExitHour(exitHour);
        todo.setLocation(location);
        todo.setVehicleType(vehicleType);
        todoRepository.save(todo);
    }


    @Override
    public void deleteTodo(long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        todo.ifPresent(todoRepository::delete);
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }
}
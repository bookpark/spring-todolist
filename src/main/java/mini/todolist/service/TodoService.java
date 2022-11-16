package mini.todolist.service;

import lombok.RequiredArgsConstructor;
import mini.todolist.domain.Todo;
import mini.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getTodoList() {
        return this.todoRepository.findAll();
    }

    public void insertTodo(String todoName) {
        Todo todo = new Todo();
        todo.setTodoName(todoName);
        this.todoRepository.save(todo);
    }
}
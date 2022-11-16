package mini.todolist.service;

import lombok.RequiredArgsConstructor;
import mini.todolist.domain.Todo;
import mini.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> getTodoList() {
        return this.todoRepository.findAll();
    }

    public void createTodo(String todoName) {
        Todo todo = new Todo();
        todo.setTodoName(todoName);
        todo.setCompleted(Boolean.FALSE);
        this.todoRepository.save(todo);
    }

    @Transactional
    public void deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이템이 없습니다. id=" + id)
        );
        this.todoRepository.delete(todo);
    }
}
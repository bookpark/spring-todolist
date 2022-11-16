package mini.todolist.service;

import lombok.RequiredArgsConstructor;
import mini.todolist.domain.Todo;
import mini.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> getTodos(Sort sort) throws Exception {
        return todoRepository.findAll();
    }

    @Override
    public void postTodo(Todo todo) throws Exception {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) throws Exception {
        todoRepository.deleteById(id);
    }

    @Override
    public Todo findTodoById(Long id) throws Exception {
        return todoRepository.findById(id).orElse(new Todo());
    }

}
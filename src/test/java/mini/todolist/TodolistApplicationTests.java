package mini.todolist;

import mini.todolist.domain.Todo;
import mini.todolist.repository.TodoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodolistApplicationTests {

	@Autowired
	private TodoRepository todoRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testJpa() {
		Todo todo1 = new Todo();
		todo1.setContent("스프링 공부");
		todo1.setIsComplete(Boolean.FALSE);
		this.todoRepository.save(todo1);

		Todo todo2 = new Todo();
		todo2.setContent("리액트 공부");
		todo2.setIsComplete(Boolean.FALSE);
		this.todoRepository.save(todo2);
	}

}

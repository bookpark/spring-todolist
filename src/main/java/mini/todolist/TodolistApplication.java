package mini.todolist;

import mini.todolist.domain.Todo;
import mini.todolist.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner runner(TodoRepository todoRepository) throws Exception {
//		return (args) -> {
//			IntStream.rangeClosed(1, 10).forEach(index -> todoRepository.save(Todo.builder()
//					.content("스프링 공부" + index)
//					.isComplete(false)
//					.build())
//			);
//		};
//	}

}

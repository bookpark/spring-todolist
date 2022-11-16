package mini.todolist.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class Todo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String content;

    @Column(nullable = false)
    private Boolean isComplete;

    @Builder
    public Todo(Long id, String content, Boolean isComplete) {
        this.id = id;
        this.content = content;
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id +
                ", content=" + content +
                ", isComplete=" + isComplete + "]";
    }
}

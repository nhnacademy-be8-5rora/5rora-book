package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}

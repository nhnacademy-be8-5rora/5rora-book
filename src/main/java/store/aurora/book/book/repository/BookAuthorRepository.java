package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.BookAuthor;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {}


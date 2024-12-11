package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.Book;
import store.aurora.book.book.entity.Publisher;

import java.time.LocalDate;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByTitleAndPublisherAndPublishDate(String title, Publisher publisher, LocalDate publishDate);

}

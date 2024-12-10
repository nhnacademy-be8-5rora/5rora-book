package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.BookTag;

public interface BookTagRepository extends JpaRepository<BookTag, Long> {}


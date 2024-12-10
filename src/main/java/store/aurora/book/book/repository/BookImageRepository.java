package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.BookImage;

public interface BookImageRepository extends JpaRepository<BookImage, Long> {}

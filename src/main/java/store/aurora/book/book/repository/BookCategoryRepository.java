package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, String> {}


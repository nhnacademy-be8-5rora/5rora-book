package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}


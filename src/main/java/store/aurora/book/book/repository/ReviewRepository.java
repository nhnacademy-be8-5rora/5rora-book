package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {}

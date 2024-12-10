package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.ReviewImage;

public interface ReviewImageRepository extends JpaRepository<ReviewImage, Long> {}


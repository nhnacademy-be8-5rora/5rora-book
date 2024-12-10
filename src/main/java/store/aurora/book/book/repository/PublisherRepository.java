package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {}


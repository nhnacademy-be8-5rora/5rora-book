package store.aurora.book.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import store.aurora.book.book.entity.StorageInfo;

public interface StorageInfoRepository extends JpaRepository<StorageInfo, Long> {}


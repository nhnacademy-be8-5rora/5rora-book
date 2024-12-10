package store.aurora.book.book.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.aurora.book.book.repository.BookTagRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class BookTagService {
    private final BookTagRepository bookTagRepository;
}

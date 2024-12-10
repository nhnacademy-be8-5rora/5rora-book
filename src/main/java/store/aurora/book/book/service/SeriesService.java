package store.aurora.book.book.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.aurora.book.book.repository.SeriesRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class SeriesService {
    private final SeriesRepository seriesRepository;
}

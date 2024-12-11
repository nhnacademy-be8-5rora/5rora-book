package store.aurora.book.book.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.aurora.book.book.entity.Series;
import store.aurora.book.book.repository.SeriesRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class SeriesService {
    private final SeriesRepository seriesRepository;

    public Series findOrCreateSeries(String seriesName) {
        if (seriesName == null || seriesName.isEmpty()) {
            return null;
        }

        return seriesRepository.findByName(seriesName)
                .orElseGet(() -> {
                    Series newSeries = new Series();
                    newSeries.setName(seriesName);
                    return seriesRepository.save(newSeries);
                });
    }
}

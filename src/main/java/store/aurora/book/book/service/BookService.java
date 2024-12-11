package store.aurora.book.book.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import store.aurora.book.book.dto.BookRequestDTO;
import store.aurora.book.book.entity.Book;
import store.aurora.book.book.entity.Publisher;
import store.aurora.book.book.entity.Series;
import store.aurora.book.book.mapper.BookMapper;
import store.aurora.book.book.repository.BookRepository;

import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    private final PublisherService publisherService;
    private final SeriesService seriesService;

    public Book saveBookWithPublisherAndSeries(BookRequestDTO requestDTO) {
        Publisher publisher = publisherService.findOrCreatePublisher(requestDTO.getPublisherName());

        Series series = seriesService.findOrCreateSeries(requestDTO.getSeriesName());

        Optional<Book> existingBook = bookRepository.findByTitleAndPublisherAndPublishDate(
                requestDTO.getTitle(), publisher, requestDTO.getPublishDate()
        );
        if (existingBook.isPresent()) {
            throw new IllegalArgumentException("이미 등록된 책입니다.");
        }
        Book book = BookMapper.toEntity(requestDTO, publisher, series);
        return bookRepository.save(book);
    }


}

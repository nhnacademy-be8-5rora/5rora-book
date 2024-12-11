package store.aurora.book.book.mapper;

import store.aurora.book.book.dto.BookRequestDTO;
import store.aurora.book.book.dto.BookResponseDTO;
import store.aurora.book.book.entity.Book;
import store.aurora.book.book.entity.Publisher;
import store.aurora.book.book.entity.Series;

public class BookMapper {

    public static Book toEntity(BookRequestDTO dto, Publisher publisher, Series series) {
        Book book = new Book();
        book.setTitle(dto.getTitle());
        book.setRegularPrice(dto.getRegularPrice());
        book.setSalePrice(dto.getSalePrice());
        book.setPackaging(dto.getPackaging());
        book.setStock(dto.getStock());
        book.setExplanation(dto.getExplanation());
        book.setContents(dto.getContents());
        book.setIsbn(dto.getIsbn());
        book.setPublishDate(dto.getPublishDate());
        book.setSale(dto.isSale());
        book.setPublisher(publisher);
        book.setSeries(series);
        return book;
    }

    public static BookResponseDTO toDTO(Book book) {
        BookResponseDTO dto = new BookResponseDTO();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setRegularPrice(book.getRegularPrice());
        dto.setSalePrice(book.getSalePrice());
        dto.setPackaging(book.getPackaging());
        dto.setStock(book.getStock());
        dto.setExplanation(book.getExplanation());
        dto.setContents(book.getContents());
        dto.setIsbn(book.getIsbn());
        dto.setPublishDate(book.getPublishDate());
        dto.setSale(book.isSale());
        dto.setPublisherName(book.getPublisher().getName());
        if (book.getSeries() != null) {
            dto.setSeriesName(book.getSeries().getName());
        }
        return dto;
    }
}
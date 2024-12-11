package store.aurora.book.book.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import store.aurora.book.book.dto.BookRequestDTO;
import store.aurora.book.book.dto.BookResponseDTO;
import store.aurora.book.book.entity.Book;
import store.aurora.book.book.mapper.BookMapper;
import store.aurora.book.book.service.BookService;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(@RequestBody @Valid BookRequestDTO requestDTO) {
        Book savedBook = bookService.saveBookWithPublisherAndSeries(requestDTO);
        BookResponseDTO response = BookMapper.toDTO(savedBook);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
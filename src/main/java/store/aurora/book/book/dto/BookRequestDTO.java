package store.aurora.book.book.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookRequestDTO {

    @NotBlank
    private String title;

    @NotNull
    @Positive
    private int regularPrice;

    @NotNull
    @Positive
    private int salePrice;

    private Boolean packaging = false;

    private Integer stock = 100;

    @NotBlank
    private String explanation;

    private String contents;

    private String isbn;

    @NotNull
    private LocalDate publishDate;

    @NotNull
    private boolean isSale;

    @NotBlank
    private String publisherName;

    private String seriesName;
}
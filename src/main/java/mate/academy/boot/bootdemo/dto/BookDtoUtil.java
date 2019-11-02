package mate.academy.boot.bootdemo.dto;

import mate.academy.boot.bootdemo.entity.Book;

public class BookDtoUtil {

    public static Book createBookFromDto(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setYear(bookDto.getYear());
        return book;
    }
}

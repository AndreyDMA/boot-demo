package mate.academy.boot.bootdemo.service;

import java.util.List;
import java.util.Optional;

import mate.academy.boot.bootdemo.entity.Book;

public interface BookService {

    void save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    void delete(Long id);

    void update(Long id, Book book);
}

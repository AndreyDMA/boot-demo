package mate.academy.boot.bootdemo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import mate.academy.boot.bootdemo.entity.Book;
import mate.academy.boot.bootdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void update(Long id, Book book) {
        Book oldBook = findById(id).orElseThrow(()->
                new NoSuchElementException("No book with id " + id));
        oldBook = book;
        bookRepository.save(oldBook);
    }
}

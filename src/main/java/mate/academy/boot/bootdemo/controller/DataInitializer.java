package mate.academy.boot.bootdemo.controller;

import javax.annotation.PostConstruct;

import mate.academy.boot.bootdemo.entity.Book;
import mate.academy.boot.bootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    private BookService bookService;

    @PostConstruct
    public void initData() {
        saveBooks();
    }

    private void saveBooks() {
        Book kobzar = new Book("Kobzar", 2019, 100.0);
        kobzar.setDescription("This book is awesome!");
        bookService.save(kobzar);
        Book lisovaPisnya = new Book("Lisova Pisnya", 2019, 103.5);
        bookService.save(lisovaPisnya);
        Book kamenyary = new Book("Kamenyary", 2019, 152.1);
        bookService.save(kamenyary);
    }
}
